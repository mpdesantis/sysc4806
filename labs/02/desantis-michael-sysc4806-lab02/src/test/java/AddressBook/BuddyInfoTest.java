package AddressBook;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class BuddyInfoTest, which tests the BuddyInfo class.
 *
 * @author M. De Santis
 * @version 20240922
 */
public class BuddyInfoTest {

    /* Test Cases */

    /**
     * Test default and parametric constructors of BuddyInfo.
     */
    @Test
    public void testBuddyInfo() {

        // Test default constructor
        BuddyInfo b1 = new BuddyInfo();
        assertEquals(b1.getName(), "Some Buddy");
        assertEquals(b1.getNumber(), "123456789");

        // Test parametric constructor
        BuddyInfo b2 = new BuddyInfo("Darlene Dragonberry", "9876543");
        assertEquals(b2.getName(), "Darlene Dragonberry");
        assertEquals(b2.getNumber(), "9876543");

        System.out.println("testBuddyInfo(): PASS");
    }

    /**
     * Test persistence.
     */
    @Test
    public void testPersistence() {

        // Add some BuddyInfos
        BuddyInfo dannyDelicious = new BuddyInfo("Danny Delicious", "5551234");

        // Connecting to the database through EntityManagerFactory
        // connection details loaded from persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BuddyBookPU");

        EntityManager em = emf.createEntityManager();

        // Create a new transaction
        EntityTransaction tx = em.getTransaction();

        // Begin the new transaction
        tx.begin();

        // Persist the BuddyBook entity object
        em.persist(dannyDelicious);

        // Commit the transaction
        tx.commit();

        // Close the EntityManager
        em.close();

        System.out.println("testPersistence(): PASS");
    }



}
