package com.github.philippepeter.javatraining.session2;

public class DataTypes {
    public static void main(String[] args) {
        // Data types:

        int valueInt = 1; // Stores whole numbers from -2,147,483,648 to 2,147,483,647
        float valueFloat = 1.0f; // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        boolean valueBoolean = true; // or false
        double valueDouble = 1.0d; // Stores fractional numbers. Sufficient for storing 15 decimal digits
        long valueLong = 1L; // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        short valueShort = 1; // Stores whole numbers from -32,768 to 32,767
        char valueChar = 'a'; // Stores a single character/letter or ASCII values
        byte valueByte = 1; // Stores whole numbers from -128 to 127


        int value1 = 1;
        value1 = 2; // Change the value

        // Check equality
        boolean isZero = (value1 == 0); // false
        boolean isOne = (value1 == 1);  // true
        // Parenthesis are not mandatory but just here for readability

        // Errors at compile time for wrong types for ex: int value = 10.5
        // The compile error explain that a double can't be cast to an int

    }
}
