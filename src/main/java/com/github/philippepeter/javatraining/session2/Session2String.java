package com.github.philippepeter.javatraining.session2;

public class Session2String {

    public static void main(String[] args) {
        // String
        String value1String = "Hello";
        String value2String = new String("World"); // Never used expression, it's better to use = "World"

        String value3String = "Hello" + " world!"; // Concatanation with +


        // String methods
        String value = "Hello";

        int length = value.length(); // Number of chars in the string here: 5

        value.toUpperCase(); // HELLO
        value.isEmpty(); // false

        value.contains("el"); // true
        value.replace("H", ""); // ello, empty String car be written ""
    }

}
