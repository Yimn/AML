package com.yimnlu.AML.controller;

import com.alibaba.fastjson.JSONObject;
import com.yimnlu.AML.dao.presentationMapper;
import com.yimnlu.AML.entity.AML_Dict;
import com.yimnlu.AML.entity.AmlDTA;
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
            List<AmlDTA> list = presentationMapper.visualByRule(key);
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
            List<AmlDTA> list = presentationMapper.visualByRuleBw8_12(key);
            if (!list.isEmpty())
                //arrayList.add(new visualByRule(list.size(),key,map.get(key)));
                arrayList.add(new visualByRule(list.size(),map.get(key),key));
        }
        return arrayList;
    }

    @ApiOperation(value = "visualAmount", notes = "visualAmount")
    @GetMapping("/visualAmount")
    public ArrayList visualAmount(){
        Date a = new Date(119, 7, 1);
        Date b = new Date(119, 8, 1);
        Date c = new Date(119, 9, 1);
        Date d = new Date(119, 10, 1);
        Date e = new Date(119, 11, 1);
        ArrayList<ArrayList> arrayList =new ArrayList();
        dayReport(a,arrayList);
        dayReport(b,arrayList);
        dayReport(c,arrayList);
        dayReport(d,arrayList);
        dayReport(e,arrayList);
        return arrayList;
    }


    public void dayReport(Date month,ArrayList<ArrayList> arrayList) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(month);//month 为指定月份任意日期
        int year = cal.get(Calendar.YEAR);
        int m = cal.get(Calendar.MONTH);
        int dayNumOfMonth = getDaysByYearMonth(year, m);
        cal.set(Calendar.DAY_OF_MONTH, 1);// 从一号开始

        for (int i = 0; i < dayNumOfMonth; i++, cal.add(Calendar.DATE, 1)) {
            Date d = cal.getTime();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            String df = simpleDateFormat.format(d);
            String df1 = simpleDateFormat1.format(d);
            ArrayList temp = new ArrayList<>();
            List<AmlDTA> list =presentationMapper.visualAmount(df);
            if (list.size()>0) {
                temp.add(df1);
                temp.add(list.size());
                arrayList.add(temp);
            }
        }
    }


}
