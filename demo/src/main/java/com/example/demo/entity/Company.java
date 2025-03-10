package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyID;
    private String companyName;
    private String address;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    @ToString.Exclude
    @JsonIgnore
    private List<Employee> employees;

    public Company(Long companyID, String companyName, String address, List<Employee> employees) {
        this.companyID = companyID;
        this.companyName = companyName;
        this.address = address;
        this.employees = employees;
    }
    public Company() {}
    public Long getCompanyID() { return companyID; }
    public String getCompanyName() { return companyName; }
    public String getAddress() { return address; }
    public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) { this.employees = employees; }
    public void setCompanyID(Long companyID) { this.companyID = companyID; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public void setAddress(String address) { this.address = address; }
}
