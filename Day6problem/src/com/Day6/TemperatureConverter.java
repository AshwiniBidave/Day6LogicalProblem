package com.Day6;

import java.util.Scanner;

public class TemperatureConverter 
{
	static double celsius(double f)
	{	
	   return  (f-32)*5/9;
	}
	static double fahrenheit(double c)
	{	
		return  ((9*c)/5)+32;
	}
	public static void main(String[] args)
	{
		double a,b;
  	    Scanner sc=new Scanner(System.in);	   	 
        System.out.println("Enter  Fahrenheit temperature");
        a=sc.nextDouble(); 
        System.out.println("Celsius temperature is = "+celsius(a));	
        System.out.println("Enter celsius temperature");
        b=sc.nextDouble(); 
        System.out.println("Celsius temperature is = "+ fahrenheit(b));	
    } 


	}


