package com.yimnlu.AML_Platform.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author luyimin
 * @since 2020-11-21
 */
@RestController
@RequestMapping("/biMapInfo")
@Slf4j
@Api(tags = "BiMapInfoController", value = "BiMapInfoController")
public class BiMapInfoController {

    @PostConstruct
    @ResponseBody
    @ApiOperation(value = "init_map", notes = "init_map")
    public void init_map() {

    }
}

