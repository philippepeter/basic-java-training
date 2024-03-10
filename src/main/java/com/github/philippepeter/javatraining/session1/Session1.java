package com.github.philippepeter.javatraining.session1;

public class Session1 {

    public static void main(String[] args) {

        // To create an instance of the MyFirstClass class use new and the class name with ():
        MyFirstClass instance1 = new MyFirstClass();
        MyFirstClass instance2 = new MyFirstClass();
        // The two instances are two different living objects

        // We can call a method on an instance using the .
        instance1.sayHello("World");

        // We can change the internal state
        instance1.setVariable(5);
        instance2.setVariable(6);

        instance1.sayHello("Nekobasu");
        instance2.sayHello("Totoro");

    }
}
