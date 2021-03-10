package com.yimnlu.AML_Platform.entity;

import com.yimnlu.AML_Platform.controller.AML_DICTController;
import com.yimnlu.AML_Platform.dto.AML_DICT_GROUP;
import com.yimnlu.AML_Platform.executor.DICT;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.yimnlu.AML_Platform.controller.AML_DICTController._LIST_AML_DICT_;

/**
 * <p>
 *
 * </p>
 *
 * @author yimnlu
 * @since 2020-12-29
 */
@Data
public class AmlDTA implements Serializable {

    private static final long serialVersionUID = 1L;

    private String workDate;
    private String refNo;
    private String origRefNo;
    private String departId;
    private String seqNo;
    private String departName;
    private String departType;
    private String departAreacode;
    private String clientId;
    private String ruleCode;
    private String ruleType;
    private String unitName;
    private String unitCode;
    private String relationType;
    private String reportDate;
    private String shadinessLevel;
    private String shadinessDesc;
    private String actionMeasure;
    private String origBatchNo;
    private String origWorkDate;
    private String origClientId;
    private String origTradeDate;
    private String origRuleCode;
    private String pcode;
    private String clientName;
    private String clientType;
    private String clientIcType;
    private String clientIcTypeMemo;
    private String clientIcNo;
    private String clientNationality;
    private String phone;
    private String address;
    private String otherContact;
    private String industryType;
    private String registeredCapital;
    private String repName;
    private String repIcType;
    private String repIcTypeMemo;
    private String repIcNo;
    private String agentName;
    private String agentIcNo;
    private String agentIcType;
    private String agentIcTypeMemo;
    private String agentNationality;
    private String acctId;
    private String acctType;
    private String acctOpenTime;
    private String acctCloseTime;
    private String pbocNumAcct;
    private String tradeDate;
    private String tradeTime;
    private String valueDate;
    private String tradeVenueCountry;
    private String tradeVenueRegion;
    private String tradeMode;
    private String debitCredit;
    private String tradeCountry;
    private String tradeRegion;
    private String tradeCode;
    private String fundUsage;
    private String currency;
    private Double amt;
    private Double dollarAmt;
    private String ctpyFiCode;
    private String ctpyFiPcode;
    private String ctpyFiName;
    private String ctpyFiType;
    private String ctpyFiCountry;
    private String ctpyFiRegionCode;
    private String ctpyName;
    private String ctpyType;
    private String ctpyNationality;
    private String ctpyIcCode;
    private String ctpyIcType;
    private String ctpyIcTypeMemo;
    private String ctpyAcctId;
    private String ctpyAcctType;
    private String tradeType;
    private String repaymentDate;
    private String loanRepaymentType;
    private String precedingTradeReference;
    private String successdingTradeReference;
    private Double cnyAmt;
    private String cardType;
    private String cardTypeMemo;
    private String cardNo;
    private String repayNoType;
    private String repayNo;
    private String noCounterType;
    private String noCounterNo;
    private String bankPayinsCode;


    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getOrigRefNo() {
        return origRefNo;
    }

