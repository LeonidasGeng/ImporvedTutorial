package _05.Error_and_Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo05_03 {
    //编译时异常
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse("2022-12-27");
        System.out.println("date: " + d1);
        //ParseException

    }
}
