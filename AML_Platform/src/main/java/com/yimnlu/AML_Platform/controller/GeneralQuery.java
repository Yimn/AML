package com.yimnlu.AML_Platform.controller;

import com.yimnlu.AML_Platform.entity.AmlDTA;
import com.yimnlu.AML_Platform.executor.AmlDTA.dtaStorage.dtaStorage;
import com.yimnlu.AML_Platform.model.ListQuery;
import com.yimnlu.AML_Platform.service.GeneralQueryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

import static com.yimnlu.AML_Platform.executor.DICT.DEFAULT_WORKDATE;

@RestController
@RequestMapping("/CommonQuery")
@Slf4j
@Api(tags = "CommonQuery", value = "CommonQuery")
public class GeneralQuery {
    @Resource
    GeneralQueryService generalQueryService;

    @PostConstruct
    @ResponseBody
    @ApiOperation(value = "updateDTA", notes = "updateDTA")
    @RequestMapping(value = "/updateDTA", method = RequestMethod.GET)
    public List<AmlDTA> updateDTA() {
        dtaStorage.amlDTAList = generalQueryService.SuspectCommonQuery();
        log.info("AmlDTA updated");
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
        return generalQueryService.SuspectMonthQuery(WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "SuspectListQuery", notes = "SuspectListQuery")
    @RequestMapping(value = "/SuspectListQuery", method = RequestMethod.GET)
    public List<AmlDTA> SuspectListQuery(ListQuery l1) {
        log.info(l1.toString()+"");
        String WORKDATE = l1.getWORKDATE();
        String DEPARTID = l1.getDEPARTID();
        if (l1.getDEPARTID().length()>0 && l1.getWORKDATE().length()>0){
            log.info("SuspectListQuery-> "+WORKDATE+" "+DEPARTID);
            return generalQueryService.SuspectListQuery(WORKDATE,DEPARTID);}
        else if (l1.getWORKDATE().length()>0){
            log.info("SuspectListQuery-> "+WORKDATE+" "+DEPARTID);
            return generalQueryService.SuspectMonthQuery(WORKDATE);}
        return null;
    }

    @ResponseBody
    @ApiOperation(value = "DTAQuery", notes = "DTAQuery")
    @RequestMapping(value = "/DTAQuery", method = RequestMethod.GET)
    public List<AmlDTA> DTAQuery() {
        return updateDTA();
    }
}
