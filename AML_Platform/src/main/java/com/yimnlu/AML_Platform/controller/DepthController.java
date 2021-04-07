package com.yimnlu.AML_Platform.controller;

import com.yimnlu.AML_Platform.dao.DepthMapper;
import com.yimnlu.AML_Platform.entity.AmlDTA;
import com.yimnlu.AML_Platform.model.SuspectDimensions;
import com.yimnlu.AML_Platform.service.DepthService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/depthController")
@Slf4j
@Api(tags = "DepthController", value = "DepthController")
public class DepthController {
    public static List<Map.Entry<String, Float>> GlobalFrequencyList;
    public static HashMap<String, Float> sortedProbability = new LinkedHashMap<>();
    ;

    @Resource
    DepthMapper depthMapper;

    @Resource
    DepthService depthService;

    @PostConstruct
    @ResponseBody
    @ApiOperation(value = "update", notes = "update")
    @RequestMapping(value = "/update")
    public void update() {
        log.info("Depth Data Processing");
        List<AmlDTA> list = depthMapper.DTAQuery(null, null, null);
        HashMap<String, List<AmlDTA>> hashMap = new HashMap<>();
        for (AmlDTA amlDTA : list) {
            if (!hashMap.containsKey(amlDTA.getAcctId()))
                hashMap.put(amlDTA.getAcctId(), list.stream().filter(amlDTA1 -> amlDTA1.getAcctId().equals(amlDTA.getAcctId())).collect(Collectors.toList()));
        }
        log.info("Depth source data:" + hashMap.keySet().toString());
        HashMap<String, Float> probability = new HashMap<>();
        for (String s : hashMap.keySet()) {
            log.info("表总数据量:" + list.size() + "   当前判断账户数据量" + hashMap.get(s).size());
            BigDecimal bigDecimal = new BigDecimal(hashMap.get(s).size() * 1000);
            BigDecimal bigDecimal1 = new BigDecimal(list.size());
            probability.put(s, bigDecimal1.divide(bigDecimal, 5, RoundingMode.HALF_UP).floatValue());
        }
        GlobalFrequencyList = sortProbability(probability);
        log.info("Depth probability:" + probability.toString());
        log.info("Atfer sorted >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        log.info(GlobalFrequencyList.toString());
        GlobalFrequencyList.stream().forEach(stringFloatEntry -> sortedProbability.put(stringFloatEntry.getKey(), stringFloatEntry.getValue()));
        log.info(sortedProbability.toString());
    }

    @ResponseBody
    @ApiOperation(value = "visualRader", notes = "visualRader")
    @RequestMapping(value = "/visualRader")
    public ArrayList<Float> visualACCTRader(String ACCT) {
        ArrayList<Float> arrayList = new ArrayList<>();
        if (depthMapper.checkAcct_ID(ACCT) == 1) {
            SuspectDimensions suspectDimensions = depthService.suspectDimensionsQueryByACCT(ACCT);
            log.info(suspectDimensions.toString());
            arrayList.add(suspectDimensions.getTradeFrequency());
            arrayList.add(suspectDimensions.getHighRiskyArea());
            arrayList.add(suspectDimensions.getCDHFF());
            arrayList.add(suspectDimensions.getSDFEIT());
            arrayList.add(suspectDimensions.getCFCT());
            arrayList.add(suspectDimensions.getCapitalOutflow());
        }
        return arrayList;
    }

    private List<Map.Entry<String, Float>> sortProbability(HashMap<String, Float> probability) {
        List<Map.Entry<String, Float>> sortList = new ArrayList<>(probability.entrySet()); //将probability的entryset放入list集合
        //对list进行排序，并通过Comparator传入自定义的排序规则
        sortList.sort((o1, o2) -> {
            if (o1.getValue() > o2.getValue())
                return -1;
            else if (o1.getValue().equals(o2.getValue()))
                return 0;
            else if (o1.getValue() < o2.getValue())
                return 1;
            return 0;
        });
        return sortList;
    }
}
