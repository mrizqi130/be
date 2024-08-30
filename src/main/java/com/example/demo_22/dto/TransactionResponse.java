package com.example.demo_22.dto;

public class TransactionResponse {
    private String rc;
    private int statusCode;
    private String status;
    private String message;
    private Data data;

    public static class Data {
        private String TXID;
        private int id_trx_code;

        // Getters and Setters
        public String getTXID() {
            return TXID;
        }

        public void setTXID(String TXID) {
            this.TXID = TXID;
        }

        public int getId_trx_code() {
            return id_trx_code;
        }

        public void setId_trx_code(int id_trx_code) {
            this.id_trx_code = id_trx_code;
        }
    }

    // Getters and Setters
    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
