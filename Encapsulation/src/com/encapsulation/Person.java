package com.encapsulation;

public class Person {
	
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
//variables private  will access only within the class only
/*public class Main{
	
	public static  void main(String[] args)
	{
		Person myP=new Person();
		myP.name("john");
		System.out.println(myP.name);
	}
}*/