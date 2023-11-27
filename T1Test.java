package com.sangamone.java;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class T1Test {
    public static void main(String[] args) {
       calculator t1 = new calculator();
        File file = new File("add.txt");

        try (Scanner scanner = new Scanner(file)) {
            // Perform addition for the first two lines
            for (int i = 0; i < 2 && scanner.hasNextLine(); i++) {
                String[] parts = scanner.nextLine().split(",");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);
                int expectedValue = Integer.parseInt(parts[2]);

                int resultAdd = t1.add(num1, num2);
                if (resultAdd == expectedValue) {
                    System.out.println("Addition is working");
                    System.out.println("Result: " + resultAdd);
                } else {
                    System.out.println("Addition is not correct");
                }
            }

            // Perform subtraction for the third line
            if (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);
                int expectedValue = Integer.parseInt(parts[2]);

                int resultSubtract = t1.subtract(num1, num2);
                if (resultSubtract == expectedValue) {
                    System.out.println("Subtraction is working");
                    System.out.println("Result: " + resultSubtract);
                } else {
                    System.out.println("Subtraction is not correct");
                }
            }

            // Perform multiplication for the fourth line
            if (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);
                int expectedValue = Integer.parseInt(parts[2]);

                int resultMultiply = t1.multiply(num1, num2);
                if (resultMultiply == expectedValue) {
                    System.out.println("Multiplication is working");
                    System.out.println("Result: " + resultMultiply);
                } else {
                    System.out.println("Multiplication is not correct");
                }
            }

            // Perform division for the fifth line
            if (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);
                int expectedValue = Integer.parseInt(parts[2]);

                int resultDivide = t1.divide(num1, num2);
                if (resultDivide == expectedValue) {
                    System.out.println("Division is working");
                    System.out.println("Result: " + resultDivide);
                } else {
                    System.out.println("Division is not correct");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}