package com.yimnlu.AML.controller;

import com.yimnlu.AML.dao.AmlStatusMapper;
import com.yimnlu.AML.dao.hugeTransMakeupMapper;
import com.yimnlu.AML.dto.ERR_CODE_SET;
import com.yimnlu.AML.entity.AmlStatus;
import com.yimnlu.AML.executor.staticReturn.TodayWorkDate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static com.yimnlu.AML.executor.DICT.*;
import static com.yimnlu.AML.executor.staticReturn.TimeUtils.getDaysByYearMonth;

@RestController
@CrossOrigin
@RequestMapping("/HugeTransMakeup")
@Slf4j
@Api(tags = "HugeTransMakeup", value = "HugeTransMakeup")
public class HugeTransMakeupController {
    @Resource
    hugeTransMakeupMapper hugeTransMakeupmapper;

    @ApiOperation(value = "单笔或者当日累计人民币交易5万元以上或者外币交易等值1万美元以上的现金缴存、现金支取、现金结售汇、现钞兑换、现金汇款、现金票据解付及其他形式的现金收支。", notes = "单笔或者当日累计人民币交易5万元以上或者外币交易等值1万美元以上的现金缴存、现金支取、现金结售汇、现钞兑换、现金汇款、现金票据解付及其他形式的现金收支。")
    @GetMapping("/rule_0901")
    public void rule_0901(@RequestParam("DEPARTID") String DEPARTID
            , @RequestParam(value = "WORKDATE") String WORKDATE) {
        try {
            if (WORKDATE.equals(DEFAULT_WORKDATE)) {
                WORKDATE = TodayWorkDate.WORKDATE();
                log.info(DEFAULT_DUPLICATE_WORKDATE);
            }
            if (DEPARTID.equals(DEFAULT_WORKDATE)) {
                DEPARTID = DEFAULT_DEPART_ID;
                log.info(DEFAULT_DUPLICATE_DEPART_ID);
            }
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
            if (WORKDATE.equals(DEFAULT_WORKDATE)) {
                WORKDATE = TodayWorkDate.WORKDATE();
                log.info(DEFAULT_DUPLICATE_WORKDATE);
            }
            if (DEPARTID.equals(DEFAULT_WORKDATE)) {
                DEPARTID = DEFAULT_DEPART_ID;
                log.info(DEFAULT_DUPLICATE_DEPART_ID);
            }
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
            if (WORKDATE.equals(DEFAULT_WORKDATE)) {
                WORKDATE = TodayWorkDate.WORKDATE();
                log.info(DEFAULT_DUPLICATE_WORKDATE);
            }
            if (DEPARTID.equals(DEFAULT_WORKDATE)) {
                DEPARTID = DEFAULT_DEPART_ID;
                log.info(DEFAULT_DUPLICATE_DEPART_ID);
            }
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
            if (WORKDATE.equals(DEFAULT_WORKDATE)) {
                WORKDATE = TodayWorkDate.WORKDATE();
                log.info(DEFAULT_DUPLICATE_WORKDATE);
            }
            if (DEPARTID.equals(DEFAULT_WORKDATE)) {
                DEPARTID = DEFAULT_DEPART_ID;
                log.info(DEFAULT_DUPLICATE_DEPART_ID);
            }
            List<ERR_CODE_SET> err_code_sets = hugeTransMakeupmapper.rule_0904(DEPARTID, WORKDATE);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + " Finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Resource
    AmlStatusMapper amlStatusMapper;

    @ResponseBody
    @ApiOperation(value = "批量运行090X", notes = "批量运行090X")
    @GetMapping("/Batch/090X")
    public void Batch_090X(
            @RequestParam(value = "DEPARTID", defaultValue = DEFAULT_DEPART_ID) String DEPARTID
            , @RequestParam(value = "WORKDATE", defaultValue = DEFAULT_WORKDATE) String WORKDATE) {
        log.info("---------------------Ready to batch rule_0901 to rule_0904---------------------");
        if (WORKDATE.equals(DEFAULT_WORKDATE)) {
            WORKDATE = TodayWorkDate.WORKDATE();
            log.info(DEFAULT_DUPLICATE_WORKDATE);
        }
        if (DEPARTID.equals(DEFAULT_WORKDATE)) {
            DEPARTID = DEFAULT_DEPART_ID;
            log.info(DEFAULT_DUPLICATE_DEPART_ID);
        }
        log.info("Param: DEPARTID:" + DEPARTID + " WORKDATE:" + WORKDATE);
        log.info("Executing rule_0901>>>>>>>>>>>>>");
        rule_0901(DEPARTID, WORKDATE);
        log.info("Executing rule_0902>>>>>>>>>>>>>");
        rule_0902(DEPARTID, WORKDATE);
        log.info("Executing rule_0903>>>>>>>>>>>>>");
        rule_0903(DEPARTID, WORKDATE);
        log.info("Executing rule_0904>>>>>>>>>>>>>");
        rule_0904(DEPARTID, WORKDATE);
        log.info("---------------------------------Batch finished-------------------------------");
    }

    @ResponseBody
    @ApiOperation(value = "按系统预设分析2019年9月到2019年12月的数据(Demo)", notes = "按系统预设分析2019年9月到2019年12月的数据(Demo)")
    @GetMapping("/BatchDemo")
    public void BatchDemo() {
        Date a = new Date(119, 8, 1);
        Date b = new Date(119, 9, 1);
        Date c = new Date(119, 10, 1);
        dayReport(a);
        //dayReport(b);
        //dayReport(c);
        amlStatusMapper.InitStatus();
    }

    @ResponseBody
    @ApiOperation(value = "按系统预设分析2019年9月到2019年12月的数据", notes = "按系统预设分析2019年9月到2019年12月的数据")
    @GetMapping("/Batch")
    public void Batch() {
        try {
            AmlStatus amlStatus = amlStatusMapper.ReachStatus("HugeTransMakeup_Batch");
            if (amlStatus.getStatus() == 0) {
                amlStatusMapper.UpdateFuncStatus(1, "HugeTransMakeup_Batch");
                Date a = new Date(119, 8, 1);
                Date b = new Date(119, 9, 1);
                Date c = new Date(119, 10, 1);
                dayReport(a);
                dayReport(b);
                dayReport(c);
                amlStatusMapper.UpdateFuncStatus(0, "HugeTransMakeup_Batch");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dayReport(Date month) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(month);//month 为指定月份任意日期
        int year = cal.get(Calendar.YEAR);
        int m = cal.get(Calendar.MONTH);
        int dayNumOfMonth = getDaysByYearMonth(year, m);
        cal.set(Calendar.DAY_OF_MONTH, 1);// 从一号开始

        for (int i = 0; i < dayNumOfMonth; i++, cal.add(Calendar.DATE, 1)) {
            Date d = cal.getTime();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            String df = simpleDateFormat.format(d);
            //log.info(df);
            try {
                AmlStatus amlStatus = amlStatusMapper.ReachStatus("HugeTransMakeup_Batch");
                if (amlStatus.getStatus() == 1)
                    Batch_090X(DEFAULT_DEPART_ID, df);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}