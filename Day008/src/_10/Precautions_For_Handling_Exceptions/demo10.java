package _10.Precautions_For_Handling_Exceptions;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
当父类方法throws宜昌市，子类如何处理？
    1.子类重写方法throws的异常要比父类方法throws的异常相同或更少
    2，父类方法没有throws异常，子类方法只能try……catch处理

 */
public class demo10 {
    class fu {
        public void test01() throws IOException, ParseException{

        }

        public void test02() {

        }
    }

    class zi extends fu {
        //子类重写方法throws的异常要比父类方法throws的异常相同或更少

        @Override
        public void test01() throws IOException {

        }

        //父类方法没有throws异常，子类方法只能try……catch处理
        @Override
        public void test02() {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date date = sdf.parse("2022-02-22");
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
