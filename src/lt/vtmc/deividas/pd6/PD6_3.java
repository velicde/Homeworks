package lt.vtmc.deividas.pd6;
import java.util.Scanner;
public class PD6_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sienos ilgis m:");
		int a = scanner.nextInt(); // Sienos ilgis metrais
		System.out.println("Sienos aukstis m");
		int h = scanner.nextInt(); // sienos aukstis m
		System.out.println("Plytos Kaina Eur");
		double k = scanner.nextDouble(); // plytos kaina
		
		int sienosPlotasCm = a * h * 10000;
		int plytosPlotas = 200; //cm
		
		int reikesPlytu = sienosPlotasCm / plytosPlotas;
		double plytuKaina = reikesPlytu * k;
		System.out.println("Plytu kiekis " + reikesPlytu + " Plytos kainuos " + plytuKaina + " Eur");
	}

}
