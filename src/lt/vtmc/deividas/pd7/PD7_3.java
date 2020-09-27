package lt.vtmc.deividas.pd7;

import java.util.Scanner;

public class PD7_3 {

	public static void main(String[] args) {
	
		
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Iveskite kuro bako talpa: ");
			int bakas = scanner.nextInt();
			
			System.out.println("Iveskite kuro sanaudas: ");
			int sanaudos = scanner.nextInt();
			
			int lyginesDienos = sanaudos;
			int nelyginesDienos = sanaudos * 2;
			
			int dviejuDienuSanaudos = lyginesDienos + nelyginesDienos; 
			
			int kiekKartuPoDviParas = bakas / dviejuDienuSanaudos; // Suzinom kiek kartu keliaus po dvi paras,
	//kad apsiskaiciuot ar liks kuro dar vienai dienai su x1 kuro sanaudom
			
			int dienos = 0; // jei lieka kuro dar vienai dienai prilyginam skaiciu vienetui ir ji pridedam prie galutinio rezultato (prie x1 + x2 sanaudu poros)
			
			if (bakas - dviejuDienuSanaudos * kiekKartuPoDviParas > sanaudos) {
				dienos = 1 ;
			}
			int kiekDienuKeliauti = kiekKartuPoDviParas * 2 + dienos; // *2 nes kiekKartuPoDvIParas apskaiciuoja dvieju dienu sanaudas 
			System.out.println("Keliauti bus galima " + kiekDienuKeliauti + " dienas");
		
	}

}
