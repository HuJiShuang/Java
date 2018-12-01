这个Demo
使用JavaComplie实现了动态编译外部文件（在F盘下）
使用process实行动态运行，并使用IO流将结果输出到程序中来
使用反射方式动态运行已经编译好的文件（.class）
注意：method.invoke（）方法，当method是静态方法时第一个参数可以传递null，第二个参数是可变参数，必须强转为Object