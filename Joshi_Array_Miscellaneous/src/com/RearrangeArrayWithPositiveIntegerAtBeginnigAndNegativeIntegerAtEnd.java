package com;

import java.util.Scanner;

public class RearrangeArrayWithPositiveIntegerAtBeginnigAndNegativeIntegerAtEnd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the ize of Array:");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		rearrangeArrayWithPositiveIntegerAtBeginnigAndNegativeIntegerAtEnd(ar);
	}
	public static void rearrangeArrayWithPositiveIntegerAtBeginnigAndNegativeIntegerAtEnd(int[] ar) {
		int count=0;
//		counting all the positive integer in array
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>=0) {
				count++;
			}
		}
		
//		creating array sze of positive integers in array
		int[] pos=new int[count];
		int p=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>=0) {
				pos[p]=ar[i];
				p++;
			}
		}
		
//		creating array for negativeintegers in array
		int[] neg=new int[ar.length-count];
		int ne=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]<0) {
				neg[ne]=ar[i];
				ne++;
			}
		}
		
//		creating resultant array to store all in order regarding request from question
		int[] res=new int[ar.length];
		for(int i=0; i<pos.length; i++) {
			res[i]=pos[i];
		}
		for(int i=0; i<neg.length; i++) {
			res[count+i]=neg[i];
		}
		
//		Printing resultant array
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

}
