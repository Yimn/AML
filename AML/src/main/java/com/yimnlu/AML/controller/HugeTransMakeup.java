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
@RequestMapping("/HugeTransMakeup")
@Slf4j
@Api(tags = "HugeTransMakeup", value = "HugeTransMakeup")
public class HugeTransMakeup {

    @ApiOperation(value = "单笔或者当日累计人民币交易5万元以上或者外币交易等值1万美元以上的现金缴存、现金支取、现金结售汇、现钞兑换、现金汇款、现金票据解付及其他形式的现金收支。", notes = "单笔或者当日累计人民币交易5万元以上或者外币交易等值1万美元以上的现金缴存、现金支取、现金结售汇、现钞兑换、现金汇款、现金票据解付及其他形式的现金收支。")
    @GetMapping("/rule_0501")
    public void rule_0501() {

        log.info("");
    }
}
