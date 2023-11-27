package com.sangamone.java;

import java.util.Scanner;

public class str_rev {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner reverse=new Scanner(System.in);
			System.out.println("String Reverse Program");
			System.out.println("Enter the String: ");
			String word=reverse.nextLine();
			int len=word.length();
			String rev="";
			for(int i=len-1;i>=0;i--)
				rev=rev+word.charAt(i);
			{
				System.out.println("String Reverse");
				System.out.println(rev);
			}
			char pos=word.charAt(4);
			System.out.println(pos);
			System.out.println(len);

		}

	}