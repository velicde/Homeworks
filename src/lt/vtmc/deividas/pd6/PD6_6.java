package lt.vtmc.deividas.pd6;
import java.util.Scanner;
public class PD6_6 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   
    System.out.println("Kiek žuvu gyvena akvariume? ");
    int zuvys = scanner.nextInt();
    
    System.out.println("Kiek zuvu i akvariuma idedama kiekviena diena? ");
    int kiekIdeda = scanner.nextInt();
    
    System.out.println("Kiek dienu praejo? ");
    int dienuSkaicius = scanner.nextInt();
    
    int kiekZuvuAkvariume = kiekIdeda * dienuSkaicius + zuvys;
    System.out.println("Po 3 dienu akvariume gyvens " + kiekZuvuAkvariume + " zuvu.");
   

	}

}
