package javabasicstests2;

import java.util.ArrayList;

public class Arraylisttest {

	public static void main(String[] args) 
	{
		ArrayList<String> l=new ArrayList<>();
		l.add("String1");
		l.add("String2");
		l.add("String3");
		l.add("String4");
		l.add("String5");
		l.add("String5");//ArrayList allows duplicate values so we use hashset - collections
		System.out.println(l.size());
		for (int i = 0; i < l.size(); i++) 
		{
		System.out.println(l.get(i));
			
		}

	}

}
