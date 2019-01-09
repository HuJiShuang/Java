package allListTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 练习Hashtable的子类properties的加载配置文件的方法
 */
public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("E:\\LocalRepository\\AllListTest\\db.properties"));
        System.out.println(properties);
    }
}
