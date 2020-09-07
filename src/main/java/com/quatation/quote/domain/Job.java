package com.quatation.quote.domain;

import javax.persistence.*;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer ID;

    @Column
    private String jobTitle;

    @Column
    private double jobPrice;

    @Column
    private String description;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getJobPrice() {
        return jobPrice;
    }

    public void setJobPrice(double jobPrice) {
        this.jobPrice = jobPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
