package AddressBook;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

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



}
