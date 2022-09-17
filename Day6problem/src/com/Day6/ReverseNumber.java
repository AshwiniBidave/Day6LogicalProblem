package com.Day6;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		 int n, reverse = 0, rem;
		 Scanner s =new Scanner(System.in);
		 System.out.println("Enter the number : ");
	     n = s.nextInt();
         while (n != 0)
         {
             rem = n % 10;
             reverse = reverse * 10 + rem;
             n /= 10;
         }
         System.out.println("Reversed Number: " + reverse);

	}

}
