package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String kredi1="Mutlu emekli Kredi";
		String kredi2="Hýzlý Kredi";
		String kredi3="Maaþýný halkbanktan alanlara özel Kredi";
		String kredi4="kamu kurumlarýna özel ";
		String kredi5="Özel sektöre özel";
		
		/*
		 * System.out.println(kredi1); System.out.println(kredi2);
		 * System.out.println(kredi3); System.out.println(kredi4);
		 * System.out.println(kredi5);
		 */
		String[] krediler = {"Mutlu emekli Kredi","Hýzlý Kredi","Maaþýný halkbanktan alanlara özel Kredi","kamu kurumlarýna özel","Özel sektöre özel"};
		/*
		 * System.out.println(krediler.length); System.out.println(krediler[4]);
		 */
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println(krediler[i]);
		}
	}
	
	public void variables() {
		double dolarDun = 8.63;
	    double dolarBugun= 8.69;
	    String cizgi=" - ";

	    System.out.println(dolarDun + cizgi+ dolarBugun);

	    boolean dolarYukselmisMi=dolarBugun>dolarDun;


	    if(dolarBugun>dolarDun){
	        System.out.println("currency_up.svg");

	    }
	    else if(dolarBugun<dolarDun){
	      System.out.println("currency_down.svg");
	    }
	    else{
	      System.out.println("currency_equal.svg");
	    }
	}
}
