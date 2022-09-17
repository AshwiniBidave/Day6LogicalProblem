package com.Day6;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number : ");
        int n = s.nextInt();
         int sum = 0;
         for (int i = 1; i < n; i++)
         {
             if (n % i == 0)
             {
                 sum = sum + i;
             }
         }
         System.out.println("The sum of the divisor is :" + sum);
         if (sum == n)
        	 System.out.println("So " + n + " number is perfect.");
         else 
        	 System.out.println("So " + n + " number is not perfect.");

	}

}
