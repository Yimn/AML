package com.yimnlu.AML.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
@CrossOrigin
@RequestMapping("/HugeTransMakeup")
@Slf4j
@Api(tags = "HugeTransMakeup", value = "HugeTransMakeup")
public class HugeTransMakeup {
//    @Resource
//    com.yimnlu.AML.dao.HugeTransMakeup hugeTransMakeup;
//
    @ApiOperation(value = "show", notes = "show")
    @GetMapping("/update")
    public void Test(){
        //HashMap<String,String> hashMap = hugeTransMakeup.SP_AFTERIMPORT_R0001("10385194","20190923");
        //log.info(hashMap+"");
        log.info("hugeTransMakeup");
    }
}
