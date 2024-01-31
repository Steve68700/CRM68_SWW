package exercice2_2;

import java.util.Scanner;

/*
Varibles
nombreA est un entier
nombreB est un entier
Début du Programme
    Ecrire"Saisir le nombre A"
    Lire <-- nombreA
    Ecrire "Saisir le nombre B"
    Lire <-- nombreB
    Debut Si
        Si 
            nombreA > nombreB
        Alors
            Ecrire "Le nombre B est inferieur au nombre A"
        Sinon 
            Ecrire "Le nombre A est inferieur au nombre B"
    Fin Si
Fin du Programme
*/

public class App {

	public static void main(String[] args) {
		
		//Variables
		int nombreA;
		int nombreB;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut du Programme
		System.out.println("Saisir le nombre A : ");
		nombreA = sc.nextInt();
		System.out.println("Saisir le nombre B : ");
		nombreB = sc.nextInt();
		
		if(nombreA > nombreB)
		{
			System.out.println(nombreB+ " inferieur " + nombreA);
		}
		else 
		{
			System.out.println(nombreA+ " inferieur " + nombreB);
		}
		
		sc.close();

	}

}
