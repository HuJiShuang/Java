package definecom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * 使用Collections进行排序
 */
public class NewsItemApp {

    public static void main(String[] args) {
        List<NewsItem> list = new ArrayList();
        list.add(new NewsItem("新京报快讯（记者 倪伟）记者今天（1月7日）从故宫博物院获悉",1000,new Date()));
        list.add(new NewsItem("对于有媒体报道称故宫淘宝彩妆因质量问题停产，故宫博物院今日回应，这属于误读",500,new Date(System.currentTimeMillis()-1000*60*60)));
        list.add(new NewsItem("故宫博物院称，虽然消费者提出的一些问题是一般化妆品常见现象，但作为故宫的文创产品",300,new Date(System.currentTimeMillis()+1000*60*60)));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

}
