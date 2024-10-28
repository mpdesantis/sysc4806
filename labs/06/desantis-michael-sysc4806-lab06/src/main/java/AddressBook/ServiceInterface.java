package AddressBook;

import java.util.List;

public interface ServiceInterface {
    AddressBook saveAddressBook(AddressBook addressBook);

    AddressBook fetchAddressBookById(int id);

    List<AddressBook> fetchAddressBooks();
    AddressBook fetchAddressBook(String name);
}
