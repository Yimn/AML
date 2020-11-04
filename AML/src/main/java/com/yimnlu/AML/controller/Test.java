package com.yimnlu.AML.controller;

import com.yimnlu.AML.dao.TestMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/Test")
@Slf4j
@Api(tags = "AML Test", value = "AML 测试用例")
public class Test{
    @Resource
    TestMapper testMapper;

    @ApiOperation(value = "cTest测试", notes = "Ctest")
    @GetMapping("/ctest")
    public void test(){
        log.info("test");
        List<com.yimnlu.AML.entity.Test> test =  testMapper.findByName();
        log.info(test+"");
    }

}
