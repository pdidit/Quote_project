package com.quatation.quote.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Quote {
    @Id
    @GeneratedValue
    private Integer ID;

    @OneToOne
    private Client client;

    @Column
    private String quoteAddressFirstLine;

    @Column
    private String quoteAddressSecondLine;

    @Column
    private String quoteAddressThirdLine;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Job> jobs;

    @Column
    private Double quoteTotal;

    @Column
    private String comments;

    public Quote(Integer ID, Client client, String quoteAddressFirstLine, String quoteAddressSecondLine, String quoteAddressThirdLine, List<Job> jobs, Double quoteTotal, String comments) {
        this.ID = ID;
        this.client = client;
        this.quoteAddressFirstLine = quoteAddressFirstLine;
        this.quoteAddressSecondLine = quoteAddressSecondLine;
        this.quoteAddressThirdLine = quoteAddressThirdLine;
        this.jobs = jobs;
        this.quoteTotal = quoteTotal;
        this.comments = comments;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getQuoteAddressFirstLine() {
        return quoteAddressFirstLine;
    }

    public void setQuoteAddressFirstLine(String quoteAddressFirstLine) {
        this.quoteAddressFirstLine = quoteAddressFirstLine;
    }

    public String getQuoteAddressSecondLine() {
        return quoteAddressSecondLine;
    }

    public void setQuoteAddressSecondLine(String quoteAddressSecondLine) {
        this.quoteAddressSecondLine = quoteAddressSecondLine;
    }

    public String getQuoteAddressThirdLine() {
        return quoteAddressThirdLine;
    }

    public void setQuoteAddressThirdLine(String quoteAddressThirdLine) {
        this.quoteAddressThirdLine = quoteAddressThirdLine;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public Double getQuoteTotal() {
        return quoteTotal;
    }

    public void setQuoteTotal(Double quoteTotal) {
        this.quoteTotal = quoteTotal;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
