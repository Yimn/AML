package com.yimnlu.AML.controller;

import com.alibaba.fastjson.JSONObject;
import com.yimnlu.AML.entity.AmlDTA;
import com.yimnlu.AML.model.visualByRule;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.yimnlu.AML.executor.staticReturn.TimeUtils.getDaysByYearMonth;

@RestController
@CrossOrigin
@RequestMapping("/visual")
@Slf4j
@Api(tags = "VisualController", value = "VisualController")
public class VisualController {
    @Resource
    com.yimnlu.AML.dao.presentationMapper presentationMapper;

    @ApiOperation(value = "index_Overview", notes = "index_Overview")
    @GetMapping("/index_Overview")
    public JSONObject index_Overview() {
        log.info("Data Processing for index_Overview");
        HashMap<String, String> map = TbAnalysisrulesController._After_Analysis_Rules_;
        JSONObject BigJson = new JSONObject();
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        int index_Overview_Pie_Suspect = 5000;
        int index_Overview_Pie_Suspect_1 = 2000;
        //int index_Overview_Pie_Suspect = presentationMapper.index_Overview_Pie_Suspect();

        BigJson.fluentPut("charts", returnJSONObject1(jsonObject1, 201901));
        BigJson.fluentPut("components", returnJSONObject1(jsonObject2, 201801));
        int temp = 0;
        for (String i : jsonObject1.keySet()) {
            if (jsonObject1.getInteger(i) > temp)
                temp = jsonObject1.getInteger(i);
        }
        BigJson.put("all", temp + 1000);
        return BigJson;
    }

    public JSONObject returnJSONObject1(JSONObject jsonObject, int current_year_month) {
        int temp = 0;
        for (int i = 0; i < 12; i++) {
            log.info("Processing returnJSONObject1:" + current_year_month);
            String CYM = current_year_month + "%";
            int mount = presentationMapper.index_Count_Month(CYM);
            temp = temp + mount;
            jsonObject.put(String.valueOf(current_year_month), mount);
            current_year_month++;
        }
        return jsonObject;
    }

    @ApiOperation(value = "index_PartView", notes = "index_PartView")
    @GetMapping("/index_PartView")
    public JSONObject index_PartView() {
        log.info("Data Processing for index_PartView");

        return null;
    }

    @ApiOperation(value = "index_Overview_Pie", notes = "index_Overview_Pie")
    @GetMapping("/index_Overview_Pie")
    public JSONObject index_Overview_Pie() {
        log.info("Data Processing for index_Overview");
        int index_Overview_Pie_Suspect = presentationMapper.index_Overview_Pie_Suspect();
        int index_Overview_Pie_All = presentationMapper.index_Overview_Pie_All();
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("可疑数据", index_Overview_Pie_Suspect);
        jsonObject.put("正常数据", index_Overview_Pie_All + index_Overview_Pie_Suspect);
        return jsonObject;
    }

    @ApiOperation(value = "index_PartView_Pie", notes = "index_PartView_Pie")
    @GetMapping("/index_PartView_Pie")
    public JSONObject index_PartView_Pie() {
        log.info("Data Processing for index_PartView_Pie");
        HashMap<String, String> map = TbAnalysisrulesController._After_Analysis_Rules_;
        JSONObject jsonObject = new JSONObject();
        for (String key : map.keySet()) {
            List<AmlDTA> list = presentationMapper.visualByRule(key);
            jsonObject.put(map.get(key), list.size());
        }
        return jsonObject;
    }


