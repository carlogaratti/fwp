package main;

import main.terzo.OggettoCheSaFare;

public class Starter {
	public static void main(String[] args) {
		chiamoEMiAspettoUnRisultato_NON_MI_FIDO();
		chiamoTiPassoUnOggettoScriviLi();
		CHIAMO_E_TI_PASSO_UN_OGGETTO_CHE_SA_FARE_TU_DECIDI_SE_ATTIVARLO_O_MENO_l_oggetto_usa_i_miei_servizi();
		CHIAMO_TI_PASSO_IL_MIO_STATO_E_MI_FIDO_TANTISSIMO();
	
	}

	private static void chiamoEMiAspettoUnRisultato_NON_MI_FIDO() {
		main.Person carlo = new main.Person();
		main.Client client = new main.Client(carlo);
		StringBuffer sb = new StringBuffer();
		client.askAge();
		System.out.println(client.display());
	}
	
	private static void chiamoTiPassoUnOggettoScriviLi() {
		main.secondo.Person carlo = new main.secondo.Person();
		main.secondo.Client client = new main.secondo.Client(carlo);
		StringBuffer sb = new StringBuffer();
		client.askAge(sb);
		System.out.println(sb.toString());
	}
	
	private static void CHIAMO_E_TI_PASSO_UN_OGGETTO_CHE_SA_FARE_TU_DECIDI_SE_ATTIVARLO_O_MENO_l_oggetto_usa_i_miei_servizi(){
		main.terzo.Person carlo = new main.terzo.Person();
		main.terzo.Client client = new main.terzo.Client(carlo);
		StringBuffer sb = new StringBuffer();
		OggettoCheSaFare oggettoCheSaFare = new OggettoCheSaFare(sb);
		carlo.oggettoCheSaFare(oggettoCheSaFare);
		client.askAge();
		System.out.println(sb.toString());
	}
	
	private static void CHIAMO_TI_PASSO_IL_MIO_STATO_E_MI_FIDO_TANTISSIMO(){
		main.quarto.Person carlo = new main.quarto.Person();
		main.quarto.Client client = new main.quarto.Client(carlo);
		StringBuffer sb = new StringBuffer();
		main.quarto.OggettoCheSaFare oggettoCheSaFare = new main.quarto.OggettoCheSaFare(sb);
		carlo.oggettoCheSaFare(oggettoCheSaFare);
		client.askAge();
		System.out.println(sb.toString());
	}

}
