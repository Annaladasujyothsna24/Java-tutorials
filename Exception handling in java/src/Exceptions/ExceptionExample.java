package Exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=100;
			int n=i/0;
		}catch(ArithmeticException e)
		{
			System.out.println("rest of the code");
		}
		finally {
			
			System.out.println("the block should be excecuted whether exception occured or not");
		}

	}
	
	

}
