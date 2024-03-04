package testJava;

import java.util.Arrays;

public class CheckTwoArraysContainSameElementOrNot {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]= {2,3,4,6,5,1};
		boolean status = Arrays.equals(a, b);
		if(status==true) {
			System.out.println("Array are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
		
	}

}