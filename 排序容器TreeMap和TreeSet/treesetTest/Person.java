package treesetTest;

public class Person {
    //姓名
    private String name;
    //帅气指数
    private int handsome;

    public Person() {
    }

    public Person(String name, int handsome) {
        this.name = name;
        this.handsome = handsome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHandsome() {
        return handsome;
    }

    public void setHandsome(int handsome) {
        this.handsome = handsome;
    }

    @Override
    public String toString() {
        return "姓名为:"+this.name+"帅气指数:"+this.handsome+"\n";
    }
}
