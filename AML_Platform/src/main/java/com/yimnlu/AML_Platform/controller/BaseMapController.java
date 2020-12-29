package com.yimnlu.AML_Platform.controller;


import com.yimnlu.AML_Platform.dto.location;
import com.yimnlu.AML_Platform.service.BaseMapService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.annotation.Resource;
import java.util.HashMap;

import static com.yimnlu.AML_Platform.executor.DICT.DEFAULT_DEPART_ID;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yimnlu
 * @since 2020-11-21
 */
@Slf4j
@RestController
@RequestMapping("/baseMap")
public class BaseMapController {
    private static HashMap<String, location> _F_BASEMAP_LOCATION_ = new HashMap<>();
    @Resource
    BaseMapService baseMapService;

    @ResponseBody
    @RequestMapping(value = "/init_map", produces = "application/json;charset=UTF-8")
    @ApiOperation(value = "init_map", notes = "init_map")
    public ModelAndView init_map(@RequestParam(value = "DEPARTID", defaultValue = DEFAULT_DEPART_ID) String DEPARTID) {
        _F_BASEMAP_LOCATION_ = baseMapService.init_map(DEPARTID);
        return new ModelAndView(new MappingJackson2JsonView(), _F_BASEMAP_LOCATION_);
    }
}

