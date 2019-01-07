static String t = "hello";
static char c[] = {'h','e','l','l','o'};
虽然t和c中存储的值都是“hello“,但是当两个值进行equals比较时，由于两个值得类型不是继承的关系，所以s.equals(t)返回false