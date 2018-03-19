package Adapter;

public class Mallad implements IDuck{

	@Override
	public void fly() {
		System.out.print("\n Hello Mallad Duck Flying");
		
	}

	@Override
	public void quack() {
		System.out.print("\n Hello Mallad Quack Quack");
	}

}
