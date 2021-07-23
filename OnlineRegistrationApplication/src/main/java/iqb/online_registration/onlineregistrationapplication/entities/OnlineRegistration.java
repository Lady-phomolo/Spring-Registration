package iqb.online_registration.onlineregistrationapplication.entities;


import javax.persistence.*;

@Entity
@Table(name= "registration")
public class OnlineRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reg_id")
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="id_number")
    private Long idNumber;

    @Column(name="Telephone")
    private String telNumber;

    public OnlineRegistration(){}

    public OnlineRegistration(Long id, String firstName, String surname, Long idNumber, String telNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.telNumber = telNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String toString(){

        return "OnlineRegistration{"+
                "id=" + id +
                ", firstName='" + firstName +'\''+
                ",lastName' "+ lastName + '\''+
                ",idNumber" + idNumber +'\''+
                ",telNumber" + telNumber + '\''+
                '}';
    }
}
