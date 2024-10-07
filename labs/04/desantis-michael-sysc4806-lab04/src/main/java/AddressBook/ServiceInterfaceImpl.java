package AddressBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceInterfaceImpl implements ServiceInterface {

    @Autowired
    private AddressBookRepository addressBookRepository;

    public ServiceInterfaceImpl(AddressBookRepository addressBookRepository) {
        this.addressBookRepository = addressBookRepository;
    }

    @Override
    public AddressBook saveAddressBook(AddressBook addressBook) {
        return addressBookRepository.save(addressBook);
    }

    @Override
    public AddressBook fetchAddressBook(String name) {
        return addressBookRepository.findByName(name);
    }

    @Override
    public List<AddressBook> fetchAddressBooks() {
        return (List<AddressBook>) addressBookRepository.findAll();
    }
}
