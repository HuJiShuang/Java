package allListTest;

import java.util.Properties;

/**
 * 练习Hashtable的子类properties的相关方法
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("driver","oracle.jdbc.driver.OracleDriver");
        properties.setProperty("url","jdbc:oracle:thin:@localhost:1521:orcl");
        properties.setProperty("user","root");
        properties.setProperty("password","123456");
        String url = properties.getProperty("url","test");
        System.out.println(url);
    }
}
