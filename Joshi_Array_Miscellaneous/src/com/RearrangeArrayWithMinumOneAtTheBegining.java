package com;

import java.util.Scanner;

public class RearrangeArrayWithMinumOneAtTheBegining {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		rearrangeArrayWithMinusOneAtFirst(ar);
	}
	public static void rearrangeArrayWithMinusOneAtFirst(int[] ar) {
		int i=ar.length-1;
		int j=ar.length-1;
		while(i>=0) {
			if(ar[i]==-1) {
				i--;
			}else {
				ar[j]=ar[i];
				i--;
				j--;
			}
		}
		while(j>=0) {
			ar[j]=-1;
			j--;
		}
		
//		Printing resultent Array
		for(int z=0; z<ar.length; z++) {
			System.out.print(ar[z]+" ");
		}
	}

}
