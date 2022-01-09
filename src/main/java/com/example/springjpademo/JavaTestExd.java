package com.example.springjpademo;

import java.util.ArrayList;
import java.util.List;

public class JavaTestExd extends JavaTest {

    {
        System.out.println("子类代码块");
    }

    static {
        System.out.println("子类静态代码块");
    }

    public JavaTestExd() {
        super();
        System.out.println("子类构造方法");
    }

    public void sonFun(){
        System.out.println("子类独有方法");
    }

    @Override
    public void dadFun(){
        System.out.println("子类重写父类dadFun方法");
    }

    // 对n求和,递归实现
    public int sumN(int n){
        if(n == 1){
            return n;
        }
        return n+sumN(n-1);
    }

    // 求斐波那契数列
    public int primeNumber(int n){
        if(n <= 1){
            return 1;
        }
        if(n == 2){
            return n;
        }
        return primeNumber(n-1)+primeNumber(n-2);
    }

    public void testA(){
        int c = 1;
        int temp;
        for(int i = 1;i<100;){
            if(i==1){
                c=c+i;
                continue;
            }

        }
    }

    public static void main(String[] args) {
        JavaTestExd javaTest = new JavaTestExd();
        javaTest.testA();
    }

}
