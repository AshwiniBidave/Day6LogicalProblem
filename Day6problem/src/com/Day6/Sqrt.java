package com.Day6;

import java.util.Scanner;

public class Sqrt {
	 public static void squareRoot()
     {
		 
		 Scanner s =new Scanner(System.in);
		 System.out.println("Enter the number : ");
	     int c = s.nextInt();
         double t = c;
         double epsilon = 1e-15;
         //check for negative number
         if (t > 0)
         {
             //check condition till (t - c/t) becomes less then (epsilon * t)
             while (Math.abs(t - c / t) > epsilon * t)
             {
                 t = (t + c / t) / 2.0;  //formula for square root.
             }
             System.out.println("Absoulte square root is: " + t);
         }
         else
        	 System.out.println("Enter positive number");
     }
	public static void main(String[] args) {
Sqrt.squareRoot();

	}

}
