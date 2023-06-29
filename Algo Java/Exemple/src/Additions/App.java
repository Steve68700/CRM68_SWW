package Additions;

import java.util.Scanner;

// Ceci est un commentaire sur une seule ligne

/* Ceci est un
 * commentaire
 * sur plusieurs lignes
 */

/* 
Variable
	nombre1 est un entier
	nombre2 est un entier
	Resulat est un entier
	Début Programme
	Ecrire "Saisir le 1er Nombre"
	Lire <-- Nombre1
	Ecrire "Saisir le 2eme Nombre"
	Lire <-- Nombre2
	Resultat <-- Nombre1 + Nombre2
	Ecrire "Le Resultat de l'Addition de ",Nombre1," et ",Nombre2," est égale à ",Resultat
Fin de programme
*/ 
public class App {

	public static void main(String[] args) {
		// declaration des variables
		int nombre1;
		int nombre2;
		int resultat;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le 1er nombre");
		nombre1 = sc.nextInt();
		System.out.println("Saisir le 2eme nombre");
		nombre2 = sc.nextInt();
		resultat = nombre1 + nombre2;
		
		System.out.println("Le resultat de l'addition de "+nombre1+ " et " +nombre2+ " est "+ resultat);
		sc.close();
	}

}
