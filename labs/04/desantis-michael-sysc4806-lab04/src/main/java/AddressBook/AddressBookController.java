package AddressBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class AddressBookController {

	private final ServiceInterface serviceInterface;

	@Autowired
	public AddressBookController(ServiceInterface serviceInterface) {
		AddressBook ab1 = new AddressBook("MyAddressBook");
		ab1.addBuddy(new BuddyInfo("Tina Truffle", "1234567"));
		ab1.addBuddy(new BuddyInfo("Ginny Grapefruit", "7654321"));
		ab1.addBuddy(new BuddyInfo("Peter Pumpkin", "1223451"));
		serviceInterface.saveAddressBook(ab1);
		this.serviceInterface = serviceInterface;
	}

    private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	// Greeting page from tutorial (for reference)
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	// Save
	@RequestMapping("/addressbooks")
	public String fetchAddressBook(@RequestParam(name="name", required=false, defaultValue="MyAddressBook") String name, Model model) {
		AddressBook a = serviceInterface.fetchAddressBook(name);
		model.addAttribute("name", name);
		model.addAttribute("addressBook", a);

		String contents = a.toString();
		model.addAttribute("contents", contents);

		return "addressbook";
	}


}
