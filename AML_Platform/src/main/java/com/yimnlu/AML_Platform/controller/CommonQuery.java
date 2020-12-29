package com.yimnlu.AML_Platform.controller;

import com.yimnlu.AML_Platform.dao.GeneralQueryMapper;
import com.yimnlu.AML_Platform.dto.SuspectCommonQuery;
import com.yimnlu.AML_Platform.entity.AmlDTA;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static com.yimnlu.AML_Platform.executor.DICT.*;

@RestController
@RequestMapping("/CommonQuery")
@Slf4j
@Api(tags = "CommonQuery", value = "CommonQuery")
public class CommonQuery {
    @Resource
    GeneralQueryMapper generalQueryMapper;

    @ResponseBody
    @ApiOperation(value = "SuspectCommonQuery", notes = "SuspectCommonQuery")
    @RequestMapping(value = "/SuspectCommonQuery", method = RequestMethod.GET)
    public List<SuspectCommonQuery> SuspectCommonQuery() {
        List<SuspectCommonQuery> list = generalQueryMapper.SuspectCommonQuery();
        log.info(list+"");
        return list;
    }
    @ResponseBody
    @ApiOperation(value = "SuspectMonthQuery", notes = "SuspectMonthQuery")
    @RequestMapping(value = "/SuspectMonthQuery", method = RequestMethod.GET)
    public List<SuspectCommonQuery> SuspectMonthQuery(@RequestParam(value = "WORKDATE",defaultValue = DEFAULT_WORKDATE) String WORKDATE) {
        List<SuspectCommonQuery> list = generalQueryMapper.SuspectMonthQuery(WORKDATE);
        log.info("QUERIED DATE: "+ WORKDATE + "WITH " + list.size());
        return list;
    }

    @ResponseBody
    @ApiOperation(value = "DTAQuery", notes = "DTAQuery")
    @RequestMapping(value = "/DTAQuery", method = RequestMethod.GET)
    public List<AmlDTA> DTAQuery() {
        List<AmlDTA> list = generalQueryMapper.DTAQuery();
        return list;
    }
}
