package main;

public class Atrio extends Chain{
	
	Atrio(){
		next = new Cucina();
	}
	
	

	@Override
	public void exec() {
		 next(10).exec();
	}

	

}
