package comparatortest;

import java.util.Comparator;

/**
 * 排序规则的业务类
 */
public class StringCom implements Comparator<String> {
    /**
     * 按照长度比较进行排序
     * 返回正数表示大于
     * 返回负数表示小于
     * 返回0表示相等
     */
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}
