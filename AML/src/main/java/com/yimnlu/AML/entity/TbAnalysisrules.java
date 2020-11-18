package com.yimnlu.AML.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author luyimin
 * @since 2020-11-18
 */
@Data
public class TbAnalysisrules implements Serializable {

    private static final long serialVersionUID = 1L;

    private String departId;
    private String ruleCode;
    private String ruleType;
    private String ruleNotes;
    private String ruleAnalyseMethod;
    private Double ruleIndex;
    private String filler1;
    private String filler3;
    private String filler2;


    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
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

    public String getRuleNotes() {
        return ruleNotes;
    }

    public void setRuleNotes(String ruleNotes) {
        this.ruleNotes = ruleNotes;
    }

    public String getRuleAnalyseMethod() {
        return ruleAnalyseMethod;
    }

    public void setRuleAnalyseMethod(String ruleAnalyseMethod) {
        this.ruleAnalyseMethod = ruleAnalyseMethod;
    }

    public Double getRuleIndex() {
        return ruleIndex;
    }

    public void setRuleIndex(Double ruleIndex) {
        this.ruleIndex = ruleIndex;
    }

    public String getFiller1() {
        return filler1;
    }

    public void setFiller1(String filler1) {
        this.filler1 = filler1;
    }

    public String getFiller3() {
        return filler3;
    }

    public void setFiller3(String filler3) {
        this.filler3 = filler3;
    }

    public String getFiller2() {
        return filler2;
    }

    public void setFiller2(String filler2) {
        this.filler2 = filler2;
    }

    @Override
    public String toString() {
        return "TbAnalysisrules{" +
        "departId=" + departId +
        ", ruleCode=" + ruleCode +
        ", ruleType=" + ruleType +
        ", ruleNotes=" + ruleNotes +
        ", ruleAnalyseMethod=" + ruleAnalyseMethod +
        ", ruleIndex=" + ruleIndex +
        ", filler1=" + filler1 +
        ", filler3=" + filler3 +
        ", filler2=" + filler2 +
        "}";
    }
}
