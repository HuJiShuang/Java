package definecom;

import java.util.Comparator;

/**
 * 按照价格排序的业务类
 */
public class GoodsPriceCom implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        return o1.getPrice()-o2.getPrice()>0?1:(o1.getPrice()==o2.getPrice()?0:-1);
    }
}
