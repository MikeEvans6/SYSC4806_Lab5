package App;

import App.AddressBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "addressbook", path = "addressbook")
public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {
    List<AddressBook> findALl();
}
