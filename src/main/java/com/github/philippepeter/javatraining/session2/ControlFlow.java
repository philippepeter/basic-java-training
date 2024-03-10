package com.github.philippepeter.javatraining.session2;

public class ControlFlow {

    public static void main(String[] args) {

        // If else else if
        {
            int value = 0;

            if (value == 0) {
                // Value is 0, this block of code will be executed
            } else if (value == 1) {
                // Value is not 0 and is 1, this block of code will be executed
            } else {
                // Value is not 0 and not 1, this block of code will be executed
            }
        }


        // for
        {
            int[] values = {1, 2, 3};

            for (int value : values) {
                System.out.println(value);
            }

            // If we need the index
            for (int i = 0; i < values.length; i++) {
                System.out.println(values[i]);
            }
        }

        // while
        {
            int i = 0;

            while (i <= 5) {
                System.out.println("The current value is at: " + i);
                i++;
            }
        }

        //Switch
        {
            int choice = 2
                    ;
            switch (choice) {
                case 1:
                    System.out.println("Bonjour");
                    break;
                case 2:
                    System.out.println("Hello");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }

    }
}
