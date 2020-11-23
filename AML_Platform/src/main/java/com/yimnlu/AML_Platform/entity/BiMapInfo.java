package com.yimnlu.AML_Platform.entity;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author luyimin
 * @since 2020-11-21
 */
public class BiMapInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String departId;
    private String acctId;
    private String acctCur;
    private String clientId;
    private String acctType;
    private String fxAcctType;
    private String closeDate;
    private String openDate;
    private String acctCata;
    private String limitType;
    private Double limit;
    private String pbocNumAcct;
    private String fileNum;
    private String accStatus;
    private Double creditAmt;
    private Double debitAmt;
    private Double balanceAmt;
    private Double sysCreditAmt;
    private Double sysDebitAmt;
    private Double sysBalanceAmt;
    private String location;
    private String longitude;
    private String latitude;


    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getAcctCur() {
        return acctCur;
    }

    public void setAcctCur(String acctCur) {
        this.acctCur = acctCur;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public String getFxAcctType() {
        return fxAcctType;
    }

    public void setFxAcctType(String fxAcctType) {
        this.fxAcctType = fxAcctType;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getAcctCata() {
        return acctCata;
    }

    public void setAcctCata(String acctCata) {
        this.acctCata = acctCata;
    }

    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public String getPbocNumAcct() {
        return pbocNumAcct;
    }

    public void setPbocNumAcct(String pbocNumAcct) {
        this.pbocNumAcct = pbocNumAcct;
    }

    public String getFileNum() {
        return fileNum;
    }

    public void setFileNum(String fileNum) {
        this.fileNum = fileNum;
    }

    public String getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus;
    }

    public Double getCreditAmt() {
        return creditAmt;
    }

    public void setCreditAmt(Double creditAmt) {
        this.creditAmt = creditAmt;
    }

    public Double getDebitAmt() {
        return debitAmt;
    }

    public void setDebitAmt(Double debitAmt) {
        this.debitAmt = debitAmt;
    }

    public Double getBalanceAmt() {
        return balanceAmt;
    }

    public void setBalanceAmt(Double balanceAmt) {
        this.balanceAmt = balanceAmt;
    }

    public Double getSysCreditAmt() {
        return sysCreditAmt;
    }

    public void setSysCreditAmt(Double sysCreditAmt) {
        this.sysCreditAmt = sysCreditAmt;
    }

    public Double getSysDebitAmt() {
        return sysDebitAmt;
    }

    public void setSysDebitAmt(Double sysDebitAmt) {
        this.sysDebitAmt = sysDebitAmt;
    }

    public Double getSysBalanceAmt() {
        return sysBalanceAmt;
    }

    public void setSysBalanceAmt(Double sysBalanceAmt) {
        this.sysBalanceAmt = sysBalanceAmt;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "BiMapInfo{" +
                "departId=" + departId +
                ", acctId=" + acctId +
                ", acctCur=" + acctCur +
                ", clientId=" + clientId +
                ", acctType=" + acctType +
                ", fxAcctType=" + fxAcctType +
                ", closeDate=" + closeDate +
                ", openDate=" + openDate +
                ", acctCata=" + acctCata +
                ", limitType=" + limitType +
                ", limit=" + limit +
                ", pbocNumAcct=" + pbocNumAcct +
                ", fileNum=" + fileNum +
                ", accStatus=" + accStatus +
                ", creditAmt=" + creditAmt +
                ", debitAmt=" + debitAmt +
                ", balanceAmt=" + balanceAmt +
                ", sysCreditAmt=" + sysCreditAmt +
                ", sysDebitAmt=" + sysDebitAmt +
                ", sysBalanceAmt=" + sysBalanceAmt +
                ", location=" + location +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                "}";
    }
}
