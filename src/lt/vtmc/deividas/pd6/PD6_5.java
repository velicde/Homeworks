package lt.vtmc.deividas.pd6;

import java.util.Scanner;

public class PD6_5 {
	
	 
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		
		double tunelioIlgis = 264L; // tunelio ilgis metrais
		
		System.out.println("Koks automobilio greitis?");
		int greitis = scanner.nextInt(); // automobilio greitis km/h
		scanner.close();
		
		double greitisMetrais = greitis * 1000;
		
		int laikassekundemis = 3600; // sekundziu vienoj valandoj
		double pravaziavimoLaikas = tunelioIlgis * laikassekundemis / greitisMetrais ;
		System.out.println("Automobilis tuneli pravaziuos per " + pravaziavimoLaikas + " s");
		
	}

}
