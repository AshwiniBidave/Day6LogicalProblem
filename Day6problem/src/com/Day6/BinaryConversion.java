package com.Day6;

import java.util.Scanner;

public class BinaryConversion {
	public static void decimalToBinaryConversion()
	{ 
	  Scanner s =new Scanner(System.in);
	  System.out.println("Enter a Decimal number : ");
      int dec = s.nextInt();
	  int[] binaryArray = new int[20];
	  int i = 0;
	  while (dec > 0)
	{
		int r = dec % 2;
		binaryArray[i++] = r;
		dec = dec / 2;
	}
	  System.out.println("Binary number :");
	  for (int j = i - 1; j >= 0; j--)
   {
	 System.out.print(binaryArray[j] + "");
   }
}
		 
		
	public static void main(String[] args) {
	BinaryConversion.decimalToBinaryConversion();

	}

}
