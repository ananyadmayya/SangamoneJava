package com.sangamone.java;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FigurestoWords {
	static ArrayList<String> list1=new ArrayList<>();
	static ArrayList<String> tens = new ArrayList<>();
	 
	  public static void convert()throws IOException {
	    File f1=new File("input2.txt");
		Scanner sc1=new Scanner(f1);
	       int lineCount = 0;
	       while (sc1.hasNextLine()) {
	            lineCount++;
	            String line = sc1.nextLine();
	            list1.add(line); // Add all lines to list1

	            // Add lines from 20 to 27 to the 'tens' list
	            if (lineCount >= 20 && lineCount <= 27) {
	                tens.add(line);
	            }       
	        }
	        sc1.close();
	    }
	        
		 
	

	public static void main(String[] args) throws IOException {
		System.out.println("This program will work upto 1000");
		System.out.println("Enter any number: ");
		Scanner sc2=new Scanner(System.in);
		int num1=sc2.nextInt();
		
		if(num1<=20) {
			convert();
			String word1=list1.get(num1-1);
			System.out.print(word1+" ");	
		}
		
		else if (num1 < 100) {
			convert();
            int tensPlace = (num1/10)-2;
            String ten = tens.get(tensPlace);
            System.out.print(ten + " ");
            
            int unitsPlace = num1 % 10; 
            if (unitsPlace != 0) {
            	String word2=list1.get(unitsPlace-1);
                System.out.print( word2+ " ");
            }
		}
		
		else if (num1 < 1000) {
			convert();
            int hundredsPlace = num1 / 100;
            String word3=list1.get(hundredsPlace-1);
            System.out.print(word3 +" "+ "Hundred"+" ");
            
            int tensPlace=(num1%100);
            
            if (tensPlace != 0) {
            	int tenn = (tensPlace/10)-2;
                String ten = tens.get(tenn);
            System.out.print("and"+" " + ten + " ");
            }
            
            int unitsPlace = tensPlace % 10;
            
            if (unitsPlace != 0) {
            	String word4=list1.get(unitsPlace-1);
                System.out.print( word4+ " ");
            }   
           
		}
    }
}