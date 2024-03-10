package com.github.philippepeter.javatraining.session2.exercices;

import java.util.Scanner;

public class DegreeToFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value in degree and press enter...");
        double degreeValue = scanner.nextDouble();

        double result = degreeValue * 9d / 5d + 32d; // Use d to for a double and not an int to avoid a rounded result

        System.out.println("The value in Farenheit is " + result);
    }

}
