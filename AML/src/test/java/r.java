import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class r {
    public static void main(String[] args) throws ParseException {

        ArrayList<ArrayList> arrayList = new ArrayList();
        Calendar dayc1 = new GregorianCalendar();
        Calendar dayc2 = new GregorianCalendar();
        DateFormat df = new SimpleDateFormat("yy-MM-dd");
        Date daystart = df.parse("19-1-1"); //按照yyyy-MM-dd格式转换为日期
        Date dayend = df.parse("19-12-31");
        dayc1.setTime(daystart); //设置calendar的日期
        dayc2.setTime(dayend);

        for (; dayc1.compareTo(dayc2) <= 0; ) {   //dayc1在dayc2之前就循环
//                System.out.println("PARTITION p" +
//                        dayc1.get(Calendar.YEAR) + dayc1.get(Calendar.MONTH) + dayc1.get(Calendar.DATE) + " VALUES LESS THAN (TO_DAYS('"
//                        + dayc1.get(Calendar.YEAR) + "-" + dayc1.get(Calendar.MONTH) + "-" + dayc1.get(Calendar.DATE) + "')),");  //打印年月日
            if (Integer.valueOf(dayc1.get(Calendar.DATE)) > 9)
                System.out.println(dayc1.get(Calendar.YEAR) + "" + dayc1.get(Calendar.MONTH) + "" + dayc1.get(Calendar.DATE));
            if (Integer.valueOf(dayc1.get(Calendar.DATE)) < 9)
                System.out.println(dayc1.get(Calendar.YEAR) + "" + dayc1.get(Calendar.MONTH) + "0" + dayc1.get(Calendar.DATE));
            dayc1.add(Calendar.DAY_OF_YEAR, 1);  //加1天
        }


    }
}
