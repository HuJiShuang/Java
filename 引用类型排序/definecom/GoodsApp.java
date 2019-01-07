package definecom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp {
    public static void main(String[] args) {
        List<Goods> list = new ArrayList<>();
        list.add(new Goods("老马视频",100,2000));
        list.add(new Goods("老高频",50,1000));
        list.add(new Goods("老胡视频",10000,5));
        System.out.println(list);
        Collections.sort(list,new GoodsPriceCom());
        System.out.println(list);
    }
}
