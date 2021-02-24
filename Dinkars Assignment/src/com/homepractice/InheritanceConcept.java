package com.homepractice;

public class InheritanceConcept {

	public static void main(String[] args) {
		C c = new C();
		c.s="Priya";  
		P p = new P();
		p.add();
		// p.sub(); cannot access child method by using parent ref
		P p1 = new C();
		p1.a= 10;
		
	}

}
// Parent class
class P{
	int a;
	String s;
	public void add() {
		System.out.println("Add method ");
	}
}
// Child class
class C extends P{
   public void sub() {
	System.out.println("Sub");
}

}
