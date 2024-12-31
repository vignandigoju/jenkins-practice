package com.ust.jenkins_practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    Long empolyeeId;
    String name;
    String phoneNo;
    String emailId;

    public Long getEmpolyeeId() {
        return empolyeeId;
    }

    public void setEmpolyeeId(Long empolyeeId) {
        this.empolyeeId = empolyeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Employee(String emailId, String phoneNo, String name, Long empolyeeId) {
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        this.name = name;
        this.empolyeeId = empolyeeId;
    }

    public Employee() {
    }
}
