package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter

public class RedCrescent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long redCID;
    private String area;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Donation> donations;




    public RedCrescent(Long redCID, String area, Set<Donation> donations) {
        this.redCID = redCID;
        this.area = area;
        this.donations = donations;
    }
    public RedCrescent() {}
    public Long getRedCID() { return redCID; }
    public String getArea() { return area; }
    public Set<Donation> getDonations() { return donations; }
    public void setRedCID(Long redCID) { this.redCID = redCID; }
    public void setArea(String area) { this.area = area; }
    public void setDonations(Set<Donation> donations) {
        this.donations = donations;
    }
}
