package lt.vtmc.deividas.pd6;

import java.util.Scanner;

public class PD6_4 {
	
		public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite kiek puodeliu reikia supakuoti: ");
    int puodeliai = scanner.nextInt();
    int dezutes = puodeliai / 3; // kiek pilnu dezuciu
    int kiekNesupakuota = puodeliai % dezutes;
    
    System.out.println("Pilnu dezuciu skaičius " + dezutes + "\n"
    		+ "Nesupakuotu puodeliu skaičius: " + kiekNesupakuota);
    
   }
}