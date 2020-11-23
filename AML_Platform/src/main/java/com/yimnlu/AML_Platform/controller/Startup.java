package com.yimnlu.AML_Platform.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/sys")
@Slf4j
@Api(tags = "AML_DICT", value = "AML_DICT")
public class Startup {

    @ResponseBody
    @ApiOperation(value = "_start", notes = "_start")
    @RequestMapping(value = "_start", method = RequestMethod.POST)
    public ModelAndView _start(@RequestParam("_param") String pa, HttpServletRequest request, HttpServletResponse response) {
        Map<String, String> map = new HashMap<>();
        map.put("valid", pa);
        return new ModelAndView(new MappingJackson2JsonView(), map);
    }

}
