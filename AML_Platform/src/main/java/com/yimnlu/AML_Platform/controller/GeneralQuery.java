package com.yimnlu.AML_Platform.controller;

import com.alibaba.fastjson.JSONObject;
import com.yimnlu.AML_Platform.dao.CommonAnalysisQueryMapper;
import com.yimnlu.AML_Platform.entity.AmlDTA;
import com.yimnlu.AML_Platform.entity.CountryCode;
import com.yimnlu.AML_Platform.executor.AmlDTA.dtaStorage.dtaStorage;
import com.yimnlu.AML_Platform.executor.staticReturn.TodayWorkDate;
import com.yimnlu.AML_Platform.model.ListQuery;
import com.yimnlu.AML_Platform.service.GeneralQueryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.yimnlu.AML_Platform.executor.DICT.DEFAULT_DEPART_ID;
import static com.yimnlu.AML_Platform.executor.DICT.DEFAULT_WORKDATE;

@RestController
@RequestMapping("/CommonQuery")
@Slf4j
@Api(tags = "CommonQuery", value = "CommonQuery")
public class GeneralQuery {
    @Resource
    GeneralQueryService generalQueryService;

    @Resource
    CommonAnalysisQueryMapper commonAnalysisQueryMapper;

    @PostConstruct
    @ResponseBody
    @ApiOperation(value = "updateDTA", notes = "updateDTA")
    @RequestMapping(value = "/updateDTA", method = RequestMethod.GET)
    public List<AmlDTA> updateDTA() {
        dtaStorage.amlDTAList = generalQueryService.SuspectCommonQuery();
        log.info("AmlDTA updated at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return dtaStorage.amlDTAList;
    }

    @ResponseBody
    @ApiOperation(value = "SuspectCommonQuery", notes = "SuspectCommonQuery")
    @RequestMapping(value = "/SuspectCommonQuery", method = RequestMethod.GET)
    public List<AmlDTA> SuspectCommonQuery() {
        log.info("SuspectCommonQuery-> " + DEFAULT_WORKDATE);
        return updateDTA();
    }

    @ResponseBody
    @ApiOperation(value = "SuspectMonthQuery", notes = "SuspectMonthQuery")
    @RequestMapping(value = "/SuspectMonthQuery", method = RequestMethod.GET)
    public List<AmlDTA> SuspectMonthQuery(@RequestParam(value = "WORKDATE", defaultValue = DEFAULT_WORKDATE) String WORKDATE) {
        log.info("SuspectMonthQuery-> " + WORKDATE);
        return generalQueryService.DTAQuery(WORKDATE, null, null);
    }

    @ResponseBody
    @ApiOperation(value = "SuspectListQuery", notes = "SuspectListQuery")
    @RequestMapping(value = "/SuspectListQuery", method = RequestMethod.GET)
    public List<AmlDTA> SuspectListQuery(ListQuery l1) {
        log.info(l1.toString() + "");
        String WORKDATE = l1.getWORKDATE();
        if (l1.getWORKDATE() == null)
            WORKDATE = null;
        else if (WORKDATE.equals(DEFAULT_WORKDATE))
            WORKDATE = TodayWorkDate.WORKDATE();
        String DEPARTID = l1.getDEPARTID();
        String REFNO = l1.getREFNO();
        if (DEPARTID.equals(DEFAULT_WORKDATE))
            DEPARTID = DEFAULT_DEPART_ID;
        log.info("SuspectListQuery->  " + WORKDATE + "  " + DEPARTID + "" + REFNO);
        List<AmlDTA> list = generalQueryService.DTAQuery(WORKDATE, DEPARTID, REFNO);
        log.info(list.toString());
        return list;
    }

    @ResponseBody
    @ApiOperation(value = "Suspect2Ref", notes = "Suspect2Ref")
    @RequestMapping(value = "/Suspect2Ref", method = RequestMethod.GET)
    public List<AmlDTA> Suspect2Ref(@RequestParam(value = "refNo") String refNo) {
        log.info("Suspect2Ref-> " + refNo);
        return generalQueryService.Suspect2Ref(refNo);
    }

    @ResponseBody
    @ApiOperation(value = "DTAQuery", notes = "DTAQuery")
    @RequestMapping(value = "/DTAQuery", method = RequestMethod.GET)
    public List<AmlDTA> DTAQuery() {
        return updateDTA();
    }

    @ResponseBody
    @ApiOperation(value = "T1argetMonthQuery", notes = "TargetMonthQuery")
    @RequestMapping(value = "/T1argetMonthQuery", method = RequestMethod.GET)
    public JSONObject T1argetMonthQuery() {
        JSONObject json = new JSONObject(true);
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<AmlDTA> list = updateDTA();
        for (int i = 0; i < 31; i++) {
            String handled_i;
            if (i < 10)
                handled_i = "2019110" + String.valueOf(i + 1);
            else
                handled_i = "201911" + String.valueOf(i + 1);
            list = generalQueryService.DTAQuery(handled_i, null, null);
            map.put(handled_i, list.size());
        }
        log.info(json.toJSONString());
        return json;
    }

    @ResponseBody
    @ApiOperation(value = "TargetMonthQuery", notes = "TargetMonthQuery")
    @RequestMapping(value = "/TargetMonthQuery", method = RequestMethod.GET)
    public JSONObject TargetMonthQuery() {
        JSONObject json = new JSONObject(true);
        List<AmlDTA> list = commonAnalysisQueryMapper.DESCbyCountry(null, "201911%");
        List<CountryCode> list1 = commonAnalysisQueryMapper.SelectCountryCode("201911%");
        List<AmlDTA> temp = new ArrayList<>();
        log.info("Size:" + list.size() + " " + list1.size());
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(j).getTRADE_VENUE_COUNTRY().equals(list.get(i).getTradeCountry())) {
                    //log.info("reach "+ list1.get(j).getTRADE_VENUE_COUNTRY()+" "+list.get(i));
                    json.put(list1.get(j).getTRADE_VENUE_COUNTRY(), list.get(i));
                }
            }
        }
        log.info(json.toJSONString());
        return json;
    }
}
