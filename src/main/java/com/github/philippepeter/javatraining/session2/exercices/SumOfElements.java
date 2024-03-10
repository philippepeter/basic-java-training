package com.github.philippepeter.javatraining.session2.exercices;

public class SumOfElements {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int value) {
        int result = 0;
        for (int i = 0; i <= value; i++) {
            result += i;
        }
        return result;
    }

}
