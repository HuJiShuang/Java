1.引用类型排序方法二：如果用户想要自定义排序规则，可以实现Comparator类，重写Compare()方法
2.StringCom实现了Comparator类，重写了compare方法，实现两个元素按照长度进行比较
3.Utils类包含了两个方法：
(1)对数组进行排序
(2)对list集合进行排序
4.Demo类为字符串数组排序和list集合排序的测试类
5.jdk中自带Collections类中的sort方法实现集合排序，并对该方法进行了重载，以传递排序规则