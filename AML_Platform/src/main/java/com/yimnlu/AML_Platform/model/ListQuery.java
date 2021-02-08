package com.yimnlu.AML_Platform.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ListQuery", description = "ListQuery")
public class ListQuery {
    @ApiModelProperty(value = "WORKDATE")
    String WORKDATE;
    @ApiModelProperty(value = "DEPARTID")
    String DEPARTID;
    @ApiModelProperty(value = "REFNO")
    String REFNO;

    public String getWORKDATE() {
        return WORKDATE;
    }

    public void setWORKDATE(String WORKDATE) {
        this.WORKDATE = WORKDATE;
    }

    public String getDEPARTID() {
        return DEPARTID;
    }

    public void setDEPARTID(String DEPARTID) {
        this.DEPARTID = DEPARTID;
    }

    public String getREFNO() {
        return REFNO;
    }

    public void setREFNO(String REFNO) {
        this.REFNO = REFNO;
    }

    @Override
    public String toString() {
        return "ListQuery{" +
                "WORKDATE='" + WORKDATE + '\'' +
                ", DEPARTID='" + DEPARTID + '\'' +
                ", REFNO='" + REFNO + '\'' +
                '}';
    }
}
