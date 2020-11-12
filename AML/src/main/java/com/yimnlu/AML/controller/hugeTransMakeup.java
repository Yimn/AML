package com.yimnlu.AML.controller;

import com.yimnlu.AML.dao.hugeTransMakeupMapper;
import com.yimnlu.AML.dto.ERR_CODE_SET;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/HugeTransMakeup")
@Slf4j
@Api(tags = "HugeTransMakeup", value = "HugeTransMakeup")
public class hugeTransMakeup {
    @Resource
    hugeTransMakeupMapper hugeTransMakeupmapper;


    @ApiOperation(value = "单笔或者当日累计人民币交易5万元以上或者外币交易等值1万美元以上的现金缴存、现金支取、现金结售汇、现钞兑换、现金汇款、现金票据解付及其他形式的现金收支。", notes = "单笔或者当日累计人民币交易5万元以上或者外币交易等值1万美元以上的现金缴存、现金支取、现金结售汇、现钞兑换、现金汇款、现金票据解付及其他形式的现金收支。")
    @GetMapping("/rule_0901")
    public void rule_0901(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam(value = "WORKDATE") String WORKDATE) {
        try {
            List<ERR_CODE_SET> err_code_sets = hugeTransMakeupmapper.rule_0901(DEPARTID, WORKDATE);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + " Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ApiOperation(value = "法人、其他组织和个体工商户银行账户之间单笔或者当日累计人民币200万元以上或者外币等值20万美元以上的款项划转", notes = "法人、其他组织和个体工商户银行账户之间单笔或者当日累计人民币200万元以上或者外币等值20万美元以上的款项划转")
    @GetMapping("/rule_0902")
    public void rule_0902(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        try {
            List<ERR_CODE_SET> err_code_sets = hugeTransMakeupmapper.rule_0902(DEPARTID, WORKDATE);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + " Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ApiOperation(value = "规则描述：自然人银行账户之间，以及自然人与法人、其他组织和个体工商户银行账户之间单笔或者当日累计人民币50万元以上或者外币等值10万美元以上的款项划转", notes = "规则描述：自然人银行账户之间，以及自然人与法人、其他组织和个体工商户银行账户之间单笔或者当日累计人民币50万元以上或者外币等值10万美元以上的款项划转")
    @GetMapping("/rule_0903")
    public void rule_0903(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        try {
            List<ERR_CODE_SET> err_code_sets = hugeTransMakeupmapper.rule_0903(DEPARTID, WORKDATE);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + " Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ApiOperation(value = "交易一方为自然人、单笔或者当日累计等值1万美元以上的跨境交易", notes = "交易一方为自然人、单笔或者当日累计等值1万美元以上的跨境交易")
    @GetMapping("/rule_0904")
    public void rule_0904(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        try {
            List<ERR_CODE_SET> err_code_sets = hugeTransMakeupmapper.rule_0904(DEPARTID, WORKDATE);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + " Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ResponseBody
    @ApiOperation(value = "批量运行090X", notes = "批量运行090X")
    @GetMapping("/Batch/090X")
    public void Batch_090X(
            @RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        log.info("---------------------Ready to batch R0001 to R0009---------------------");
        log.info("Param: DEPARTID:" + DEPARTID + " WORKDATE:" + WORKDATE);
        log.info("Executing rule_0901>>>>>>>>>>>>>");
        rule_0901(DEPARTID, WORKDATE);
        log.info("Executing rule_0902>>>>>>>>>>>>>");
        rule_0902(DEPARTID, WORKDATE);
        log.info("Executing rule_0903>>>>>>>>>>>>>");
        rule_0903(DEPARTID, WORKDATE);
        log.info("Executing rule_0904>>>>>>>>>>>>>");
        rule_0904(DEPARTID, WORKDATE);
        log.info("-----------------------------Batch finished----------------------------");
    }
}
