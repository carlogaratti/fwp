package main;

public class Cucina extends Chain {

	Cucina(){
		next = new End();
	}

	@Override
	public void exec() {
		 next(30).exec();
	}

}
