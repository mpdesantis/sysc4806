package AddressBook;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Class BuddyInfo, which models a simple contact in an AddressBook.
 *
 * @author M. De Santis
 * @version 20240922
 */
@Entity
public class BuddyInfo {


    /* Instance Variables */
    // Persistence ID
    @Id
    @GeneratedValue
    private Integer id = null;
    private String name;
    private String number;

    private static String DELIMITER = "#";

    /* Constructors */

    /**
     * Parametric constructor for BuddyInfo class. 
     *
     * @param name This buddy's name.
     * @param number This buddy's number.
     */
    public BuddyInfo(String name, String number) {
        this();
        this.name = name;
        this.number = number;
        this.id = null;
    }

    /**
     * Default constructor for BuddyInfo class. 
     *
     */
    public BuddyInfo() {
        String defaultName = "Some Buddy";
        String defaultNumber = "123456789";
        this.name = defaultName;
        this.number = defaultNumber;
        this.id = null;
    }


   /* METHODS */

    /**
     * Getter for BuddyInfo ID.
     *
     * @return name BuddyInfo ID.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for BuddyInfo ID.
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * Getter for BuddyInfo name.
     *
     * @return name This buddy's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for BuddyInfo number.
     *
     * @return number This buddy's number.
     */
    public String getNumber() {
        return number;
    }


    /**
     * Print a BuddyInfo.
     *
     * @return void
     */
    public void printBuddyInfo() {
        
        System.out.println("\tBuddy Name: " + this.getName());
        System.out.println("\tBuddy Number: " + this.getNumber());

        return;
    }


}
