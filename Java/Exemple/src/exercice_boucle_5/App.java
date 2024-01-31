package exercice_boucle_5;

import java.util.Scanner;

/*
Variables
nombre_depart est un entier
factorielle est un entier
resutat est un entier = 1
Debut du programme
ecrire "Saisir un nombre entier pour connaitre la somme de sa factorielle:"
lire nombre_depart
Debut Pour
    Pour
        nombre_suivant allant de 1 a nombre_depart
    Faire
        resultat <-- resultat * factorielle
        factorielle ++
Fin Pour
ecrire "La somme de" ,nombre_depart,"! est ",resultat
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		int nombre_depart;
		int factorielle;
		int resultat = 1;
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir un nombre entier pour connaitre la somme de sa factotielle:");
		nombre_depart = sc.nextInt();
		for(factorielle=1; factorielle<=nombre_depart; factorielle++)
		{
			resultat = resultat*factorielle;
		}
		System.out.println("La somme de " +nombre_depart+"! est " +resultat);
		sc.close();

	}

}
