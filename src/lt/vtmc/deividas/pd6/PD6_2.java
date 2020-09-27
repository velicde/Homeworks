package lt.vtmc.deividas.pd6;
import java.util.Scanner;
public class PD6_2 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
		System.out.println("Kiek paskaitu yra pirmadieni?");
		int pirmad = scanner.nextInt();
		System.out.println("Kiek paskaitu yra antradieni?");
		int antrad = scanner.nextInt();
		System.out.println("Kiek paskaitu yra treciadieni?");
		int trec = scanner.nextInt();
		System.out.println("Kiek paskaitu yra ketvirtadieni?");
		int ketv = scanner.nextInt();
		System.out.println("Kiek paskaitu yra penktadieni?");
		int penkt = scanner.nextInt();
		
		int perSavaite = pirmad + antrad + trec + ketv + penkt ;
		int minutesPerSavaite = perSavaite * 45;
				System.out.println( "Paskaitu skaicius per savaite " + perSavaite);
				System.out.println("Tai sudaro " + minutesPerSavaite + " minuciu");  // 1080 minuciu
	}
}
