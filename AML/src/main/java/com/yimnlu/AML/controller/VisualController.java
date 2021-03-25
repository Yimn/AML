package com.yimnlu.AML.controller;

import com.yimnlu.AML.dao.presentationMapper;
import com.yimnlu.AML.entity.AML_Dict;
import com.yimnlu.AML.model.visualByRule;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/visual")
@Slf4j
@Api(tags = "VisualController", value = "VisualController")
public class VisualController {
    @ApiOperation(value = "update", notes = "update")
    @GetMapping("/update")
    public Object h(){
        ArrayList<String> dimensions = new ArrayList<>();
        dimensions.add("name");
        dimensions.add("age");
        dimensions.add("profession");
        dimensions.add("date");


        ArrayList<ArrayList> source = new ArrayList<>();
        ArrayList sourceData = new ArrayList<>();


        sourceData.add("Krause");
        sourceData.add(41);
        sourceData.add("Engineer");
        sourceData.add(314);
        sourceData.add("2011-02-12");
        source.add(sourceData);

        ArrayList[][] data = new ArrayList[1][2];
        data[0][0] = dimensions;
        data[0][1] = source;
        return data;
    }

    @ApiOperation(value = "sortByRule", notes = "sortByRule")
    @GetMapping("/sortByRule")
    public void sortByRule(){

    }
    @Resource
    com.yimnlu.AML.dao.presentationMapper presentationMapper;

    @ApiOperation(value = "visualByRule", notes = "visualByRule")
    @GetMapping("/visualByRule")
    public ArrayList<visualByRule> visualByRule(){
        HashMap<String,String> map = TbAnalysisrulesController._After_Analysis_Rules_;
        ArrayList<visualByRule> arrayList = new ArrayList<>();
        for (String key: map.keySet()){
            List<AML_Dict> list = presentationMapper.visualByRule(key);
            if (!list.isEmpty())
                //arrayList.add(new visualByRule(list.size(),key,map.get(key)));
                arrayList.add(new visualByRule(list.size(),map.get(key),key));
        }
        return arrayList;
    }
    @ApiOperation(value = "visualByRuleBw8_12", notes = "visualByRuleBw8_12")
    @GetMapping("/visualByRuleBw8_12")
    public ArrayList<visualByRule> visualByRuleBw8_12(){
        HashMap<String,String> map = TbAnalysisrulesController._After_Analysis_Rules_;
        ArrayList<visualByRule> arrayList = new ArrayList<>();
        for (String key: map.keySet()){
            List<AML_Dict> list = presentationMapper.visualByRuleBw8_12(key);
            if (!list.isEmpty())
                //arrayList.add(new visualByRule(list.size(),key,map.get(key)));
                arrayList.add(new visualByRule(list.size(),map.get(key),key));
        }
        return arrayList;
    }
}
