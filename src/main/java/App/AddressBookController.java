package App;

import App.AddressBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
public class AddressBookController {
    @Autowired
    private AddressBookRepository aRepo;

    @GetMapping("/addressbook")
    public String createAddressBook(Model model){
        model.addAttribute("App.AddressBook", new AddressBook());
        return "App.AddressBook";

    }

    @PostMapping("/addressbook")
    public String getAddressBook(@ModelAttribute AddressBook aBook, Model model){
        aRepo.save(aBook);
        model.addAttribute("App.AddressBook", aBook);
        return "result";
    }





}
