import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTranString {

    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //1.定义一个时间字符串
        String str = "2018-04-13";
        try {
            Date date = df.parse(str);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String string = df.format(new Date());
        System.out.println(string);
    }
}
