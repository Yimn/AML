package com.yimnlu.AML.controller;

import com.alibaba.fastjson.JSONObject;
import com.yimnlu.AML.dao.presentationMapper;
import com.yimnlu.AML.entity.AML_Dict;
import com.yimnlu.AML.entity.AmlStatus;
import com.yimnlu.AML.model.visualByRule;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.yimnlu.AML.executor.DICT.DEFAULT_DEPART_ID;
import static com.yimnlu.AML.executor.staticReturn.TimeUtils.getDaysByYearMonth;

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

    @ApiOperation(value = "t", notes = "t")
    @GetMapping("/t")
    public Object t(){
        ArrayList arrayList = new ArrayList();
        ArrayList date = new ArrayList();
        ArrayList value = new ArrayList();
        JSONObject object = new JSONObject();
        Date a = new Date(119, 8, 1);
        Date b = new Date(119, 9, 1);
        Date c = new Date(119, 10, 1);
        dayReport(a,object);
        dayReport(b,object);
        dayReport(c,object);
        return object;
    }

    public void dayReport(Date month,JSONObject object) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(month);//month 为指定月份任意日期
        int year = cal.get(Calendar.YEAR);
        int m = cal.get(Calendar.MONTH);
        int dayNumOfMonth = getDaysByYearMonth(year, m);
        cal.set(Calendar.DAY_OF_MONTH, 1);// 从一号开始

        for (int i = 0; i < dayNumOfMonth; i++, cal.add(Calendar.DATE, 1)) {
            Date d = cal.getTime();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            String df = simpleDateFormat.format(d);
            object.put(df,1);
        }
    }


}
