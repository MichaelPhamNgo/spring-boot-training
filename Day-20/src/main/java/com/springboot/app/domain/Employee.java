package com.bfs.springdataaccess.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eid")
    private Integer eid;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email")
    private String email;

    public Integer getId() {
        return eid;
    }

    public void setId(Integer eid) {
        this.eid = eid;
    }

//    public Integer getEid() {
//        return eid;
//    }
//
//    public void setEid(Integer eid) {
//        this.eid = eid;
//    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "eid: " + getId()+ "\n" +
                "First Name: " + getFirstname() + "\n" +
                "Last Name: " + getLastname() + "\n" +
                "Email: " + getEmail() + "\n";
    }
}