    @ApiOperation(value = "update", notes = "update")
    @GetMapping("/update")
    public Object h() {
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
    public void sortByRule() {

    }

    @ApiOperation(value = "visualByRule", notes = "visualByRule")
    @GetMapping("/visualByRule")
    public ArrayList<visualByRule> visualByRule() {
        HashMap<String, String> map = TbAnalysisrulesController._After_Analysis_Rules_;
        ArrayList<visualByRule> arrayList = new ArrayList<>();
        for (String key : map.keySet()) {
            List<AmlDTA> list = presentationMapper.visualByRule(key);
            if (!list.isEmpty())
                //arrayList.add(new visualByRule(list.size(),key,map.get(key)));
                arrayList.add(new visualByRule(list.size(), map.get(key), key));
        }
        return arrayList;
    }

    @ApiOperation(value = "visualByRuleBw8_12", notes = "visualByRuleBw8_12")
    @GetMapping("/visualByRuleBw8_12")
    public ArrayList<visualByRule> visualByRuleBw8_12() {
        HashMap<String, String> map = TbAnalysisrulesController._After_Analysis_Rules_;
        ArrayList<visualByRule> arrayList = new ArrayList<>();
        for (String key : map.keySet()) {
            List<AmlDTA> list = presentationMapper.visualByRuleBw8_12(key);
            if (!list.isEmpty())
                //arrayList.add(new visualByRule(list.size(),key,map.get(key)));
                arrayList.add(new visualByRule(list.size(), map.get(key), key));
        }
        return arrayList;
    }

    @ApiOperation(value = "visualAmount", notes = "visualAmount")
    @GetMapping("/visualAmount")
    public ArrayList visualAmount() {
        Date a = new Date(119, 7, 1);
        Date b = new Date(119, 8, 1);
        Date c = new Date(119, 9, 1);
        Date d = new Date(119, 10, 1);
        Date e = new Date(119, 11, 1);
        ArrayList<ArrayList> arrayList = new ArrayList();
        dayReport(a, arrayList);
        dayReport(b, arrayList);
        dayReport(c, arrayList);
        dayReport(d, arrayList);
        dayReport(e, arrayList);
        return arrayList;
    }

    @ApiOperation(value = "visualAmountDetail", notes = "visualAmountDetail")
    @GetMapping("/visualAmountDetail")
    public ArrayList visualAmountDetail() throws ParseException {
        ArrayList<ArrayList> arrayList = new ArrayList();
        List<AmlDTA> list = new ArrayList<>();
        Calendar dayc1 = new GregorianCalendar();
        Calendar dayc2 = new GregorianCalendar();
        DateFormat df = new SimpleDateFormat("yy-MM-dd");
        Date daystart = df.parse("17-1-1"); //按照yyyy-MM-dd格式转换为日期
        Date dayend = df.parse("20-1-1");
        dayc1.setTime(daystart); //设置calendar的日期
        dayc2.setTime(dayend);

        for (; dayc1.compareTo(dayc2) <= 0; ) {   //dayc1在dayc2之前就循环
            ArrayList temp = new ArrayList<>();
            String day = "";
            if (Integer.valueOf(dayc1.get(Calendar.MONTH)) < 10) {
                if (Integer.valueOf(dayc1.get(Calendar.DATE)) < 10) {
                    day = String.valueOf(dayc1.get(Calendar.YEAR)) + "0" + String.valueOf(dayc1.get(Calendar.MONTH)) + "0" + String.valueOf(dayc1.get(Calendar.DATE));
                }
                if (Integer.valueOf(dayc1.get(Calendar.DATE)) > 9) {
                    day = String.valueOf(dayc1.get(Calendar.YEAR)) + "0" + String.valueOf(dayc1.get(Calendar.MONTH)) + String.valueOf(dayc1.get(Calendar.DATE));
                }
            }
            if (Integer.valueOf(dayc1.get(Calendar.MONTH)) > 9) {
                if (Integer.valueOf(dayc1.get(Calendar.DATE)) < 10) {
                    day = String.valueOf(dayc1.get(Calendar.YEAR)) + String.valueOf(dayc1.get(Calendar.MONTH)) + "0" + String.valueOf(dayc1.get(Calendar.DATE));
                }
                if (Integer.valueOf(dayc1.get(Calendar.DATE)) > 9) {
                    day = String.valueOf(dayc1.get(Calendar.YEAR)) + String.valueOf(dayc1.get(Calendar.MONTH)) + String.valueOf(dayc1.get(Calendar.DATE));
                }
            }
            if (day.length() > 0) {
                list = presentationMapper.visualAmount(day);
                log.info("Ready to query visualAmountDetail " + day + "  " + list);
                if (list.size() > 0) {
                    temp.add(day);
                    temp.add(list.size());
                    arrayList.add(temp);
                }
            }
            dayc1.add(Calendar.DAY_OF_YEAR, 1);  //加1天
        }

        return arrayList;
    }

    @ApiOperation(value = "visualAmountYear", notes = "visualAmountYear")
    @GetMapping("/visualAmountYear")
    public ArrayList visualAmountA() {
        ArrayList<ArrayList> arrayList = new ArrayList();
        int init = 201701;
        AmountYearPre(arrayList, init);
        init = 201801;
        AmountYearPre(arrayList, init);
        init = 201901;
        AmountYearPre(arrayList, init);
        return arrayList;
    }

    private void AmountYearPre(ArrayList<ArrayList> arrayList, int init) {
        for (int i = 0; i < 12; i++) {
            init = init + i;
            ArrayList temp = new ArrayList<>();
            List<AmlDTA> list = presentationMapper.visualAmountYear(String.valueOf(init));
            if (list.size() > 0) {
                temp.add(String.valueOf(init));
                temp.add(list.size());
                arrayList.add(temp);
            }
        }
    }

    public void dayReport(Date month, ArrayList<ArrayList> arrayList) {
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
            List<AmlDTA> list = presentationMapper.visualAmount(df);
            if (list.size() > 0) {
                temp.add(df1);
                temp.add(list.size());
                arrayList.add(temp);
            }
        }
    }


}
