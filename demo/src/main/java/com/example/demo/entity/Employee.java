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
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeID;
    private String lastName;
    private String firstName;
    private String position;

    @ManyToOne (cascade = CascadeType.ALL)
   // @JoinColumn(name = "companyID")
    private Company company;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    @ToString.Exclude
    @JsonIgnore
    private List<Donation> donations;

    public Employee() {}
    public Employee(Long employeeID, String lastName, String firstName, String position, Company company, List<Donation> donations) {
        this.employeeID = employeeID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.company = company;
        this.donations = donations;
    }
    public Long getEmployeeID() { return employeeID; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getPosition() { return position; }
    public Company getCompany() { return company; }
    public List<Donation> getDonations() { return donations; }
    public void setEmployeeID(Long employeeID) { this.employeeID = employeeID; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setPosition(String position) { this.position = position; }
    public void setCompany(Company company) { this.company = company; }
    public void setDonations(List<Donation> donations) { this.donations = donations; }
}
