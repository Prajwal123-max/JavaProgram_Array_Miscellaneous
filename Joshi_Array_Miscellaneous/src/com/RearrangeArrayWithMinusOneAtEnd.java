package com;

import java.util.Scanner;

public class RearrangeArrayWithMinusOneAtEnd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Size of Array:");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		rearrangeArrayWithMinusOneAtEnd(ar);
		
	}
	public static void rearrangeArrayWithMinusOneAtEnd(int[] ar) {
		int i=0;
		int j=0;
		while(i<ar.length) {
			if(ar[i]==-1) {
				i++;
			}else {
				ar[j]=ar[i];
				i++;
				j++;
			}
		}
		while(j<ar.length) {
			ar[j]=-1;
			j++;
		}
		
//		printing resultent Array
		
		for(int z=0; z<ar.length; z++) {
			System.out.print(ar[z]+" ");
		}
	}

}
