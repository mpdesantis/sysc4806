package AddressBook;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Class AddressBookTest, which tests the AddressBook class.
 *
 * @author M. De Santis
 * @version 20240922
 */
public class AddressBookTest {

    /* Variables */
    AddressBook a1;
    BuddyInfo arthurAvocado;
    BuddyInfo brettBanana;
    BuddyInfo carlaCranberry;
    AddressBook a2;
    BuddyInfo dannyDill;
    BuddyInfo edwardEggplant;
    BuddyInfo freddyFiddlehead;
    AddressBook a3;
    BuddyInfo gildaGreenbean;
    BuddyInfo harryHabanero;
    BuddyInfo iggyImbe;

    /* Set Up */
    @Before
    public void setUp() {

        // AddressBook a1
        this.a1 = new AddressBook("Test AddressBook 1");
        this.arthurAvocado = new BuddyInfo("Arthur Avocado", "1234567");
        this.brettBanana = new BuddyInfo("Brett Banana", "1112323");
        this.carlaCranberry = new BuddyInfo("Carla Cranberry", "6669999");

        // AddressBook a2
        this.a2 = new AddressBook("Test AddressBook 2");
        this.dannyDill = new BuddyInfo("Danny Dill", "1238934");
        this.edwardEggplant = new BuddyInfo("Edward Eggplant", "1112366");
        this.freddyFiddlehead = new BuddyInfo("Freddy Fiddlehead", "8887654");

        // AddressBook a3
        this.a3 = new AddressBook("Test AddressBook 3");
        this.gildaGreenbean = new BuddyInfo("Gilda Greenbean", "1238934");
        this.harryHabanero = new BuddyInfo("Harry Habanero", "1112366");
        this.iggyImbe = new BuddyInfo("Iggy Imbe", "8887654");
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
    public void testPersistence1() {

		// Connecting to the database through EntityManagerFactory
		// connection details loaded from persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BuddyBookPU");

		EntityManager em = emf.createEntityManager();

        // Transaction
        EntityTransaction tx;

        /* TRANSACTION */
        // Persist some BuddyInfos

		// Create a new transaction
		tx = em.getTransaction();

        // Begin the new transaction
		tx.begin();

        // Persist the BuddyInfo entity objects
        em.persist(arthurAvocado);
        em.persist(brettBanana);
        em.persist(carlaCranberry);
        em.persist(dannyDill);
        em.persist(edwardEggplant);
        em.persist(freddyFiddlehead);

        // Commit the transaction
		tx.commit();

        /* QUERY */
        // Query DB with JPQL query
        // Return all BuddyInfo objects
        Query q = em.createQuery("SELECT b FROM BuddyInfo b");

        @SuppressWarnings("unchecked")
        List<BuddyInfo> results = q.getResultList();
        // Check list size
        assertEquals(results.size(), 6);

        // Print results of query
        System.out.println("\nList of BuddyInfos:\n------------------");
        for (BuddyInfo b: results) {
            b.printBuddyInfo();
        }
        System.out.println();

        // Add the BuddyInfos to different AddressBook
        // AddressBook a1:
        a1.addBuddy(arthurAvocado);
        a1.addBuddy(brettBanana);
        a1.addBuddy(carlaCranberry);
        // AddressBook a2:
        a2.addBuddy(dannyDill);
        a2.addBuddy(edwardEggplant);
        a2.addBuddy(freddyFiddlehead);

        /* TRANSACTION */
        // Persist the AddressBook entity objects
        tx.begin();
        em.persist(a1);
        em.persist(a2);
        tx.commit();

        /* QUERY */
        // Query DB with JPQL query
        // Return all BuddyInfo objects
        q = em.createQuery("SELECT a FROM AddressBook a");

        @SuppressWarnings("unchecked")
        List<AddressBook> abResults = q.getResultList();
        // Check list size
        assertEquals(abResults.size(), 2);

        // Print results of query
        System.out.println("\nAddressBooks:\n------------");
        for (AddressBook ab: abResults) {

            // Print the AddressBook contents using class method
            // ab.printBuddies();

            // Print the AddressBook contents using the OneToMany relationship annotation with method `getBuddies()`
            System.out.println("AddressBook: " + ab.getName() + "\n----------------");
            // Test the OneToMany relationship annotation
            // with the `getBuddies()` method
            for (BuddyInfo b: ab.getBuddies()) {
                b.printBuddyInfo();
            }
        }
        System.out.println();


        // Test AddressBook.getBuddies() with ManyToOne annotation
        a1.getBuddies();

        // Test cascading persistence after adding BuddyInfos
        // to AddressBook and then only persisting the AddressBook

        // AddressBook a3:
        a3.addBuddy(gildaGreenbean);
        a3.addBuddy(harryHabanero);
        a3.addBuddy(iggyImbe);

        /* TRANSACTION */
        // Persist the AddressBook entity objects, and cascade
        // the
        tx.begin();
        em.persist(a3);
        tx.commit();

        /* QUERY */
        // Query DB with JPQL query
        // Return all BuddyInfo objects
        q = em.createQuery("SELECT a FROM AddressBook a WHERE a.name='Test AddressBook 3'");

        @SuppressWarnings("unchecked")
        List<AddressBook> ab3Results = q.getResultList();
        // Check list size
        assertEquals(ab3Results.size(), 1);

        // Print results of query
        System.out.println("\nAddressBooks:\n------------");
        for (AddressBook ab: ab3Results) {
            // Print the AddressBook contents using class method
            ab.printBuddies();
        }
        System.out.println();

        /* CLEANUP */

        // Close the EntityManagerFactory
        // N.B. This errors out if we close both the em and emf,
        // so just close the em.
        //emf.close();

        // Close the EntityManager
        em.close();

        System.out.println("testPersistence(): PASS");

    }

}
