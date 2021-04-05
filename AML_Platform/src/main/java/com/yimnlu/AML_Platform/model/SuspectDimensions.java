package com.yimnlu.AML_Platform.model;

import com.yimnlu.AML_Platform.controller.DepthController;
import lombok.Data;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
public class SuspectDimensions {
    float TradeFrequency;
    float HighRiskyArea;//STR0003
    float CDHFF;//STR0001 STR0002
    float SDFEIT;//1101
    float CFCT; //0501 0503
    float CapitalOutflow;//0006
    float WeightedAverage;


    public SuspectDimensions(String ACCT){

    }

    public SuspectDimensions(String ACCT,float highRiskyArea, float CDHFF, float SDFEIT, float CFCT, float capitalOutflow) {

        HashMap<String, Float> sortedProbability = DepthController.sortedProbability;
        float temp = sortedProbability.get(ACCT);
        if (temp>12)
            TradeFrequency = (float) 0.9;
        else if (temp>11)
            TradeFrequency = (float) 0.85;
        else if (temp>10)
            TradeFrequency = (float) 0.8;
        else if (temp>9)
            TradeFrequency= 0.75F;
        else if (temp>8)
            TradeFrequency = (float) 0.7;
        else if (temp>7)
            TradeFrequency = (float) 0.65;
        else if (temp>6)
            TradeFrequency = (float) 0.6;
        else if (temp>5)
            TradeFrequency = (float) 0.55;
        else if (temp>4)
            TradeFrequency = 0.5F;
        else if (temp>3)
            TradeFrequency = (float) 0.45;
        else if (temp >2)
            TradeFrequency = (float) 0.4;
        else if (temp > 1)
            TradeFrequency = (float) 0.3;
        else
            TradeFrequency = (float) 0.2;

//        int i = list.i/list.size();
//        if (i >0 &&)
        //this.TradeFrequency =
        if (HighRiskyArea >10)
            HighRiskyArea = 10;
        else
            HighRiskyArea = highRiskyArea;
        if (CDHFF>10)
            this.CDHFF = 10;
        else
            this.CDHFF = CDHFF;
        if (SDFEIT >10)
            this.SDFEIT = 10;
        else
        this.SDFEIT = SDFEIT;
        if (CFCT>10)
            this.CFCT =10;
        else
            this.CFCT = CFCT;
        CapitalOutflow = capitalOutflow;
        WeightedAverage = (float) ((TradeFrequency*0.8+0.8*HighRiskyArea+0.8*CDHFF+0.8*SDFEIT+0.8*CFCT+0.8*CapitalOutflow)/24);
    }

    public float getTradeFrequency() {
        return TradeFrequency;
    }

    public void setTradeFrequency(float tradeFrequency) {
        TradeFrequency = tradeFrequency;
    }

    public float getHighRiskyArea() {
        return HighRiskyArea;
    }

    public void setHighRiskyArea(float highRiskyArea) {
        HighRiskyArea = highRiskyArea;
    }

    public float getCDHFF() {
        return CDHFF;
    }

    public void setCDHFF(float CDHFF) {
        this.CDHFF = CDHFF;
    }

    public float getSDFEIT() {
        return SDFEIT;
    }

    public void setSDFEIT(float SDFEIT) {
        this.SDFEIT = SDFEIT;
    }

    public float getCFCT() {
        return CFCT;
    }

    public void setCFCT(float CFCT) {
        this.CFCT = CFCT;
    }

    public float getCapitalOutflow() {
        return CapitalOutflow;
    }

    public void setCapitalOutflow(float capitalOutflow) {
        CapitalOutflow = capitalOutflow;
    }

    public float getWeightedAverage() {
        return WeightedAverage;
    }

    public void setWeightedAverage(float weightedAverage) {
        WeightedAverage = weightedAverage;
    }
}
