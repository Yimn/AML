package com.yimnlu.AML.controller;


import com.yimnlu.AML.dao.AmlStatusMapper;
import com.yimnlu.AML.entity.AmlStatus;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author luyimin
 * @since 2021-03-10
 */
@RestController
@CrossOrigin
@Slf4j
@Api(tags = "AmlStatusController", value = "AmlStatusController")
@RequestMapping("/amlStatus")
public class AmlStatusController {
    @Resource
    AmlStatusMapper amlStatusMapper;

    @PostConstruct
    @ApiOperation(value = "Init_Status", notes = "Init_Status")
    @GetMapping("/Init_Status")
    public void Init_Status() {
        amlStatusMapper.InitStatus();
        log.info("AML_Status Initialed");
    }

    @ApiOperation(value = "Check_Status", notes = "Check_Status")
    @GetMapping("/Check_Status")
    public Integer Check_Status(String FUNC) {
        AmlStatus amlStatus = amlStatusMapper.ReachStatus(FUNC);
        switch (amlStatus.getStatus()) {
            case 1:
                return null;
            default:
                return amlStatus.getStatus();
        }
    }

    @ApiOperation(value = "Check_Status", notes = "Check_Status")
    @GetMapping("/Check_Status_Default")
    public Number Check_Status() {
        List<AmlStatus> list = amlStatusMapper.ReachAllStatus();
        for (AmlStatus amlStatus : list) {
            if (amlStatus.getStatus() == 0)
                return amlStatus.getStatus();
        }
        return null;
    }

    @ApiOperation(value = "Make_Status", notes = "Make_Status")
    @GetMapping("/Make_Status")
    public void Make_Status(int STATUS, String FUNC_NAME) {
        log.info(FUNC_NAME + " will be set to " + STATUS);
        amlStatusMapper.UpdateFuncStatus(STATUS, FUNC_NAME);
    }
}

