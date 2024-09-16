package AddressBook;

public class BuddyInfo {

    /* Instance Variables */
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
    }


   /* METHODS */

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
     * @param buddy The buddy to print info for.
     * @return void
     */
    public void printBuddyInfo() {
        
        System.out.println("\tBuddy Name: " + this.getName());
        System.out.println("\tBuddy Number: " + this.getNumber());

        return;
    }

    /**
     * Serialize a string according to lab manual.
     *
     * @param buddy The buddy to stringify.
     * @return void
     */
    public String toString() {
        return this.getName() + DELIMITER + this.getNumber() + DELIMITER;
    }



}
