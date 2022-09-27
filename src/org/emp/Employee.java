package org.emp;

public class Employee {
	public void greensOmr(String Name, long No) {
		System.out.println(Name+"\n"+No);		
		System.out.println("a");		
		System.out.println("a");		
	}
	public void greensOmr(String name, String name1) {
		System.out.println(name+"\n"+name1);
	}
	private void greensOmr(long No , String Name) {
		System.out.println(No+"\n"+Name);

	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.greensOmr("manojkumar", 464646546);
		e.greensOmr(556565, "kumar");
		e.greensOmr("manojkumar", "Manojkumarrr");
	}



}

