package iqb.online_registration.onlineregistrationapplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


public class OnlineRegistrationModel{

    @JsonProperty("reg_id")
    private Long id;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("id_number")
    private Long idNumber;

    @JsonProperty("telephone")
    private String telNumber;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public OnlineRegistrationModel() { }

    public OnlineRegistrationModel(Long id, String firstName, String lastName, Long idNumber, String telNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.telNumber = telNumber;
    }

    @Override
    public String toString(){

        return "OnlineRegistration{"+
                "id=" + id +
                ", name='" + firstName +'\''+
                ",surname' "+ lastName + '\''+
                ",idNumber" + idNumber +'\''+
                ",telNumber" + telNumber + '\''+
                '}';
    }

}
