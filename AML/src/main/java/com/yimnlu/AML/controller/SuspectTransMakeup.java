package com.yimnlu.AML.controller;


import com.yimnlu.AML.dao.suspectTransMakeupMapper;
import com.yimnlu.AML.dto.ERR_CODE_SET;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/SuspectTransMakeup")
@Slf4j
@Api(tags = "SuspectTransMakeup", value = "SuspectTransMakeup")
public class SuspectTransMakeup {
    @Resource
    suspectTransMakeupMapper STM;
    private List<String> batch;

    @ResponseBody
    @ApiOperation(value = "短期内资金分散转入、集中转出或者集中转入、分散转出，与客户身份、财务状况、经营业务明显不符", notes = "短期内资金分散转入、集中转出或者集中转入、分散转出，与客户身份、财务状况、经营业务明显不符")
    @GetMapping("/rule_1101")
    public void rule_1101(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam(value = "WORKDATE") String WORKDATE
            , @RequestParam(value = "LIMIT_COUNT", defaultValue = "5") BigDecimal LIMIT_COUNT) {
        log.info("rule_1101_Get param:" + DEPARTID + WORKDATE + LIMIT_COUNT);
    }

    @ResponseBody
    @ApiOperation(value = "短期内相同收付款人之间频繁发生资金收付，且交易金额接近大额交易标准", notes = "短期内相同收付款人之间频繁发生资金收付，且交易金额接近大额交易标准")
    @GetMapping("/rule_1102")
    public void rule_1102(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE
            , @RequestParam(value = "LIMIT_AMT_CNY") BigDecimal LIMIT_AMT_CNY
            , @RequestParam("LIMIT_AMT_USD") BigDecimal LIMIT_AMT_USD
            , @RequestParam("ENT_AMT_USD_TRANSFER") BigDecimal ENT_AMT_USD_TRANSFER
            , @RequestParam("ENT_AMT_CNY_TRANSFER") BigDecimal ENT_AMT_CNY_TRANSFER) {
        log.info("rule_1102_Get param:" + DEPARTID + WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "法人、其他组织和个体工商户短期内频繁收取与其经营业务明显无关的汇款或者自然人客户短期内频繁收取法人、其他组织的汇款", notes = "法人、其他组织和个体工商户短期内频繁收取与其经营业务明显无关的汇款或者自然人客户短期内频繁收取法人、其他组织的汇款")
    @GetMapping("/rule_1103")
    public void rule_1103(@RequestParam("DEPARTID") String DEPARTID, @RequestParam("WORKDATE") String WORKDATE) {
        log.info("rule_1103_Get param:" + DEPARTID + WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "长期闲置的账户原因不明地突然启用或者平常资金流量小的账户突然有异常资金流入且短期内出现大量资金收付", notes = "长期闲置的账户原因不明地突然启用或者平常资金流量小的账户突然有异常资金流入且短期内出现大量资金收付")
    @GetMapping("/rule_1104")
    public void rule_1104(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE
            , @RequestParam(value = "INFLOWDAYS", defaultValue = "10") int INFLOWDAYS
            , @RequestParam(value = "USUALDAYS", defaultValue = "180") int USUALDAYS
            , @RequestParam(value = "MULTIPLENUM", defaultValue = "10") int MULTIPLENUM
            , @RequestParam(value = "AMT_CNY_CASH", defaultValue = "16000") BigDecimal AMT_CNY_CASH
            , @RequestParam(value = "AMT_USD_CASH", defaultValue = "8000") BigDecimal AMT_USD_CASH
            , @RequestParam(value = "AMT_CNY_TRANSFER", defaultValue = "400000") BigDecimal AMT_CNY_TRANSFER
            , @RequestParam(value = "AMT_USD_TRANSFER", defaultValue = "80000") BigDecimal AMT_USD_TRANSFER) {
        log.info("rule_1104_Get param:" + DEPARTID + WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "与来自于贩毒、走私、恐怖活动、赌博严重地区或者避税型离岸金融中心的客户之间的资金往来活动在短期内明显增多，或者频繁发生大量资金收付", notes = "与来自于贩毒、走私、恐怖活动、赌博严重地区或者避税型离岸金融中心的客户之间的资金往来活动在短期内明显增多，或者频繁发生大量资金收付")
    @GetMapping("/rule_1105")
    public void rule_1105(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE
            , @RequestParam(value = "INFLOWDAYS", defaultValue = "10") int INFLOWDAYS
            , @RequestParam(value = "USUALDAYS", defaultValue = "180") int USUALDAYS
            , @RequestParam(value = "MULTIPLENUM", defaultValue = "10") int MULTIPLENUM
            , @RequestParam(value = "AMT_CNY_CASH", defaultValue = "160000") BigDecimal AMT_CNY_CASH
            , @RequestParam(value = "AMT_USD_CASH", defaultValue = "8000") BigDecimal AMT_USD_CASH
            , @RequestParam(value = "PER_AMT_CNY_TRANSFER", defaultValue = "400000") BigDecimal PER_AMT_CNY_TRANSFER
            , @RequestParam(value = "PER_AMT_USD_TRANSFER", defaultValue = "80000") BigDecimal PER_AMT_USD_TRANSFER
            , @RequestParam(value = "ENT_AMT_CNY_TRANSFER", defaultValue = "1600000") BigDecimal ENT_AMT_CNY_TRANSFER
            , @RequestParam(value = "ENT_AMT_USD_TRANSFER", defaultValue = "180000") BigDecimal ENT_AMT_USD_TRANSFER) {
        log.info("rule_1104_Get param:" + DEPARTID + WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "没有正常原因的多头开户、销户，且销户前发生大量资金收付", notes = "没有正常原因的多头开户、销户，且销户前发生大量资金收付")
    @GetMapping("/rule_1106")
    public void rule_1106(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE
            , @RequestParam(value = "AMT_CNY_CASH", defaultValue = "160000") BigDecimal AMT_CNY_CASH
            , @RequestParam(value = "AMT_USD_CASH", defaultValue = "8000") BigDecimal AMT_USD_CASH
            , @RequestParam(value = "PER_AMT_CNY_TRANSFER", defaultValue = "400000") BigDecimal PER_AMT_CNY_TRANSFER
            , @RequestParam(value = "PER_AMT_USD_TRANSFER", defaultValue = "80000") BigDecimal PER_AMT_USD_TRANSFER
            , @RequestParam(value = "ENT_AMT_CNY_TRANSFER", defaultValue = "1600000") BigDecimal ENT_AMT_CNY_TRANSFER
            , @RequestParam(value = "ENT_AMT_USD_TRANSFER", defaultValue = "180000") BigDecimal ENT_AMT_USD_TRANSFER
            , @RequestParam(value = "DAYS", defaultValue = "30") int DAYS
            , @RequestParam(value = "OPEN_ACCOUNTS", defaultValue = "4") int OPEN_ACCOUNTS
            , @RequestParam(value = "CLOSE_ACCOUNTS", defaultValue = "2") int CLOSE_ACCOUNTS) {
        log.info("rule_1104_Get param:" + DEPARTID + WORKDATE + PER_AMT_CNY_TRANSFER);
    }

    @ResponseBody
    @ApiOperation(value = "提前偿还贷款，与其业务状况明显不符", notes = "提前偿还贷款，与其业务状况明显不符")
    @GetMapping("/rule_1107")
    public void rule_1107(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        log.info("rule_1104_Get param:" + DEPARTID + WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "客户用于境外投资的购汇人民币资金大部分为现金或者从非同名银行账户转入", notes = "客户用于境外投资的购汇人民币资金大部分为现金或者从非同名银行账户转入")
    @GetMapping("/rule_1108")
    public void rule_1108(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        log.info("rule_1104_Get param:" + DEPARTID + WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "客户要求进行本外币间的掉期业务，而其资金的来源和用途可疑", notes = "客户要求进行本外币间的掉期业务，而其资金的来源和用途可疑")
    @GetMapping("/rule_1109")
    public void rule_1109(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        log.info("rule_1104_Get param:" + DEPARTID + WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "客户经常存入境外开立的旅行支票或者外币汇票存款，与其经营状况不符", notes = "客户经常存入境外开立的旅行支票或者外币汇票存款，与其经营状况不符")
    @GetMapping("/rule_1110")
    public void rule_1110(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE
            , @RequestParam(value = "TRANS_COUNT", defaultValue = "2") int TRANS_COUNT) {
        log.info("rule_1104_Get param:" + DEPARTID + WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "外商投资企业以外币现金方式进行投资或者在收到投资款后在短期内将资金迅速转到境外与其生产经营支付需求不符", notes = "外商投资企业以外币现金方式进行投资或者在收到投资款后在短期内将资金迅速转到境外与其生产经营支付需求不符")
    @GetMapping("/rule_1111")
    public void rule_1111(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE
            , @RequestParam(value = "PERCENTAGE", defaultValue = "80") int PERCENTAGE) {
        log.info("rule_1104_Get param:" + DEPARTID + WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "外商投资企业外方借入的之际外债，从无关联企业的第三国汇入", notes = "外商投资企业外方借入的之际外债，从无关联企业的第三国汇入")
    @GetMapping("/rule_1112")
    public void rule_1112(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        log.info("rule_1104_Get param:" + DEPARTID + WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "证券经营机构指令银行划出与证券交易、清算无关的资金，与其实际经营情况不符", notes = "证券经营机构指令银行划出与证券交易、清算无关的资金，与其实际经营情况不符")
    @GetMapping("/rule_1113")
    public void rule_1113(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        log.info("rule_1104_Get param:" + DEPARTID + WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "证券经营机构通过银行频繁大量资金收付", notes = "证券经营机构通过银行频繁大量资金收付")
    @GetMapping("/rule_1114")
    public void rule_1114(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE
            , @RequestParam(value = "AMT_CNY", defaultValue = "1800000") BigDecimal AMT_CNY
            , @RequestParam(value = "AMT_USD", defaultValue = "80000") BigDecimal AMT_USD) {
        log.info("rule_1104_Get param:" + DEPARTID + WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "保险机构通过银行频繁大量对同一家投保人发生赔付或者办理退保", notes = "保险机构通过银行频繁大量对同一家投保人发生赔付或者办理退保")
    @GetMapping("/rule_1115")
    public void rule_1115(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        log.info("rule_1104_Get param:" + DEPARTID + WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "自然人银行账户频繁进行现金收付且情形可疑，或者一次性大额存取现金且情形可疑", notes = "证自然人银行账户频繁进行现金收付且情形可疑，或者一次性大额存取现金且情形可疑")
    @GetMapping("/rule_1116")
    public void rule_1116(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE
            , @RequestParam(value = "AMT_CNY", defaultValue = "1800000") BigDecimal AMT_CNY
            , @RequestParam(value = "AMT_USD", defaultValue = "80000") BigDecimal AMT_USD) {
        log.info("");
    }

    @ResponseBody
    @ApiOperation(value = "居民自然人频繁收到境外汇入的外汇或者非居民自然人频繁存入外币现钞", notes = "居民自然人频繁收到境外汇入的外汇或者非居民自然人频繁存入外币现钞")
    @GetMapping("/rule_1117")
    public void rule_1117(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        log.info("");
    }

    @ResponseBody
    @ApiOperation(value = "多个境内居民接受一个离岸账户汇款，其资金的划转和结汇均由一人或者少数人操作", notes = "多个境内居民接受一个离岸账户汇款，其资金的划转和结汇均由一人或者少数人操作")
    @GetMapping("/rule_1118")
    public void rule_1118(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE
            , @RequestParam(value = "PERCENTAGE", defaultValue = "3") int ACCT_COUNT) {
        log.info("rule_1104_Get param:" + DEPARTID + WORKDATE);
    }

    @ResponseBody
    @ApiOperation(value = "一个月以内账户收付累计总金额大于人民币200万元（含）账户境内转入数量15次以上（含）账户境内转出数量2次以下（含）", notes = "一个月以内账户收付累计总金额大于人民币200万元（含）账户境内转入数量15次以上（含）账户境内转出数量2次以下（含）")
    @GetMapping("/rule_R0001")
    public void rule_R0001(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        try {
            List<ERR_CODE_SET> err_code_sets = STM.rule_R0001(DEPARTID, WORKDATE);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + " Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ResponseBody
    @ApiOperation(value = "一个月以内账户收付累计总金额大于人民币200万元（含）账户境内转入数量2次以下（含）账户境内转出数量15次以上（含）", notes = "一个月以内账户收付累计总金额大于人民币200万元（含）账户境内转入数量2次以下（含）账户境内转出数量15次以上（含）")
    @GetMapping("/rule_R0002")
    public void rule_R0002(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        try {
            List<ERR_CODE_SET> err_code_sets = STM.rule_R0002(DEPARTID, WORKDATE);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + " Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ResponseBody
    @ApiOperation(value = "一个月以内账户收付累计总金额大于人民币200万元（含）账户跨境转入数量10次以上（含）账户跨境转出数量2次以下（含）客户所在地高风险（本行客户和交易对手）", notes = "一个月以内账户收付累计总金额大于人民币200万元（含）账户跨境转入数量10次以上（含）账户跨境转出数量2次以下（含）客户所在地高风险（本行客户和交易对手）")
    @GetMapping("/rule_R0003")
    public void rule_R0003(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        try {
            List<ERR_CODE_SET> err_code_sets = STM.rule_R0003(DEPARTID, WORKDATE);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + " Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ResponseBody
    @ApiOperation(value = "一个月以内账户收付累计总金额大于人民币200万元（含）账户跨境转入数量2次以下（含）账户跨境转出数量10次以下（含）客户所在地高风险（本行客户和交易对手）", notes = "一个月以内账户收付累计总金额大于人民币200万元（含）账户跨境转入数量2次以下（含）账户跨境转出数量10次以下（含）客户所在地高风险（本行客户和交易对手）")
    @GetMapping("/rule_R0004")
    public void rule_R0004(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        try {
            List<ERR_CODE_SET> err_code_sets = STM.rule_R0004(DEPARTID, WORKDATE);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + " Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ResponseBody
    @ApiOperation(value = "一个月以内与高风险国家的跨境交易账户收付数量2次以上（含）", notes = "一个月以内与高风险国家的跨境交易账户收付数量2次以上（含）")
    @GetMapping("/rule_R0005")
    public void rule_R0005(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        try {
            List<ERR_CODE_SET> err_code_sets = STM.rule_R0005(DEPARTID, WORKDATE);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + " Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ResponseBody
    @ApiOperation(value = "一个月以内账户收付累计总金额大于人民币200万元（含）一年未发生交易的账户收付", notes = "一个月以内账户收付累计总金额大于人民币200万元（含）一年未发生交易的账户收付")
    @GetMapping("/rule_R0006")
    public void rule_R0006(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        try {
            List<ERR_CODE_SET> err_code_sets = STM.rule_R0006(DEPARTID, WORKDATE);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + " Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ResponseBody
    @ApiOperation(value = "一个月以内账户收付累计总金额大于人民币200万元（含）没有正常原因销户的账户收付", notes = "一个月以内账户收付累计总金额大于人民币200万元（含）没有正常原因销户的账户收付")
    @GetMapping("/rule_R0007")
    public void rule_R0007(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        try {
            List<ERR_CODE_SET> err_code_sets = STM.rule_R0007(DEPARTID, WORKDATE);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + " Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ResponseBody
    @ApiOperation(value = "一个月以内向境内资本金账户转入从资本金账户转出境外", notes = "一个月以内向境内资本金账户转入从资本金账户转出境外")
    @GetMapping("/rule_R0008")
    public void rule_R0008(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        try {
            List<ERR_CODE_SET> err_code_sets = STM.rule_R0008(DEPARTID, WORKDATE);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + " Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ResponseBody
    @ApiOperation(value = "一个月以内境内外债账户借入境外贷款", notes = "一个月以内境内外债账户借入境外贷款")
    @GetMapping("/rule_R0009")
    public void rule_R0009(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        try {
            List<ERR_CODE_SET> err_code_sets = STM.rule_R0009(DEPARTID, WORKDATE);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + " Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ResponseBody
    @ApiOperation(value = "批量运行R0001_R0009", notes = "批量运行R0001_R0009")
    @GetMapping("/Batch/R000X")
    public void Batch_R000X(
            @RequestParam("DEPARTID") String DEPARTID
            , @RequestParam("WORKDATE") String WORKDATE) {
        log.info("---------------------Ready to batch R0001 to R0009---------------------");
        log.info("Param: DEPARTID:" + DEPARTID + " WORKDATE:" + WORKDATE);
        log.info("Executing R0001>>>>>>>>>>>>>");
        rule_R0001(DEPARTID, WORKDATE);
        log.info("Executing R0002>>>>>>>>>>>>>");
        rule_R0002(DEPARTID, WORKDATE);
        log.info("Executing R0003>>>>>>>>>>>>>");
        rule_R0003(DEPARTID, WORKDATE);
        log.info("Executing R0004>>>>>>>>>>>>>");
        rule_R0004(DEPARTID, WORKDATE);
        log.info("Executing R0005>>>>>>>>>>>>>");
        rule_R0005(DEPARTID, WORKDATE);
        log.info("Executing R0006>>>>>>>>>>>>>");
        rule_R0006(DEPARTID, WORKDATE);
        log.info("Executing R0007>>>>>>>>>>>>>");
        rule_R0007(DEPARTID, WORKDATE);
        log.info("Executing R0008>>>>>>>>>>>>>");
        rule_R0008(DEPARTID, WORKDATE);
        log.info("Executing R0009>>>>>>>>>>>>>");
        rule_R0009(DEPARTID, WORKDATE);
        log.info("---------------------Batch finished---------------------");
    }
}
