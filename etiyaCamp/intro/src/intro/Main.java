package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String kredi1="Mutlu emekli Kredi";
		String kredi2="H�zl� Kredi";
		String kredi3="Maa��n� halkbanktan alanlara �zel Kredi";
		String kredi4="kamu kurumlar�na �zel ";
		String kredi5="�zel sekt�re �zel";
		
		/*
		 * System.out.println(kredi1); System.out.println(kredi2);
		 * System.out.println(kredi3); System.out.println(kredi4);
		 * System.out.println(kredi5);
		 */
		String[] krediler = {"Mutlu emekli Kredi","H�zl� Kredi","Maa��n� halkbanktan alanlara �zel Kredi","kamu kurumlar�na �zel","�zel sekt�re �zel"};
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
