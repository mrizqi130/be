package com.example.demo_22.dto;

public class CheckResponse {
    private String status;
    private String message;
    private Data data;

    // Getter for status
    public String getStatus() {
        return status;
    }

    // Setter for status
    public void setStatus(String status) {
        this.status = status;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Setter for message
    public void setMessage(String message) {
        this.message = message;
    }

    // Getter for data
    public Data getData() {
        return data;
    }

    // Setter for data
    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        private String responseCode;
        private String responseMessage;
        private String beneficiaryAccountNo;
        private String beneficiaryBankCode;
        private String currency;
        private String previousResponseCode;
        private String referenceNumber;
        private String sourceAccountNo;
        private String transactionId;
        private String latestTransactionStatus;
        private String transactionStatusDesc;

        // Getter for responseCode
        public String getResponseCode() {
            return responseCode;
        }

        // Setter for responseCode
        public void setResponseCode(String responseCode) {
            this.responseCode = responseCode;
        }

        // Getter for responseMessage
        public String getResponseMessage() {
            return responseMessage;
        }

        // Setter for responseMessage
        public void setResponseMessage(String responseMessage) {
            this.responseMessage = responseMessage;
        }

        // Getter for beneficiaryAccountNo
        public String getBeneficiaryAccountNo() {
            return beneficiaryAccountNo;
        }

        // Setter for beneficiaryAccountNo
        public void setBeneficiaryAccountNo(String beneficiaryAccountNo) {
            this.beneficiaryAccountNo = beneficiaryAccountNo;
        }

        // Getter for beneficiaryBankCode
        public String getBeneficiaryBankCode() {
            return beneficiaryBankCode;
        }

        // Setter for beneficiaryBankCode
        public void setBeneficiaryBankCode(String beneficiaryBankCode) {
            this.beneficiaryBankCode = beneficiaryBankCode;
        }

        // Getter for currency
        public String getCurrency() {
            return currency;
        }

        // Setter for currency
        public void setCurrency(String currency) {
            this.currency = currency;
        }

        // Getter for previousResponseCode
        public String getPreviousResponseCode() {
            return previousResponseCode;
        }

        // Setter for previousResponseCode
        public void setPreviousResponseCode(String previousResponseCode) {
            this.previousResponseCode = previousResponseCode;
        }

        // Getter for referenceNumber
        public String getReferenceNumber() {
            return referenceNumber;
        }

        // Setter for referenceNumber
        public void setReferenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
        }

        // Getter for sourceAccountNo
        public String getSourceAccountNo() {
            return sourceAccountNo;
        }

        // Setter for sourceAccountNo
        public void setSourceAccountNo(String sourceAccountNo) {
            this.sourceAccountNo = sourceAccountNo;
        }

        // Getter for transactionId
        public String getTransactionId() {
            return transactionId;
        }

        // Setter for transactionId
        public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
        }

        // Getter for latestTransactionStatus
        public String getLatestTransactionStatus() {
            return latestTransactionStatus;
        }

        // Setter for latestTransactionStatus
        public void setLatestTransactionStatus(String latestTransactionStatus) {
            this.latestTransactionStatus = latestTransactionStatus;
        }

        // Getter for transactionStatusDesc
        public String getTransactionStatusDesc() {
            return transactionStatusDesc;
        }

        // Setter for transactionStatusDesc
        public void setTransactionStatusDesc(String transactionStatusDesc) {
            this.transactionStatusDesc = transactionStatusDesc;
        }
    }
}
