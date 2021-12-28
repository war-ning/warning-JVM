package com.warning;

/**
 * @author WarNing
 * @Date 2021/12/28 4:06 下午
 * @Description 面试题
 * -XX:StringTableSize=60013 调整StringTable的Bucket大小， 调大用来jianshao哈希冲突，增加效率
 */
public class StringTable {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "a" + "b";
        String s4 = s1 + s2;
        String s5 = "ab";
        String s6 = s4.intern();

        // 问
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);



        String x2 = new String("c") + new String("d");
        String x1 = "cd";
        x2.intern();
        // 问，如果调换了【最后两行代码】的位置呢，如果是jdk1.6呢
        System.out.println(x1 == x2);
    }

    /*public static void main(String[] args) {
        String s1 = "a";        // 串池
        String s2 = "b";        // 串池
        String s3 = "a" + "b";  // 编译期间被优化为 "ab"串池
        String s4 = s1 + s2;    // new StringBuilder().append("a").append("b").toString   new ("ab")    堆中
        String s5 = "ab";       // 串池
        String s6 = s4.intern();// 1.8中，尝试**放入**串池中，并把串池地址取出
        // 1.6中，尝试**复制一份**到串池中，并把串池地址取出
        // 问
        System.out.println(s3 == s4);   // false
        System.out.println(s3 == s5);   // true
        System.out.println(s3 == s6);   // true



        String x2 = new String("c") + new String("d");
        String x1 = "cd";
        x2.intern();
        // 问，如果调换了【最后两行代码】的位置呢，如果是jdk1.6呢
        System.out.println(x1 == x2);   // false
    }*/
}
