import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AddressBookController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/addressbook")
    public AddressBook addressBook(){
        AddressBook book = new AddressBook(counter.incrementAndGet());
        return book;
    }
    @GetMapping("/addressbook/buddy")
    public String addBuddy(@RequestParam(value = "name") String name, @RequestParam(value = "phoneNumber") String phoneNumber){
        return "";
    }



}
