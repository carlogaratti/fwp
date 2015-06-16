package main;

public class Starter {
	public static void main(String[] args) throws Exception {
		H2O atomoAcqua = new H2O();
		O2 atomoOssigeno = new O2();
		Acqua ancoraAcqua = new Acqua();
		ancoraAcqua.add(atomoAcqua).add(atomoOssigeno);
		
		Acqua acqua = new Acqua();
		acqua.add(atomoAcqua).add(atomoOssigeno).add(ancoraAcqua);
		Display display = new Display();
		acqua.size(display);
		
		
	}
}
