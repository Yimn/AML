package com.yimnlu.AML.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/SuspectTransMakeUp")
@Slf4j
@Api(tags = "SuspectTransMakeUp", value = "SuspectTransMakeUp")
public class SuspectTransMakeUp {

    @ApiOperation(value = "show", notes = "show")
    @GetMapping("/update")
    public void Test(){
        log.info("suspectTransMakeUp");
    }

}
