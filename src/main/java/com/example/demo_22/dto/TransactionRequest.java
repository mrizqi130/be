package com.example.demo_22.dto;

import java.util.List;

public class TransactionRequest {
    private String branchId;
    private int totalAmount;
    private String userId;
    private int totalTrx;
    private List<Param> param;

    public static class Param {
        private String accNbr;
        private int dbCr;
        private String refAcc;
        private int txAmt;
        private String txCode;
        private String txMsg;
        private int isFee;

        // Getters and Setters
        public String getAccNbr() {
            return accNbr;
        }

        public void setAccNbr(String accNbr) {
            this.accNbr = accNbr;
        }

        public int getDbCr() {
            return dbCr;
        }

        public void setDbCr(int dbCr) {
            this.dbCr = dbCr;
        }

        public String getRefAcc() {
            return refAcc;
        }

        public void setRefAcc(String refAcc) {
            this.refAcc = refAcc;
        }

        public int getTxAmt() {
            return txAmt;
        }

        public void setTxAmt(int txAmt) {
            this.txAmt = txAmt;
        }

        public String getTxCode() {
            return txCode;
        }

        public void setTxCode(String txCode) {
            this.txCode = txCode;
        }

        public String getTxMsg() {
            return txMsg;
        }

        public void setTxMsg(String txMsg) {
            this.txMsg = txMsg;
        }

        public int getIsFee() {
            return isFee;
        }

        public void setIsFee(int isFee) {
            this.isFee = isFee;
        }
    }

    // Getters and Setters
    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getTotalTrx() {
        return totalTrx;
    }

    public void setTotalTrx(int totalTrx) {
        this.totalTrx = totalTrx;
    }

    public List<Param> getParam() {
        return param;
    }

    public void setParam(List<Param> param) {
        this.param = param;
    }
}