    public void setOrigRefNo(String origRefNo) {
        this.origRefNo = origRefNo;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getDepartType() {
        return departType;
    }

    public void setDepartType(String departType) {
        this.departType = departType;
    }

    public String getDepartAreacode() {
        return departAreacode;
    }

    public void setDepartAreacode(String departAreacode) {
        this.departAreacode = departAreacode;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getShadinessLevel() {
        return shadinessLevel;
    }

    public void setShadinessLevel(String shadinessLevel) {
        this.shadinessLevel = shadinessLevel;
    }

    public String getShadinessDesc() {
        return shadinessDesc;
    }

    public void setShadinessDesc(String shadinessDesc) {
        this.shadinessDesc = shadinessDesc;
    }

    public String getActionMeasure() {
        return actionMeasure;
    }

    public void setActionMeasure(String actionMeasure) {
        this.actionMeasure = actionMeasure;
    }

    public String getOrigBatchNo() {
        return origBatchNo;
    }

    public void setOrigBatchNo(String origBatchNo) {
        this.origBatchNo = origBatchNo;
    }

    public String getOrigWorkDate() {
        return origWorkDate;
    }

    public void setOrigWorkDate(String origWorkDate) {
        this.origWorkDate = origWorkDate;
    }

    public String getOrigClientId() {
        return origClientId;
    }

    public void setOrigClientId(String origClientId) {
        this.origClientId = origClientId;
    }

    public String getOrigTradeDate() {
        return origTradeDate;
    }

    public void setOrigTradeDate(String origTradeDate) {
        this.origTradeDate = origTradeDate;
    }

    public String getOrigRuleCode() {
        return origRuleCode;
    }

    public void setOrigRuleCode(String origRuleCode) {
        this.origRuleCode = origRuleCode;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getClientIcType() {
        return clientIcType;
    }

    public void setClientIcType(String clientIcType) {

        this.clientIcType = clientIcType;

        Optional<AML_DICT_GROUP> aml_dict_group = _LIST_AML_DICT_.stream().filter(aml_dict_group1 -> aml_dict_group1.getMETA_VAL().equals(clientIcType)).findFirst();

        if (!aml_dict_group.isEmpty()){
            this.clientIcType = aml_dict_group.get().getMETA_NAME();
        }
    }

    public String getClientIcTypeMemo() {
        return clientIcTypeMemo;
    }

    public void setClientIcTypeMemo(String clientIcTypeMemo) {
        this.clientIcTypeMemo = clientIcTypeMemo;
    }

    public String getClientIcNo() {
        return clientIcNo;
    }

    public void setClientIcNo(String clientIcNo) {
        this.clientIcNo = "Data Desensitized";
    }

    public String getClientNationality() {
        return clientNationality;
    }

    public void setClientNationality(String clientNationality) {
        this.clientNationality = clientNationality;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOtherContact() {
        return otherContact;
    }

    public void setOtherContact(String otherContact) {
        this.otherContact = otherContact;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getRepName() {
        return repName;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public String getRepIcType() {
        return repIcType;
    }

    public void setRepIcType(String repIcType) {
        this.repIcType = repIcType;
    }

    public String getRepIcTypeMemo() {
        return repIcTypeMemo;
    }

    public void setRepIcTypeMemo(String repIcTypeMemo) {
        this.repIcTypeMemo = repIcTypeMemo;
    }

    public String getRepIcNo() {
        return repIcNo;
    }

    public void setRepIcNo(String repIcNo) {
        this.repIcNo = "Data Desensitized";
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentIcNo() {
        return agentIcNo;
    }

    public void setAgentIcNo(String agentIcNo) {
        this.agentIcNo = "Data Desensitized";
    }

    public String getAgentIcType() {
        return agentIcType;
    }

    public void setAgentIcType(String agentIcType) {
        this.agentIcType = agentIcType;
    }

    public String getAgentIcTypeMemo() {
        return agentIcTypeMemo;
    }

    public void setAgentIcTypeMemo(String agentIcTypeMemo) {
        this.agentIcTypeMemo = agentIcTypeMemo;
    }

    public String getAgentNationality() {
        return agentNationality;
    }

    public void setAgentNationality(String agentNationality) {
        this.agentNationality = agentNationality;
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
        Optional<AML_DICT_GROUP> aml_dict_group = _LIST_AML_DICT_.stream().filter(aml_dict_group1 -> aml_dict_group1.getMETA_VAL().equals(acctType)).findFirst();
        if (!aml_dict_group.isEmpty())
            this.acctType=aml_dict_group.get().getMETA_NAME();
    }

    public String getAcctOpenTime() {
        return acctOpenTime;
    }

    public void setAcctOpenTime(String acctOpenTime) {
        this.acctOpenTime = acctOpenTime;
    }

    public String getAcctCloseTime() {
        return acctCloseTime;
    }

    public void setAcctCloseTime(String acctCloseTime) {
        this.acctCloseTime = acctCloseTime;
    }

    public String getPbocNumAcct() {
        return pbocNumAcct;
    }

    public void setPbocNumAcct(String pbocNumAcct) {
        this.pbocNumAcct = pbocNumAcct;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getTradeVenueCountry() {
        return tradeVenueCountry;
    }

    public void setTradeVenueCountry(String tradeVenueCountry) {
        this.tradeVenueCountry = tradeVenueCountry;
    }

    public String getTradeVenueRegion() {
        return tradeVenueRegion;
    }

    public void setTradeVenueRegion(String tradeVenueRegion) {
        this.tradeVenueRegion = tradeVenueRegion;
    }

    public String getTradeMode() {
        return tradeMode;
    }

    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode;
        Optional<AML_DICT_GROUP> aml_dict_group = _LIST_AML_DICT_.stream().filter(aml_dict_group1 -> aml_dict_group1.getMETA_VAL().equals(tradeMode)).findFirst();
        if (!aml_dict_group.isEmpty())
            this.tradeMode=aml_dict_group.get().getMETA_NAME();
    }

    public String getDebitCredit() {
        return debitCredit;
    }

    public void setDebitCredit(String debitCredit) {
        this.debitCredit = debitCredit;
    }

    public String getTradeCountry() {
        return tradeCountry;
    }

    public void setTradeCountry(String tradeCountry) {
        this.tradeCountry = tradeCountry;
    }

    public String getTradeRegion() {
        return tradeRegion;
    }

    public void setTradeRegion(String tradeRegion) {
        this.tradeRegion = tradeRegion;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getFundUsage() {
        return fundUsage;
    }

    public void setFundUsage(String fundUsage) {
        this.fundUsage = fundUsage;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public Double getDollarAmt() {
        return dollarAmt;
    }

    public void setDollarAmt(Double dollarAmt) {
        this.dollarAmt = dollarAmt;
    }

    public String getCtpyFiCode() {
        return ctpyFiCode;
    }

    public void setCtpyFiCode(String ctpyFiCode) {
        this.ctpyFiCode = ctpyFiCode;
    }

    public String getCtpyFiPcode() {
        return ctpyFiPcode;
    }

    public void setCtpyFiPcode(String ctpyFiPcode) {
        this.ctpyFiPcode = ctpyFiPcode;
    }

    public String getCtpyFiName() {
        return ctpyFiName;
    }

    public void setCtpyFiName(String ctpyFiName) {
        this.ctpyFiName = ctpyFiName;
    }

    public String getCtpyFiType() {
        return ctpyFiType;
    }

    public void setCtpyFiType(String ctpyFiType) {
        this.ctpyFiType = ctpyFiType;
    }

    public String getCtpyFiCountry() {
        return ctpyFiCountry;
    }

    public void setCtpyFiCountry(String ctpyFiCountry) {
        this.ctpyFiCountry = ctpyFiCountry;
    }

    public String getCtpyFiRegionCode() {
        return ctpyFiRegionCode;
    }

    public void setCtpyFiRegionCode(String ctpyFiRegionCode) {
        this.ctpyFiRegionCode = ctpyFiRegionCode;
    }

    public String getCtpyName() {
        return ctpyName;
    }

    public void setCtpyName(String ctpyName) {
        this.ctpyName = ctpyName;
    }

    public String getCtpyType() {
        return ctpyType;
    }

    public void setCtpyType(String ctpyType) {
        this.ctpyType = ctpyType;
    }

    public String getCtpyNationality() {
        return ctpyNationality;
    }

    public void setCtpyNationality(String ctpyNationality) {
        this.ctpyNationality = ctpyNationality;
    }

    public String getCtpyIcCode() {
        return ctpyIcCode;
    }

    public void setCtpyIcCode(String ctpyIcCode) {
        this.ctpyIcCode = ctpyIcCode;
    }

    public String getCtpyIcType() {
        return ctpyIcType;
    }

    public void setCtpyIcType(String ctpyIcType) {
        this.ctpyIcType = ctpyIcType;
    }

    public String getCtpyIcTypeMemo() {
        return ctpyIcTypeMemo;
    }

    public void setCtpyIcTypeMemo(String ctpyIcTypeMemo) {
        this.ctpyIcTypeMemo = ctpyIcTypeMemo;
    }

    public String getCtpyAcctId() {
        return ctpyAcctId;
    }

    public void setCtpyAcctId(String ctpyAcctId) {
        this.ctpyAcctId = ctpyAcctId;
    }

    public String getCtpyAcctType() {
        return ctpyAcctType;
    }

    public void setCtpyAcctType(String ctpyAcctType) {
        this.ctpyAcctType = ctpyAcctType;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(String repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public String getLoanRepaymentType() {
        return loanRepaymentType;
    }

    public void setLoanRepaymentType(String loanRepaymentType) {
        this.loanRepaymentType = loanRepaymentType;
    }

    public String getPrecedingTradeReference() {
        return precedingTradeReference;
    }

    public void setPrecedingTradeReference(String precedingTradeReference) {
        this.precedingTradeReference = precedingTradeReference;
    }

    public String getSuccessdingTradeReference() {
        return successdingTradeReference;
    }

    public void setSuccessdingTradeReference(String successdingTradeReference) {
        this.successdingTradeReference = successdingTradeReference;
    }

    public Double getCnyAmt() {
        return cnyAmt;
    }

    public void setCnyAmt(Double cnyAmt) {
        this.cnyAmt = cnyAmt;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardTypeMemo() {
        return cardTypeMemo;
    }

    public void setCardTypeMemo(String cardTypeMemo) {
        this.cardTypeMemo = cardTypeMemo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getRepayNoType() {
        return repayNoType;
    }

    public void setRepayNoType(String repayNoType) {
        this.repayNoType = repayNoType;
    }

    public String getRepayNo() {
        return repayNo;
    }

    public void setRepayNo(String repayNo) {
        this.repayNo = repayNo;
    }

    public String getNoCounterType() {
        return noCounterType;
    }

    public void setNoCounterType(String noCounterType) {
        this.noCounterType = noCounterType;
    }

    public String getNoCounterNo() {
        return noCounterNo;
    }

    public void setNoCounterNo(String noCounterNo) {
        this.noCounterNo = noCounterNo;
    }

    public String getBankPayinsCode() {
        return bankPayinsCode;
    }

    public void setBankPayinsCode(String bankPayinsCode) {
        this.bankPayinsCode = bankPayinsCode;
    }

    @Override
    public String toString() {
        return "AmlDatasource{" +
                "workDate=" + workDate +
                ", refNo=" + refNo +
                ", origRefNo=" + origRefNo +
                ", departId=" + departId +
                ", seqNo=" + seqNo +
                ", departName=" + departName +
                ", departType=" + departType +
                ", departAreacode=" + departAreacode +
                ", clientId=" + clientId +
                ", ruleCode=" + ruleCode +
                ", ruleType=" + ruleType +
                ", unitName=" + unitName +
                ", unitCode=" + unitCode +
                ", relationType=" + relationType +
                ", reportDate=" + reportDate +
                ", shadinessLevel=" + shadinessLevel +
                ", shadinessDesc=" + shadinessDesc +
                ", actionMeasure=" + actionMeasure +
                ", origBatchNo=" + origBatchNo +
                ", origWorkDate=" + origWorkDate +
                ", origClientId=" + origClientId +
                ", origTradeDate=" + origTradeDate +
                ", origRuleCode=" + origRuleCode +
                ", pcode=" + pcode +
                ", clientName=" + clientName +
                ", clientType=" + clientType +
                ", clientIcType=" + clientIcType +
                ", clientIcTypeMemo=" + clientIcTypeMemo +
                ", clientIcNo=" + clientIcNo +
                ", clientNationality=" + clientNationality +
                ", phone=" + phone +
                ", address=" + address +
                ", otherContact=" + otherContact +
                ", industryType=" + industryType +
                ", registeredCapital=" + registeredCapital +
                ", repName=" + repName +
                ", repIcType=" + repIcType +
                ", repIcTypeMemo=" + repIcTypeMemo +
                ", repIcNo=" + repIcNo +
                ", agentName=" + agentName +
                ", agentIcNo=" + agentIcNo +
                ", agentIcType=" + agentIcType +
                ", agentIcTypeMemo=" + agentIcTypeMemo +
                ", agentNationality=" + agentNationality +
                ", acctId=" + acctId +
                ", acctType=" + acctType +
                ", acctOpenTime=" + acctOpenTime +
                ", acctCloseTime=" + acctCloseTime +
                ", pbocNumAcct=" + pbocNumAcct +
                ", tradeDate=" + tradeDate +
                ", tradeTime=" + tradeTime +
                ", valueDate=" + valueDate +
                ", tradeVenueCountry=" + tradeVenueCountry +
                ", tradeVenueRegion=" + tradeVenueRegion +
                ", tradeMode=" + tradeMode +
                ", debitCredit=" + debitCredit +
                ", tradeCountry=" + tradeCountry +
                ", tradeRegion=" + tradeRegion +
                ", tradeCode=" + tradeCode +
                ", fundUsage=" + fundUsage +
                ", currency=" + currency +
                ", amt=" + amt +
                ", dollarAmt=" + dollarAmt +
                ", ctpyFiCode=" + ctpyFiCode +
                ", ctpyFiPcode=" + ctpyFiPcode +
                ", ctpyFiName=" + ctpyFiName +
                ", ctpyFiType=" + ctpyFiType +
                ", ctpyFiCountry=" + ctpyFiCountry +
                ", ctpyFiRegionCode=" + ctpyFiRegionCode +
                ", ctpyName=" + ctpyName +
                ", ctpyType=" + ctpyType +
                ", ctpyNationality=" + ctpyNationality +
                ", ctpyIcCode=" + ctpyIcCode +
                ", ctpyIcType=" + ctpyIcType +
                ", ctpyIcTypeMemo=" + ctpyIcTypeMemo +
                ", ctpyAcctId=" + ctpyAcctId +
                ", ctpyAcctType=" + ctpyAcctType +
                ", tradeType=" + tradeType +
                ", repaymentDate=" + repaymentDate +
                ", loanRepaymentType=" + loanRepaymentType +
                ", precedingTradeReference=" + precedingTradeReference +
                ", successdingTradeReference=" + successdingTradeReference +
                ", cnyAmt=" + cnyAmt +
                ", cardType=" + cardType +
                ", cardTypeMemo=" + cardTypeMemo +
                ", cardNo=" + cardNo +
                ", repayNoType=" + repayNoType +
                ", repayNo=" + repayNo +
                ", noCounterType=" + noCounterType +
                ", noCounterNo=" + noCounterNo +
                ", bankPayinsCode=" + bankPayinsCode +
                "}";
    }
}
