package lt.vtmc.deividas.pd8;

import java.util.Scanner;

public class PD8_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kiek moliugu turite: ");
		int moliugai = scanner.nextInt();
		
		System.out.println("Koks yra maziausias priimamu moliugu svoris: ");
		double maziausias = scanner.nextDouble();
		System.out.println("Koks yra didziausias priimamu moliugu svoris: ");
		double didziausias = scanner.nextDouble();
		
		double visiSvoriai = 0;
		int supirkimas = 0;
		double atrinktiSvoriai = 0;
		
		for (int i = 1 ; i <= moliugai ; i ++) {
			System.out.println("Iveskite " + i + " moliugo svori: ");
			double moliuguSvoriai = scanner.nextDouble();
			
			visiSvoriai += moliuguSvoriai;
			
				if (moliuguSvoriai >= maziausias & moliuguSvoriai <= didziausias ) {
					supirkimas += 1; 
					atrinktiSvoriai += moliuguSvoriai;
				
			
			}

		}
		double vidutinisVisiSvoriai = visiSvoriai / moliugai;
		double vidutinisAtrinktiSvoriai = atrinktiSvoriai / supirkimas;
		System.out.println("Visu moliugu vidutinis svoris " + vidutinisVisiSvoriai + " kg.\n" 
		+ "I supirkima atrinkta moliugu: " + supirkimas + "\nVidutinis vieno atrinkto "
				+ "moliugo svoris: " + vidutinisAtrinktiSvoriai + " kg.");
	}

}
