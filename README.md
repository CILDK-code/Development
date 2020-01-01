# Development
学习成长历程
一.多线程使用注意事项：
1.注意锁的位置和对象，一定要避免死锁
2.加锁会严重影响效率注意使用
3.vector使用时注意求两vector交集不要用嵌套循环的方法
二.编码注意要点：
1.在有较多的字符串拼接时减少使用“xxx”+“xxx”的写法，而应使用StringBuilder
2.字符串转化使用String.valueOf()代替+“”
3.使用localDateTime类代替Date类
4.返回空数组和集合而非null避免空指针异常
5.使用确定的值或常量调用equals方法
6.string.split()部分关键字需要转译
7.使用Collection.isEmpty()判空
