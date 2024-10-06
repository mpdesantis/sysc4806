package AddressBook;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class AddressBook, which models an address book comprised of BuddyInfo objects.
 *
 * @author M. De Santis
 * @version 20240922
 */
@Entity
public class AddressBook {

    /* Constants */
    public static final int MAX_CONTACTS = 100;
    public static final String defaultName = "AddressBook";

    /* Instance Variables */
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<BuddyInfo> buddies;
    public String name;

    /* Constructors */

    /**
     * Default Constructor for AddressBook class. 
     *
     */
    public AddressBook() {

        this.name = defaultName;
        this.buddies = new ArrayList<BuddyInfo>();
        String[] buddiesList = new String[MAX_CONTACTS];

    }

    /**
     * Parametric Constructor for AddressBook class. 
     *
     * @param name This AddressBook's name.
     */
    public AddressBook(String name) {
        this();
        this.name = name;
    }

    /**
     * Accessor: Get the BuddyInfos in this AddressBook.
     *
     * @return buddies This AddressBook's ArrayList of BuddyInfos.
     */
    public List<BuddyInfo> getBuddies() {
        return buddies;
    }

    /**
     * Accessor: Get the number of BuddyInfos in this AddressBook.
     *
     * @return This AddressBook's number of BuddyInfos.
     */
    public int getNumBuddyInfos() {
        return this.buddies.size();
    }

    /**
     * Accessor: Get this AddressBook's property.
     * 
     * @return This AddressBook's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Accessor: Set this AddressBook's property.
     * 
     * @param name This AddressBook's name.
     * @return void
     */
    public void setName(String name) {
        this.name = name;
        return;
    }

    /**
     * Add a BuddyInfo to ArrayList of BuddyInfos.
     *
     * @param buddy The buddy to add to this AddressBook.
     * @return void
     */
    public void addBuddy(BuddyInfo buddy) {
        System.out.println("Adding buddy " + buddy.getName() + " to AddressBook " + this.getName() + "...");
        if (buddy != null) {
            this.buddies.add(buddy);
        }

        return;
    }

    /**
     * Remove a BuddyInfo from ArrayList of BuddyInfos.
     * 
     * @param index The index of the buddy to remove from this address book.
     * @return The BuddyInfo removed from this AddressBook if successful; null 
     * otherwise.
     */
    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddies.size()) {
            System.out.println("Removing buddy " + buddies.get(index).getName() + "...");
            return this.buddies.remove(index);
        }
        return null;
    }

    /**
     * Print all buddy information in this address book.
     * 
     * @return void
     */
    public void printBuddies() {

        System.out.println("\n**** " + this.getName() + " ****");

        int index = 0;
        for (BuddyInfo buddy : buddies) {
            System.out.println("Buddy " + (index+1) + ":");
            buddy.printBuddyInfo(); 
            index++;
        }
        return;
    }

    /**
     * Stringify all buddy information in this address book.
     *
     * @return void
     */
    public String toString() {

        String result = "";
        result += this.getName();
        result += "\n----------------------";
        for (BuddyInfo buddy : buddies) {
            result += "\n" + buddy.toString();
        }
        return result;
    }

    /**
     * Mutator: Set this AddressBook's ID.
     *
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Accessor: Get this AddressBook's ID.
     *
     * @return id This AddressBook's ID.
     */
    public Long getId() {
        return id;
    }


    /* Main */

    /**
     * Main method for AddressBook application.
     *
     */
    public static void main(String[] args) {

        // Create a new AddressBook
        AddressBook addressBook = new AddressBook("My AddressBook");

        // Create some BuddyInfos to populate the AddressBook
        BuddyInfo arthurAvocado = new BuddyInfo("Arthur Avocado", "1234567");
        BuddyInfo brettBanana = new BuddyInfo("Brett Banana", "1112323");
        BuddyInfo carlaCranberry = new BuddyInfo("Carla Cranberry", "6669999");

        // Add BuddyInfos to AddressBook
        addressBook.addBuddy(arthurAvocado);
        addressBook.addBuddy(brettBanana);
        addressBook.addBuddy(carlaCranberry);

        // Print the AddressBook
        addressBook.printBuddies();
    }

}

