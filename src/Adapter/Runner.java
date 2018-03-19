package Adapter;

import Singelton.Singleton;

import java.util.HashMap;

//
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //  FacadMethod(new Mallad());
    //FacadMethod(new AdapterTurkey(new Turkey()));
		HashMap<String,String > first= new HashMap<String, String>();

		first.put("First","1919");
		first.put("test","value");

		if(first.containsKey("First"))
		{
			 System.out.print(first.get("First"));
		}
		else
		{
			System.out.print("Not Found");
		}

		for(String temp:first.values())
		{
			System.out.print("\n"+"Printing Values.....");
			System.out.print("\n"+temp);
		}

		for(String val:first.keySet())
		{
			System.out.print("\n"+"Printing keys.....");
			System.out.print("\n"+val);
		}


		Singleton obj= Singleton.instance();

		Singleton obj1= Singleton.instance();

		Singleton obj3= Singleton.instance();

    
	}
	
	// now the interface is changed we Dont have ducks we have turkeys which have there own traits
	public static void FacadMethod(IDuck duck)
	{
		duck.fly();
		duck.quack();	
	}
// Adapting a Enumeration to iterator
	// enumeration is the legacy code 
	// iterator
	
}
