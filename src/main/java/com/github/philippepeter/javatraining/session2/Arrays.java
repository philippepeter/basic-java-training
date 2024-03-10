package com.github.philippepeter.javatraining.session2;

public class Arrays {

    public static void main(String[] args) {
        // Arrays
        String[] arrayOfString = new String[10]; // Array of String of size 10
        int[] arrayOfInt = new int[5]; // Array of String of size 5

        String[] anotherStringArray = {"value1", "value2"}; // Array of size 2
        int[] anotherIntArray = {10, 11}; // Array of size 2

        System.out.println(anotherStringArray[0]); // Access a value (index start at 0)
        anotherStringArray[1] = "value3"; //  Change a value (last index is length - 1)
    }
}
