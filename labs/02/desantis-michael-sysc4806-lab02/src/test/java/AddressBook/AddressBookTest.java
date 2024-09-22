package AddressBook;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressBookTest {

    /* Variables */
    AddressBook a1;
    BuddyInfo arthurAvocado;
    BuddyInfo brettBanana;
    BuddyInfo carlaCranberry;

    /* Set Up */
    @Before
    public void setUp() {
        this.a1 = new AddressBook("Test AddressBook 1");
        this.arthurAvocado = new BuddyInfo("Arthur Avocado", "1234567");
        this.brettBanana = new BuddyInfo("Brett Banana", "1112323");
        this.carlaCranberry = new BuddyInfo("Carla Cranberry", "6669999");
    }

    /* Test Cases */

    /**
     * Test default and parametric constructors of AddressBook.
     */
    @Test
    public void testAddressBook() {

        // Test default constructor
        AddressBook aDefault = new AddressBook();
        assertEquals(aDefault.getName(), "AddressBook");

        // Test parametric constructor
        AddressBook aParametric = new AddressBook("Best Buddies");
        assertEquals(aParametric.getName(), "Best Buddies");

        System.out.println("testAddressBook(): PASS");
    }

    /**
     * Test adding BuddyInfos to an AddressBook.
     */
    @Test
    public void testAddBuddy() {
        assertEquals(a1.getNumBuddyInfos(), 0);
        a1.addBuddy(arthurAvocado);
        assertEquals(a1.getNumBuddyInfos(), 1);
        a1.addBuddy(brettBanana);
        assertEquals(a1.getNumBuddyInfos(), 2);
        a1.addBuddy(carlaCranberry);
        assertEquals(a1.getNumBuddyInfos(), 3);

        System.out.println("testAddBuddy(): PASS");
    }

    /**
     * Test default and parametric constructors of AddressBook.
     */
    @Test
    public void testRemoveBuddy() {

        // Add some BuddyInfos
        a1.addBuddy(arthurAvocado);
        a1.addBuddy(brettBanana);
        a1.addBuddy(carlaCranberry);

        // Remove BuddyInfos and test for removal
        assertEquals(a1.getNumBuddyInfos(), 3);
        a1.removeBuddy(2);
        assertEquals(a1.getNumBuddyInfos(), 2);
        a1.removeBuddy(1);
        assertEquals(a1.getNumBuddyInfos(), 1);
        a1.removeBuddy(0);
        assertEquals(a1.getNumBuddyInfos(), 0);

        System.out.println("testRemoveBuddy(): PASS");
    }

    /**
     * Test persistence.
     */
    @Test
    public void testPersistence() {

        // Add some BuddyInfos
        a1.addBuddy(arthurAvocado);
        a1.addBuddy(brettBanana);
        a1.addBuddy(carlaCranberry);
        BuddyInfo dannyDelicious = new BuddyInfo("Danny Delicious", "5551234");

		// Connecting to the database through EntityManagerFactory
		// connection details loaded from persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BuddyBookPU");

		EntityManager em = emf.createEntityManager();

		// Create a new transaction
		EntityTransaction tx = em.getTransaction();

        // Begin the new transaction
		tx.begin();

        // Persist the AddressBook entity object
        em.persist(a1);

		// Persist the BuddyInfo entity objects
		em.persist(arthurAvocado);
        em.persist(brettBanana);
        em.persist(carlaCranberry);

        // Commit the transaction
		tx.commit();

        System.out.println("testPersistence(): PASS");
    }

}
