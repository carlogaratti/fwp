package main;

public class Hotel {
private int _myprice;
	
	public Hotel() {
		_myprice = 8;
	}

	public boolean nearMetro(){
		return false;
	}
	
	public boolean nearTram(){
		return true;
	}
	
	public boolean costoso(int soglia){
		return _myprice >= soglia;
	}
	
	

}
