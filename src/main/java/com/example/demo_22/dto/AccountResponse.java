package com.example.demo_22.dto;

public class AccountResponse {
    private String rc;
    private int statusCode;
    private String status;
    private String message;
    private Data data;

    public static class Data {
        private String ACCNBR;
        private String PRODID;
        private String FULLNM;
        private String NICKNM;
        private String DTBAL;
        private int ACCSTS;
        private String APPLID_BE;
        private String PRODNM;

        // Getters and Setters
        public String getACCNBR() {
            return ACCNBR;
        }

        public void setACCNBR(String ACCNBR) {
            this.ACCNBR = ACCNBR;
        }

        public String getPRODID() {
            return PRODID;
        }

        public void setPRODID(String PRODID) {
            this.PRODID = PRODID;
        }

        public String getFULLNM() {
            return FULLNM;
        }

        public void setFULLNM(String FULLNM) {
            this.FULLNM = FULLNM;
        }

        public String getNICKNM() {
            return NICKNM;
        }

        public void setNICKNM(String NICKNM) {
            this.NICKNM = NICKNM;
        }

        public String getDTBAL() {
            return DTBAL;
        }

        public void setDTBAL(String DTBAL) {
            this.DTBAL = DTBAL;
        }

        public int getACCSTS() {
            return ACCSTS;
        }

        public void setACCSTS(int ACCSTS) {
            this.ACCSTS = ACCSTS;
        }

        public String getAPPLID_BE() {
            return APPLID_BE;
        }

        public void setAPPLID_BE(String APPLID_BE) {
            this.APPLID_BE = APPLID_BE;
        }

        public String getPRODNM() {
            return PRODNM;
        }

        public void setPRODNM(String PRODNM) {
            this.PRODNM = PRODNM;
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
