import com.yimnlu.AML_Platform.AMLPlatformApplication;
import com.yimnlu.AML_Platform.controller.AML_DICTController;
import com.yimnlu.AML_Platform.controller.GeneralQuery;
import com.yimnlu.AML_Platform.dao.CommonAnalysisQueryMapper;
import com.yimnlu.AML_Platform.dto.AML_DICT_GROUP;
import com.yimnlu.AML_Platform.entity.AmlDTA;
import com.yimnlu.AML_Platform.entity.CountryCode;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AMLPlatformApplication.class)

public class test{
        List<CountryCode> temp;
        public void after1(List<CountryCode> list){
                for ( int  i =  0 ;i < list.size();i++){
                        if (list.get(i).getTRADE_VENUE_COUNTRY() != null)
                                temp.add(list.get(i));
                }
        }

        @Resource
        CommonAnalysisQueryMapper commonAnalysisQueryMapper;




        @Test
        public void run2(){
                List<AmlDTA> list_aml = commonAnalysisQueryMapper.DESCbyCountry("CHN","201911%");
                log.info(list_aml.toString());
                log.info("List aml WORK_DATE:"+list_aml.get(0).getWorkDate().substring(0,6));
                log.info("List aml Count:"+list_aml.size());
        }

        @Resource
        GeneralQuery generalQuery;



        @Test
        public void run3(){
                List<AmlDTA> list = commonAnalysisQueryMapper.DESCbyCountry(null,"201911%");
                List<CountryCode> list1 = commonAnalysisQueryMapper.SelectCountryCode("201911%");
                List<AmlDTA> temp = new ArrayList<>();
                log.info("Size:"+list.size()+" "+list1.size());
                for (int i =0; i <list.size(); i++){
                        for (int j =0; j < list1.size();j++){
                                if (list1.get(j).getTRADE_VENUE_COUNTRY().equals(list.get(i).getTradeCountry()))
                                        log.info("reach "+ list1.get(j).getTRADE_VENUE_COUNTRY()+" "+list.get(i));
                        }
                }
               //log.info(""+commonAnalysisQueryMapper.DESCbyCountry(null,"201911%"));
        }


        @Test
        public void run4(){
                List<AML_DICT_GROUP> aml_dict_group = AML_DICTController._LIST_AML_DICT_.stream().filter(aml_dict_group1 -> aml_dict_group1.getMETA_VAL().equals("610001")).collect(Collectors.toList());
                log.info(aml_dict_group.toString());
        }
}