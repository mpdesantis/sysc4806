package AddressBook;

import jakarta.persistence.*;

/**
 * Class BuddyInfo, which models a simple contact in an AddressBook.
 *
 * @author M. De Santis
 * @version 20240922
 */
@Entity
public class BuddyInfo {


    /* Instance Variables */
    @Id
    @GeneratedValue
    private Integer id = null;
    private String fullName;
    private String number;

    /* Constructors */

    /**
     * Parametric constructor for BuddyInfo class. 
     *
     * @param name This buddy's name.
     * @param number This buddy's number.
     */
    public BuddyInfo(String name, String number) {
        this();
        this.fullName = name;
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
        this.fullName = defaultName;
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
        return fullName;
    }

    public void setName(String name) { this.fullName = name; }

    public void setNumber(String number) { this.number = number; }

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

        System.out.println("\tBuddy Name: " + this.getFullName());
        System.out.println("\tBuddy Number: " + this.getNumber());
        System.out.println("\t(id): " + this.getId());

        return;
    }

    /**
     * Stringify BuddyInfo.
     *
     * @return void
     */
    public String toString() {
        return "Buddy (ID " + this.getId() + "): " + this.getFullName() + " - " + this.getNumber();
    }

    public String getFullName() {
        return this.fullName;
    }
}
