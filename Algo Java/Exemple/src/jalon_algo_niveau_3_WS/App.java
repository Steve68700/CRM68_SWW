package jalon_algo_niveau_3_WS;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//Variables
		int nombre;
		int resultat;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		//Debut du programme
		System.out.println("Saisir un nombre entre 1 et 10 pour connaitre sa table de multiplication:");
		nombre = sc.nextInt();
		for(i=0; i<=10; i++)
		{
			System.out.println(i*nombre);
		}
		
		
		
		sc.close();
	}

}
