package exercice1_5;

import java.util.Scanner;

/*
 	Variable
 	a est un entier
 	b est un entier
 	c est un entier
 */
public class App {

	public static void main(String[] args) {

		//Variable
		
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut du programe
		
		System.out.println("Entrez la valeur de \"a\" : ");
		a = sc.nextInt();
		System.out.println("Entrez la valeur de \"b\": ");
		b = sc.nextInt();
		System.out.println("Les valeurs de \"a\" et \"b\" avant inversion sont : " + a + " et " + b);
		
		c = b;
		b = a;
		a = c;
		
		System.out.println("Les valeurs de \"a\" et \"b\" apres inversion sont : " + a + " et " + b);
		
		sc.close();	
	}

}
