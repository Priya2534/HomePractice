package com.homepractice;
//method name and signature must be same ...return type can be different from version 1.5 onwords
//but it should be child type i.e Object (return type of parent method) then String (return type of 
 // child method) is allowed
// You can write private method with same name and arg in both child and parent class but it is not 
// overriding
// you can not override final method
// can not reduce scope of access modifier in child class .. but can be increased 
//Child method as overriding is handled by JVM at runtime based on object hence
// called as late binding

public class OverridingConcept{
	public static void main(String arg[]) {
		
		ParentClassOverriding a = new ParentClassOverriding();
		a.m1();                                               // Parent method
		ChildClass b = new ChildClass();
		b.m1();                                               // Child method
		
		ParentClassOverriding c= new ChildClass();
		c.m1();  	                                          // child method
	}
}

class ParentClassOverriding {
	public void m1() {
		System.out.println("Parent method ");
	}

}
 class ChildClass extends ParentClassOverriding {
	public void m1() {
		System.out.println("Child method");
	}
	
}
