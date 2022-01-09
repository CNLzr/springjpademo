package com.example.springjpademo;

import java.util.Optional;

public class JavaTest extends Object {
    public int a;
    private int b;

    {
        System.out.println("父类代码块");
    }

    static {
        System.out.println("父类静态代码块");
    }

    public JavaTest() {
        System.out.println("父类构造方法");
    }

    public void dadFun(){
        System.out.println("父类独有方法");
    }

}
