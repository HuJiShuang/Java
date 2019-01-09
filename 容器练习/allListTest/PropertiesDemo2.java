package allListTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用properties输出到文件中
 * 资源配置文件
 */
public class PropertiesDemo2 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("driver","oracle.jdbc.driver.OracleDriver");
        properties.setProperty("url","jdbc:oracle:thin:@localhost:1521:orcl");
        properties.setProperty("user","root");
        properties.setProperty("password","123456");
        //将内容存储到外部.properties文件中去
        try {
            //使用绝对路径
            properties.store(new FileOutputStream(new File("E:\\LocalRepository\\AllListTest\\db.properties")),"db配置文件");
            properties.storeToXML(new FileOutputStream(new File("E:\\LocalRepository\\AllListTest\\db.xml")),"db配置文件");
            //使用相对路径是默认当前的工程
            properties.storeToXML(new FileOutputStream(new File("db.properties")),"db配置文件");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
