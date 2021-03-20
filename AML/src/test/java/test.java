import com.yimnlu.AML.CoreApplication;
import com.yimnlu.AML.controller.AmlStatusController;
import com.yimnlu.AML.controller.SuspectTransMakeupController;
import com.yimnlu.AML.dao.AmlStatusMapper;
import com.yimnlu.AML.entity.AmlStatus;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CoreApplication.class)
public class test {
    @Resource
    SuspectTransMakeupController suspectTransMakeupController;

    @Resource
    AmlStatusController amlStatusController;

    @Resource
    AmlStatusMapper amlStatusMapper;

    @Test
    public static int getDaysByYearMonth(int year, int month) {

        Calendar a = Calendar.getInstance();
        a.set(Calendar.YEAR, year);
        a.set(Calendar.MONTH, month - 1);
        a.set(Calendar.DATE, 1);
        a.roll(Calendar.DATE, -1);
        int maxDate = a.get(Calendar.DATE);
        return maxDate;
    }

    @Test
    public void Batch() {
        Date a = new Date(119, 8, 1);
        Date b = new Date(119, 9, 1);
        Date c = new Date(119, 10, 1);
        dayReport(a);
        dayReport(b);
        dayReport(c);
        amlStatusController.Init_Status();
    }

    @Test
    public void dayReport(Date month) {
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
            //log.info(df);
            int flag = 0;
            List<AmlStatus> amlStatusList = amlStatusMapper.ReachAllStatus();
            for (AmlStatus amlStatus1 : amlStatusList) {
                if (amlStatus1.getStatus() != 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                log.info("-------------");
                //suspectTransMakeupController.Batch_R000X(DEFAULT_DEPART_ID,df);
            else
                break;
        }
    }
}
