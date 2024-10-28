package AddressBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AddressBookJpaApplication {


    /* MAIN */
    public static void main(String[] args) {
        SpringApplication.run(AddressBookJpaApplication.class, args);
    }

    /* METHODS */
    private static final Logger log = LoggerFactory.getLogger(AddressBookJpaApplication.class);

    /**
     * Demo: BuddyInfoRepository
     * @param repository
     * @return
     */
    @Bean
    public CommandLineRunner BuddyInfoRepositoryDemo(BuddyInfoRepository repository) {
    return (args) -> {

        // save a few BuddyInfos
        repository.save(new BuddyInfo("Arthur Avocado", "1234567"));
        repository.save(new BuddyInfo("Brett Banana", "1112323"));
        repository.save(new BuddyInfo("Carla Cranberry", "6669999"));

        // fetch all buddyInfos
        log.info("BuddyInfos found with findAll():");
        log.info("-------------------------------");
        repository.findAll().forEach(b1 -> {
            log.info(b1.toString());
            });
        log.info("");

        // fetch an individual buddyInfo by ID
        log.info("BuddyInfo found with findById(1):");
        log.info("--------------------------------");
        BuddyInfo buddyInfo = repository.findById(1);
        log.info(buddyInfo.toString());
        log.info("");

        // fetch buddyInfos by number
        log.info("BuddyInfo found with findByName('Arthur Avocado'):");
        log.info("--------------------------------------------");
        repository.findByFullName("Arthur Avocado").forEach(b2 -> {
            log.info(b2.toString());
        });
        log.info("");
        };
    }

    /**
     * Demo: AddressBookRepository
     * @param repository
     * @return
     */
    @Bean
    public CommandLineRunner AddressBookRepositoryDemo(AddressBookRepository repository) {
        return (args) -> {

            /* DEMONSTRATION ONLY */

            // Create AddressBook
            //AddressBook a1 = new AddressBook("My Persistent AddressBook");

            // Add some BuddyInfos to AddressBook
            //a1.addBuddy(new BuddyInfo("Jimmy Juniper", "1234567"));
            //a1.addBuddy(new BuddyInfo("Kitty Kiwi", "1112323"));
            //a1.addBuddy(new BuddyInfo("Larry Lime", "6669999"));

            // Persist the AddressBook, recursively (cascadingly) persisting BuddyInfos
            //repository.save(a1);
            //log.info("AddressBookRepository has been saved.");

            // Find by name
            //AddressBook a2 = repository.findByName("My Persistent AddressBook");
            //log.info(a2.toString());

            // Find by ID
            //AddressBook a3 = repository.findById(1);
            //log.info(a3.toString());

        };
    }

}
