package AddressBook;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Class that models a repository for AddressBook entities.
 */
public interface AddressBookRepository extends CrudRepository<AddressBook, Integer> {

    /* Methods */
    List<AddressBook> findByName(String name);
    AddressBook findById(int id);

}
