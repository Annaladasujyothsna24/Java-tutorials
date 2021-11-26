package com;

public class Animal {
	
	void eat()
	{
		System.out.println("eating");
		
	}

}
class dog extends Animal{
	
	void bark()
	{
		System.out.println("the dog is barking");
	}
}
class BabyDog extends dog{
	
	void weep()
	{
		System.out.println("the babydog is weeping");
	}
}
//multilevel inheritance
