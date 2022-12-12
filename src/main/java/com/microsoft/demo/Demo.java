package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            nonexistentfunc();
            System.out.println("I am covered");
            return;
        }

        System.out.println("I am not covered");
    }
}
