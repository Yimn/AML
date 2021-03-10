package com.yimnlu.AML_Platform.controller;


import com.yimnlu.AML_Platform.dto.AML_DICT_GROUP;
import com.yimnlu.AML_Platform.entity.AML_Dict;
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

@RestController
@CrossOrigin
@RequestMapping("/AML_DICT")
@Slf4j
@Api(tags = "AML_DICT", value = "AML_DICT")
public class AML_DICTController {

    public static List<AML_DICT_GROUP> _LIST_AML_DICT_;


    @Resource
    com.yimnlu.AML_Platform.dao.AML_DictMapper aml_dict;

    @PostConstruct
    @ApiOperation(value = "show", notes = "show")
    @GetMapping("/update")
    public void update() {
        try {
            _LIST_AML_DICT_ = aml_dict.getGROUP();
            log.info("AML_DICT Initialized");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
