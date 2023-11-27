package com.sangamone.java;

import java.util.Scanner;

public class swap {

	
		public static void main(String args[])
		{
			Scanner swap=new Scanner(System.in);
			System.out.println("Swappig of two Numbers\n");
			System.out.println("Enter first number:");
			int i=swap.nextInt();
			System.out.println("Enter second number:");
			int j=swap.nextInt();
			int temp=0;
			temp=i;    
			i=j;       
			j=temp; 
			System.out.println("After Swapping\n");
			System.out.println("First number= "+i+"\nSecond number= "+j);
			
		}

	}