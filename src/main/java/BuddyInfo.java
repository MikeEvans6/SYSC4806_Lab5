import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class BuddyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String phonenumber;

    public BuddyInfo(){

    }
    public BuddyInfo(String n, String pN){
        this.name = n;
        this.phonenumber = pN;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getPhonenumber(){
        return this.phonenumber;
    }
    public void setPhonenumber(String pN){
        this.phonenumber = pN;
    }
    @Override
    public String toString() {
        return "Name: " + name + '\'' +
                ", Phonenumber: " + phonenumber + '\'' +
                ", Id: " + this.id +'\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuddyInfo buddyInfo = (BuddyInfo) o;
        return Objects.equals(name, buddyInfo.name) && Objects.equals(phonenumber, buddyInfo.phonenumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phonenumber);
    }
}
