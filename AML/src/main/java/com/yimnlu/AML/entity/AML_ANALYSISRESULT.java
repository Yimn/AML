package com.yimnlu.AML.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class AML_ANALYSISRESULT implements Serializable {

    private static final long serialVersionUID = 1L;

    private String workDate;
    private String batchNo;
    private String refNo;
    private String ruleCode;
    private String departId;
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
    private String origRefNo;
    private String origTradeDate;
    private String origRuleCode;
    private String reportType;
    private String ifRpt;
    private String rptStatus;
    private String finalRptStatus;
    private String retMse;
    private String reporter;
    private String rptFile;
    private String rptZip;
    private String totalCount1;
    private String totalCount2;
    private String serialNum1;
    private String serialNum2;
    private String serialNum3;
    private String isDel;
    private String delInfo;
    private String makeStatus;
    private String maker;
    private String makeTime;
    private String checkStatus;
    private String checker;
    private String checkTime;
    private String checkInfo;
    private String filler1;
    private String filler2;
    private String filler3;
    private String shadinessRepName;
    private String shadinessRepIcType;
    private String shadinessRepIcTypeMemo;
    private String shadinessRepIcNo;
    private String shadinessSrdName;
    private String shadinessSrdIcType;
    private String shadinessSrdIcTypeMemo;
    private String shadinessSrdIcNo;
    private String rptCount;
    private String shadinessTrptPoint;
    private String tranCustBehavior;
    private String doubtAnalysis;
    private String shadinessCrimeType;
    private String shadinessTranCode;
    private String rptDir;
    private String oRptDir;
    private String oTrptPoint;
    private String manCorrectFlag;
    private String rptDotCode;
    private String serialNum4;
    private String shadinessTrptPointMemo;
    private String orgRptFile;
}
