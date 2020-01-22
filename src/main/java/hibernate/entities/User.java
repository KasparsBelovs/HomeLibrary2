package hibernate.entities;



import javax.persistence.*;

@Entity
@Table(name = "hlusers")
public class User {

    @Id
    @Column (name = "User_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column (name = "First_name")
    private String firstName;

    @Column (name = "Last_name")
    private String lastName;

    @Column (name = "Phone")
    private String phone;

    @Column (name = "Email")
    private String email;

    @Column (name = "Address")
    private String address;

    @Column (name = "NrInList")
    private int nrInList;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNrInList() {
        return nrInList;
    }

    public void setNrInList(int nrInList) {
        this.nrInList = nrInList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", nrInList='" + nrInList + '\'' +
                '}';
    }
}
