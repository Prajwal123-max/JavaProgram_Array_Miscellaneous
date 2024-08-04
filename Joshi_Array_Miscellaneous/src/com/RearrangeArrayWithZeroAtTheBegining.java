package com;

import java.util.Scanner;

public class RearrangeArrayWithZeroAtTheBegining {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		rearrangingArrayElementsWithZeroAtTheBegining(ar);
	}
	public static void rearrangingArrayElementsWithZeroAtTheBegining(int[] ar) {
		int i=ar.length-1;
		int j=ar.length-1;
		while(i>=0) {
			if(ar[i]==0) {
				i--;
			}else {
				ar[j]=ar[i];
				i--;
				j--;
			}
		}
		while(j>=0) {
			ar[j]=0;
			j--;
		}
//		Printing resultent array.
		for(int z=0; z<ar.length; z++) {
			System.out.print(ar[z]+" ");
		}
	}
}
