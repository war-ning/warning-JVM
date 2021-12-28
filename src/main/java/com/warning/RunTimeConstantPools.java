package com.warning;

/**
 * @author WarNing
 * @Date 2021/12/28 3:02 下午
 * @Description 运行时常量池
 * javap -v RunTimeConstantPools.class 反编译查看二进制文件
 */
public class RunTimeConstantPools {
    /**
     * 类的基本信息
     * 常量池
     *     - 常量池，就是一张表，虚拟机指令根据这张常量表找到要执行的类名、方法名、参数类型、字面量等信息
     *     - 运行时常量池，常量池是 *.class 文件中的，当该类被加载，它的常量池信息就会放入运行时常量池，并把里面的符号地址变为真实地址
     * 类的方法定义(包含了虚拟机指令)
     */
    public static void main(String[] args) {
        // javap -v Demo01.class 反编译查看二进制文件
        System.out.println("Hello World");
    }
}
