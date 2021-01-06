package com.yimnlu.AML_Platform.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SuspectCommonQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    private String WORK_DATE;
    private String REF_NO;
    private String SHADINESS_DESC;
    private String DEBIT_CREDIT;
    private String DEPART_NAME;
    private String CLIENT_NAME;
    private String ACCT_ID;
    private String TRADE_DATE;
    private String CURRENCY;
    private String AMT;
    private String TRADE_VENUE_COUNTRY;
    private String FUND_USAGE;

    public String getWORK_DATE() {
        return WORK_DATE;
    }

    public void setWORK_DATE(String WORK_DATE) {
        this.WORK_DATE = WORK_DATE;
    }

    public String getREF_NO() {
        return REF_NO;
    }

    public void setREF_NO(String REF_NO) {
        this.REF_NO = REF_NO;
    }

    public String getSHADINESS_DESC() {
        return SHADINESS_DESC;
    }

    public void setSHADINESS_DESC(String SHADINESS_DESC) {
        this.SHADINESS_DESC = SHADINESS_DESC;
    }

    public String getDEBIT_CREDIT() {
        return DEBIT_CREDIT;
    }

    public void setDEBIT_CREDIT(String DEBIT_CREDIT) {
        this.DEBIT_CREDIT = DEBIT_CREDIT;
    }

    public String getDEPART_NAME() {
        return DEPART_NAME;
    }

    public void setDEPART_NAME(String DEPART_NAME) {
        this.DEPART_NAME = DEPART_NAME;
    }

    public String getCLIENT_NAME() {
        return CLIENT_NAME;
    }

    public void setCLIENT_NAME(String CLIENT_NAME) {
        this.CLIENT_NAME = CLIENT_NAME;
    }

    public String getACCT_ID() {
        return ACCT_ID;
    }

    public void setACCT_ID(String ACCT_ID) {
        this.ACCT_ID = ACCT_ID;
    }

    public String getTRADE_DATE() {
        return TRADE_DATE;
    }

    public void setTRADE_DATE(String TRADE_DATE) {
        this.TRADE_DATE = TRADE_DATE;
    }

    public String getCURRENCY() {
        return CURRENCY;
    }

    public void setCURRENCY(String CURRENCY) {
        this.CURRENCY = CURRENCY;
    }

    public String getAMT() {
        return AMT;
    }

    public void setAMT(String AMT) {
        this.AMT = AMT;
    }

    public String getTRADE_VENUE_COUNTRY() {
        return TRADE_VENUE_COUNTRY;
    }

    public void setTRADE_VENUE_COUNTRY(String TRADE_VENUE_COUNTRY) {
        this.TRADE_VENUE_COUNTRY = TRADE_VENUE_COUNTRY;
    }

    public String getFUND_USAGE() {
        return FUND_USAGE;
    }

    public void setFUND_USAGE(String FUND_USAGE) {
        this.FUND_USAGE = FUND_USAGE;
    }
}
