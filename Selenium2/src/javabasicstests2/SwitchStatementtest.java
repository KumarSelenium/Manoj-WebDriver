package javabasicstests2;

public class SwitchStatementtest {

	public static void main(String[] args) 
	{
		//to display weekdays which are given matching n value
		int n=5;
		switch (n) 
		{
		case 1://n value 5 !=1 so statement not executed
			System.out.println("Monday");
			break;
		case 2://n value 5 !=1 so statement not executed
			System.out.println("Tuesday");
			break;
		case 3://n value 5 !=1 so statement not executed
			System.out.println("Wednesday");
			break;
		case 4://n value 5 !=1 so statement not executed
			System.out.println("Thursday");
			break;
		case 5://n value 5 =5 so statement is right and executed
			System.out.println("Friday");
			break;
		case 6://n value 5 !=6 so statement not executed 
			System.out.println("Saturday");
			break;

		default://n value 5 is out of range it executes default 
			System.out.println("Days not matching");
			break;
		}

	}

}
