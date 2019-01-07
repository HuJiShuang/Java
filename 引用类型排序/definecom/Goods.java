package definecom;

import java.util.Comparator;

/**
 * 不实现任何接口，只是一个简单的实体类
 */
public class Goods{
    //商品名称
    private String name;
    //商品价格
    private double price;
    //货存
    private int storage;
    public Goods() {
    }
    public Goods(String name, double price, int storage) {
        this.name = name;
        this.price = price;
        this.storage = storage;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "商品名:"+this.name+"价格:"+this.price+"货存:"+this.storage+"\n";
    }
}
