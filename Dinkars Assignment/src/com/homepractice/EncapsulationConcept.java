package com.homepractice;

public class EncapsulationConcept {
	private int a;
	private String b;
	

	public void getA() {
		if (a==5) {
			System.out.println("Private method accessed ");	
		}
	}


	public void setA(int a) {
		this.a = a;
	}


	public String getB() {
		return b;
	}


	public void setB(String b) {
		this.b = b;
	}


	public static void main(String[] args) {
		EncapsulationConcept s=new EncapsulationConcept();
		s.setA(5);
		s.getA();
		

	}

}
