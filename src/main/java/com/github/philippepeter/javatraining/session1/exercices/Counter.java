package com.github.philippepeter.javatraining.session1.exercices;

public class Counter {

    private int internalValue = 0;

    public void sayHello() {
        System.out.println("Hello my internal value is " + internalValue);
    }

    public void increment() {
        internalValue = internalValue + 1; // We can use internalValue++ instead
    }

}
