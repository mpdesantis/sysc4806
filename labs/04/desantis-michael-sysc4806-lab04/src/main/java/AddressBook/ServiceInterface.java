package AddressBook;

import java.util.List;

public interface ServiceInterface {
    AddressBook saveAddressBook(AddressBook addressBook);
    List<AddressBook> fetchAddressBooks();
    AddressBook fetchAddressBook(String name);
}
