package com.yimnlu.AML.controller;


import com.yimnlu.AML.dao.TbAnalysisrulesMapper;
import com.yimnlu.AML.entity.TbAnalysisrules;
import com.yimnlu.AML.executor.DICT;
import com.yimnlu.AML.service.TbAnalysisrulesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/TbAnalysisrules")
@Slf4j
@Api(tags = "TbAnalysisrules", value = "TbAnalysisrules")
public class TbAnalysisrulesController {

    private static List<TbAnalysisrules> _Analysis_Rules_;
    public static HashMap<String,String> _After_Analysis_Rules_;

    @Resource
    TbAnalysisrulesMapper tbAnalysisrulesMapper;

    @Resource
    TbAnalysisrulesService tbAnalysisrulesService;

    @PostConstruct
    @ApiOperation(value = "update", notes = "update")
    @GetMapping("/update")
    public void Init_TbAnalysisRules(){
        _Analysis_Rules_ = tbAnalysisrulesMapper.selectAll(DICT.DEFAULT_DEPART_ID);
        _After_Analysis_Rules_= tbAnalysisrulesService.TreatRules(_Analysis_Rules_);
        log.info("_Analysis_Rules_"+" Initialized");
    }

    @ApiOperation(value = "show", notes = "show")
    @GetMapping("/show")
    public void List_TbAnalysisRules(){
        log.info(_After_Analysis_Rules_+"");
    }

}

