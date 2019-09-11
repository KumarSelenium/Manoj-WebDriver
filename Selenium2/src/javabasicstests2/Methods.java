package javabasicstests2;

public class Methods 

{
      //With return type with parameters
	//With return type without parameters
	public int add()
	{
		int i=10;
		int j=20;
		int sum=i+j;
		
		 return sum;
		
	}
	public static void main(String[] args)
	{
		
		Methods v=new Methods();
		//v.add();//calling method with method name//it wont return any value
		int returns=v.add();//calling method with variable//it will return value
		System.out.println(returns);
	
		
		
	}
	
	
}
