package com.sangamone.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class calculatorTest {

	public static void main(String[] args) {
		
		calculator t1 = new calculator();
		File f1=new File("add.txt");
		
		try (Scanner scanner = new Scanner(f1)) {
			//Addition for the first two lines
			for (int i = 0; i < 2 && scanner.hasNextLine(); i++) {
				String[] temp1 = scanner.nextLine().split(",");
				int num1 = Integer.parseInt(temp1[0]);
				int num2 = Integer.parseInt(temp1[1]);
				int expectedSum = Integer.parseInt(temp1[2]);
				
				int resultAdd = t1.add(num1, num2);
				if (resultAdd == expectedSum) {
				   System.out.println("Addition is working");
	               System.out.println("Result: " + resultAdd);
	                }
			 }
			
		    //Subtraction
			if(scanner.hasNextLine()) {
				String[] temp2 = scanner.nextLine().split(",");
		        int num3 = Integer.parseInt(temp2[0]);
				int num4 = Integer.parseInt(temp2[1]);
				int expectedDifference = Integer.parseInt(temp2[2]);
				
				int resultSubtract = t1.subtract(num3, num4);
				if (resultSubtract== expectedDifference) {
				   System.out.println("Subtraction is working");
	               System.out.println("Result: " + resultSubtract);
	            }
			}
		    //Multiplication
			if(scanner.hasNextLine()) {
				String[] temp3 = scanner.nextLine().split(",");
		        int num5 = Integer.parseInt(temp3[0]);
				int num6 = Integer.parseInt(temp3[1]);
				int expectedProduct = Integer.parseInt(temp3[2]);
				
				int resultMultiply = t1.multiply(num5, num6);
				if (resultMultiply== expectedProduct) {
				   System.out.println("Multiplication is working");
	               System.out.println("Result: " + resultMultiply);
	            }
			}
		    //Division
			if(scanner.hasNextLine()) {
				String[] temp4 = scanner.nextLine().split(",");
		        int num7 = Integer.parseInt(temp4[0]);
				int num8 = Integer.parseInt(temp4[1]);
				int expectedValue = Integer.parseInt(temp4[2]);
				
				int resultDivision = t1.multiply(num7, num8);
				if (resultDivision== expectedValue) {
				   System.out.println("Multiplication is working");
	               System.out.println("Result: " + resultDivision);
	            }
			}
	
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
