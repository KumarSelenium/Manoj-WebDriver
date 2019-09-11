package javabasicstests2;

public class Methods1 

{

	//without return type with parameters
	//without return type without parameters
	public void add()
	{
		int i=10;
		int j=50;
		int sum=i+j;
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		
		Methods1 a=new Methods1();
		a.add();////calling method with method name//it wont return any value
		
	}
	
	
}
