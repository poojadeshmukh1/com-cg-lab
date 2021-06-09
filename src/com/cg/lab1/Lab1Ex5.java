package com.cg.lab1;

//Method Name 	calculateSum 
//Method Description 	Calculate Sum 
//Argument 	int n 
//Return Type 	int-sum 
//Logic 	Calculate the sum of first n natural numbers which are divisible by 3 or 5. 
import java.util.Scanner;

public class Lab1Ex5 {
	    static int calculateSum (int n,int x,int y) {
	        int s1,s2,sum;
	        
	        s1 = ((n / x)) * (2 * x + (n / x - 1) * x) / 2;
	        s2 = ((n / y)) * (2 * y + (n / y - 1) * y) / 2;
	        sum = ((n / (x * y))) * (2 * (x * y)+ (n / (x * y) - 1) * (x * y))/ 2;
	        
	        return s1 + s2 - sum;
	        
	    }
	    //comment
	    public static void main(String[] args) {
	        int x;
	        int y;
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the N natural number ");
	        int n = sc.nextInt();
	        
	        System.out.println("The sum of " + n + "number which are divisible by 3 or 5 is " + calculateSum(n, 3, 5));
	        
	    }
	
	}


