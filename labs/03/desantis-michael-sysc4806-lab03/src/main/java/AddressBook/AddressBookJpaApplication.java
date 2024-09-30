package AddressBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AddressBookJpaApplication {


    /* MAIN */
    public static void main(String[] args) {
        SpringApplication.run(AddressBookJpaApplication.class, args);
    }

    /* METHODS */
    private static final Logger log = LoggerFactory.getLogger(AddressBookJpaApplication.class);

    @Bean
    public CommandLineRunner demo(BuddyInfoRepository repository) {
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
        log.info("BuddyInfo found with findById(2):");
        log.info("--------------------------------");
        BuddyInfo buddyInfo = repository.findById(2);
        log.info(buddyInfo.toString());
        log.info("");

        // fetch buddyInfos by number
        log.info("BuddyInfo found with findByName('Arthur Avocado'):");
        log.info("--------------------------------------------");
        repository.findByName("Arthur Avocado").forEach(b2 -> {
            log.info(b2.toString());
        });
        log.info("");
        };
    }

    }