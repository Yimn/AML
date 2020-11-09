package com.yimnlu.AML.controller;

import com.yimnlu.AML.dao.AML_Dict;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/AML_DICT")
@Slf4j
@Api(tags = "AML_DICT", value = "AML_DICT")
public class AML_DICT {
    public static List<com.yimnlu.AML.entity.AML_Dict> _LIST_AML_DICT_;
    public static List<com.yimnlu.AML.entity.AML_Dict> _LIST_AML_DICT_GROUP_;
    public static List<com.yimnlu.AML.entity.AML_Dict> _LIST_AML_DICT_META_;

    @Resource
    AML_Dict aml_dict;

    @ApiOperation(value = "show", notes = "show")
    @GetMapping("/update")
    public void update(){
        _LIST_AML_DICT_ = aml_dict.getEnabled();
    }
}
