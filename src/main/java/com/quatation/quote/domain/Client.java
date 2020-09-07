package com.quatation.quote.domain;


import javax.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CLIENT")
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer ID;

    @Column
    @NotNull(message = "client.missing.first.name")
    private String firstName;

    @Column
    @NotNull(message = "client.missing.surname")
    private String lastName;

    @Column
    private String firstLineAddress;

    @Column
    private String secondLineAddress;

    @Column
    private String thirdLineAddress;

    @Column
    @NotNull(message = "client.missing.eircode")
    private String eircode;

    @Column
    @NotNull(message = "client.missing.phone.number")
    private Integer phoneNumber;

    @Column
    @NotNull(message = "client.missing.email")
    @Email
    private String email;

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getEircode() {
        return eircode;
    }

    public void setEircode(String eircode) {
        this.eircode = eircode;
    }

    public String getThirdLineAddress() {
        return thirdLineAddress;
    }

    public void setThirdLineAddress(String thirdLineAddress) {
        this.thirdLineAddress = thirdLineAddress;
    }

    public String getSecondLineAddress() {
        return secondLineAddress;
    }

    public void setSecondLineAddress(String secondLineAddress) {
        this.secondLineAddress = secondLineAddress;
    }

    public String getFirstLineAddress() {
        return firstLineAddress;
    }

    public void setFirstLineAddress(String firstLineAddress) {
        this.firstLineAddress = firstLineAddress;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
