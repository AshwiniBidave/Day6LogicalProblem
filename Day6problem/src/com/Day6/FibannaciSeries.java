package com.Day6;

import java.util.Scanner;

public class FibannaciSeries {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3;
		Scanner s =new Scanner(System.in);
		
        System.out.println("Enter the number of element: ");
        int number = s.nextInt();
        System.out.println(n1 + " " + n2 + " "); //printing 0 and 1    
        for (int i = 2; i < number; ++i) //loop starts from 2 because 0 and 1 are already printed    
        {
            n3 = n1 + n2; //0+1=1
            System.out.println(n3 + " ");
            n1 = n2; //n1=1
            n2 = n3; //n2=1

	}

}
}