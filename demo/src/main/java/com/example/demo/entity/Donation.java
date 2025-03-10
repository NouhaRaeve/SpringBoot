package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long donID;
    private float amount;
    private Date date;

    @Enumerated(EnumType.STRING)
    private DonationType type;

    @ManyToOne (cascade = CascadeType.ALL)
    private Employee employee;

    @ManyToOne (cascade = CascadeType.ALL)
    private RedCrescent redCrescent;

    public Donation() {}

    public Donation(Long donID, float amount, Date date, DonationType type, Employee employee, RedCrescent redCrescent) {
        this.donID = donID;
        this.amount = amount;
        this.date = date;
        this.type = type;
        this.employee = employee;
        this.redCrescent = redCrescent;
    }
    public Long getDonID() { return donID; }
    public void setDonID(Long donID) { this.donID = donID; }
    public float getAmount() { return amount; }
    public void setAmount(float amount) { this.amount = amount; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    public DonationType getType() { return type; }
    public void setType(DonationType type) { this.type = type; }
    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }
    public RedCrescent getRedCrescent() { return redCrescent; }
    public void setRedCrescent(RedCrescent redCrescent) {this.redCrescent = redCrescent;}
}
