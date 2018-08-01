package com.phillippense.ObjectsandClassesinJava;

public class Person {
	
	String firstName;
	String lastName;
	int age;
	
	// constructor
	public Person() {
		firstName = "";
		lastName = "";
		age = 0;
	}
	
	// overloaded constructor1
	public Person(String first) {
		firstName = first;
	}
	
	// overloaded constructor2
	public Person(String first, String last) {
		firstName = first;
		lastName = last;
	}
	
	// overloaded constructor3
	public Person(String first, String last, int age) {
		firstName = first;
		lastName = last;
		this.age = age;
	}
	
	// getter method
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter method
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
	public void setAge(int newAge) {
		age = newAge;
		if(age < 0) {
			age = 0;
			System.out.println("Attempted to set age to an invalid value. Set age to 0 instead");
		}
	}

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.setFirstName("Cody");
		person1.setLastName("Mitchell");
		person1.setAge(-1);
		
		person2.setFirstName("Marcos");
		person2.setLastName("Moreno");
		person2.setAge(31);

		System.out.println(person1.getFirstName() + " " + person1.getLastName() + " is " + person1.getAge() + " years old today.");
		System.out.println(person2.getFirstName() + " " + person2.getLastName() + " is " + person2.getAge() + " years old today.");
	}

}
