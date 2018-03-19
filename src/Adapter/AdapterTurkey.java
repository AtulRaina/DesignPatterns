package Adapter;

public class AdapterTurkey implements IDuck{

	Turkey turkey;
	public AdapterTurkey(Turkey turkey){
		// TODO Auto-generated constructor stub
		this.turkey= turkey;
	}

	@Override
	public void fly() {
		turkey.walk();
		
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.twiter();
		
	}

}
