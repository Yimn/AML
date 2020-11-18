package com.yimnlu.AML.controller;

import com.yimnlu.AML.dao.presentationMapper;
import com.yimnlu.AML.entity.AML_ANALYSISRESULT;
import com.yimnlu.AML.executor.staticReturn.TodayWorkDate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static com.yimnlu.AML.executor.DICT.*;

@RestController
@CrossOrigin
@RequestMapping("/Presentation")
@Slf4j
@Api(tags = "Presentation", value = "Presentation")
public class PresentationController {
    @Resource
    presentationMapper presentationMapper;

    @ResponseBody
    @ApiOperation(value = "queryByWorkDate", notes = "queryByWorkDate")
    @GetMapping("/queryByWorkDate")
    public void queryByWorkDate(@RequestParam(value = "WORKDATE", defaultValue = "00000000") String WORKDATE) {
        try {
            if (WORKDATE.equals(DEFAULT_WORKDATE)) {
                WORKDATE = TodayWorkDate.WORKDATE();
                log.info(DEFAULT_DUPLICATE_WORKDATE);
            }
            List<AML_ANALYSISRESULT> aml_analysisresultList = presentationMapper.selectByWorkDate(WORKDATE);
            log.info("Query " + aml_analysisresultList.size() + aml_analysisresultList);
            log.info(Thread.currentThread().getStackTrace()[1].getMethodName() + _FINISHED);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
