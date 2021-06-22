package com.cg.lab1;

import java.util.Scanner;

public class Lab1Ex1 {
	public static void main(String[] args) {
		
		int n;
		int sum;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter a number");
		n =sc.nextInt();
		for(sum=0;n!=0;n=n/10)
		{
			int d;
			d=n%10;
			sum=sum+(d*d*d);
			//edited 
			
		}
		System.out.println("sum of qubes of digits"+sum);
		sc.close();
	}

}