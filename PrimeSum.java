package com;

import java.util.Scanner;

public class PrimeSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rs= sumOfPrimes(n);
		System.out.println("The sum of prime numbers in the given number is "+rs);
	}
	static int sumOfPrimes(int n){
		int sum=0;
		while(n>0) {
			int d=n%10;
			if(isPrime(d)) 
				sum=sum+d;
			n=n/10;
		}
		return sum;
	}
	static boolean isPrime(int n) {
		if(n==0||n==1) 
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) 
				return false;
		}
		return true;
	}
}
