package lt.vtmc.deividas.pd7;

import java.util.Scanner;

public class PD7_1 {

	public static void main(String[] args) {

		 	Scanner scanner = new Scanner(System.in);
			System.out.println("Kiek egluciu atvezta? " );
				
			int egluciuSkaicius = scanner.nextInt();   // kiek buvo egluciu?
			
			int suma = 0;
	  
				for (int i = 1; i <= egluciuSkaicius; i++) {
		  
				System.out.println("Iveskite " + i + " eglutes auksti: "); // Panaudojamas scanner metodas tiek kiek yra egluciu
				int egluciuAukstis = scanner.nextInt();
				suma += egluciuAukstis;         // prie sumos = 0 pridedama eglutes aukstis suzinom visu auksti

		 } 
	  
			System.out.println("Eglutes aukscio vidurkis: " + suma / egluciuSkaicius + " cm"); // visu egluciu vidurkis

	}

}
