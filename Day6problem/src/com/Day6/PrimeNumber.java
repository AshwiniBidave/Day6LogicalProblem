package com.Day6;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int flag = 0;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number to check Prime: ");
        int n = s.nextInt();
        int m = n / 2;
        for (int i = 2; i <= m; i++)
        {
            if (n % i == 0)
            {
            	System.out.println("Number is not Prime.");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        	System.out.println("Number is Prime.");

	}

}
