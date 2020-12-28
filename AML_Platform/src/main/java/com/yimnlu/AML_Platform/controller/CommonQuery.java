package com.yimnlu.AML_Platform.controller;

import com.yimnlu.AML_Platform.dao.GeneralQueryMapper;
import com.yimnlu.AML_Platform.dto.SuspectCommonQuery;
import com.yimnlu.AML_Platform.model.SysLoginModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/CommonQuery")
@Slf4j
@Api(tags = "CommonQuery", value = "CommonQuery")
public class CommonQuery {
    @Resource
    GeneralQueryMapper generalQueryMapper;

    @ResponseBody
    @ApiOperation(value = "SuspectCommonQuery", notes = "SuspectCommonQuery")
    @RequestMapping(value = "/SuspectCommonQuery", method = RequestMethod.GET)
    public List<SuspectCommonQuery> SuspectCommonQuery() {
        List<SuspectCommonQuery> list = generalQueryMapper.SuspectCommonQuery();
        log.info(list+"");
        return list;
    }

}
