class Animal {
	
	public void move()
	{
		System.out.println("Animal can move");

		
	}
 }
	
	class Dog extends Animal
	{
		public void move() {
			System.out.println("Dog can walk ");
			super.move();
		
		
		
	}

}
