package com.github.philippepeter.javatraining.session1.exercices;

public class Application {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.increment(); // Call increment only on instance 1

        counter1.sayHello();
        counter2.sayHello();
    }
}
