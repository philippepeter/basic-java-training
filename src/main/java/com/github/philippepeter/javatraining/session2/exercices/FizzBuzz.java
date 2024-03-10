package com.github.philippepeter.javatraining.session2.exercices;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            String result = "";
            if (i % 3 == 0) {
                result += "Fizz";
            }
            if (i % 5 == 0) {
                result += "Buzz";
            }
            if (result.isEmpty()) {
                result = "" + i;
            }
            System.out.println(result);
        }
    }
}
