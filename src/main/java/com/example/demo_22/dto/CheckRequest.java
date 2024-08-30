package com.example.demo_22.dto;

import java.time.ZonedDateTime;

public class CheckRequest {
    private ZonedDateTime transactionDate;
    private String referenceNumber;
    private int amount;

    // Getters and Setters
    public ZonedDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(ZonedDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
