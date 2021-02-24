/*When exact method match is not available it will search for another method with promotion of 
argument for example if char if not present it will search for int ,if int is also not available
it will search for float and so on*/

// Overloading is handled by compiler based on reference at compile time hence early binding


package com.homepractice;

public class OverloadingConcept {
	public void m1(int a) {
		System.out.println("Method for int");
	}
	public void m1(float f) {
		System.out.println("method for float:");
		
	}
	public void m1(boolean b) {
		System.out.println("method for boolean:");
		
	}
	

	public static void main(String[] args) {
		OverloadingConcept a = new OverloadingConcept();
		a.m1(10);   // Method for Int
		a.m1(67l);  // Method for float
		a.m1('a');  // Method for Int
		a.m1(true);  // for boolean no automatic promotion is applicable.there should be exact match
		//a.m1(19.90); for double it will give you error as no matching.
		
	}

}
