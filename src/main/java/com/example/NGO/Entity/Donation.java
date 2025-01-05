package com.example.NGO.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Donation_table")
public class Donation {
    @Id
    private String donationId;
    @Column
    private String doner_email;
    @Column
    private Integer amount;
    @Column
    private String receiver_email;

    @Column
    private Object[] response;

    public String getDonationId() {
        return donationId;
    }

    public void setDonationId(String donationId) {
        this.donationId = donationId;
    }



    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Object[] getResponse() {
        return response;
    }

    public void setResponse(Object[] response) {
        this.response = response;
    }

    public String getDoner_email() {

        return doner_email;
    }

    public void setDoner_email(String doner_email) {
        this.doner_email = doner_email;
    }

    public String getReceiver_email() {
        return receiver_email;
    }

    public void setReceiver_email(String receiver_email) {
        this.receiver_email = receiver_email;
    }
}
