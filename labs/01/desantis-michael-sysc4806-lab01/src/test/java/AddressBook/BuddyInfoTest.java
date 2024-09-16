package AddressBook;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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

}
