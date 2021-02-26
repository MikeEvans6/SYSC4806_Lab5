package App;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BuddyInfo> buddyArray = new ArrayList<>();

    public AddressBook(){

    }
    public AddressBook(Long id) {
        this.id = id;
    }
    public void addBuddy(BuddyInfo b){

        this.buddyArray.add(b);
    }
    public void removeBuddy(BuddyInfo b){

        this.buddyArray.remove(b);
    }
    public List<BuddyInfo> getBuddyArray(){
        return this.buddyArray;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public int size(){
        return buddyArray.size();
    }
    public String toString(){
        String str = "";
        for(int i = 0; i < buddyArray.size(); i++){
            str = buddyArray.toString();
        }
        return str;
    }
}
