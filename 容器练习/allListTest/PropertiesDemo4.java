package allListTest;

import java.io.IOException;
import java.util.Properties;

/**
 * 使用类相对路径读取配置文件
 */
public class PropertiesDemo4 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //使用类相对路径读取配置文件 /bin
        properties.load(PropertiesDemo4.class.getResourceAsStream("/db.properties"));
        //使用类加载器获取配置文件 bin
        properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(""));
        System.out.println(properties);

    }
}
