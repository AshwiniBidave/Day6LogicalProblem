package com.Day6;

public class MonthlyPayment {
	public static void MonPayment(double p, double y, double R)
    {
        double n = 12 * y;
        double r = R / (12 * 100);
        double payment = p * r / (1 -Math.pow((1 + r),-n));
        System.out.println(payment + " is monthly payment");
    }

	public static void main(String[] args) {
		MonthlyPayment.MonPayment(1000000, 5, 6); 

	}

}
