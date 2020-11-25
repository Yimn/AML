package com.yimnlu.AML_Platform.controller;

import com.alibaba.fastjson.JSONObject;
import com.yimnlu.AML_Platform.model.SysLoginModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/sys")
@Slf4j
@Api(tags = "SysController", value = "SysController")
public class SysController {

    @ResponseBody
    @ApiOperation(value = "login", notes = "login")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView Login(@RequestBody SysLoginModel sysLoginModel){
        String username = sysLoginModel.getUsername();
        String password = sysLoginModel.getPassword();
        Map map = new HashMap();
        map.put("name","name");
        return new ModelAndView(new MappingJackson2JsonView(), map);
    }

    @ResponseBody
    @ApiOperation(value = "console", notes = "console")
    @RequestMapping(value = "/console", method = RequestMethod.POST)
    public ModelAndView webConsole(@RequestParam("console")String console, HttpServletRequest request){
        try {
            log.info(request.getParameter("console1"));
        }catch (Exception e){
            e.printStackTrace();
        }
        log.info("Web console:"+console);
        Map map = new HashMap();
        map.put("Log","200");
        return new ModelAndView(new MappingJackson2JsonView(), map);
    }
}
