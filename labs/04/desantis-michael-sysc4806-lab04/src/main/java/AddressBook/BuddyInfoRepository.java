package AddressBook;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Class that models a repository for BuddyInfo entities.
 */
public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Integer> {

    /* Methods */
    List<BuddyInfo> findByName(String name);
    BuddyInfo findById(int id);

}
