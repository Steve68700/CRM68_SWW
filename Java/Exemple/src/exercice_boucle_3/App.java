package exercice_boucle_3;

import java.util.Scanner;

/*
En boucle Tant Que
Variables
nombre_depart est un entier
nombre_suivant est un entier
Debut du programme
ecrire "Saisir un nombre pour connaitre les 10 suivant:"
lire <-- nombre_depart
nombre_suivant = 0
Debut tant Que
    tant Que
        nombre_suivant < 10
    Faire
        nombre_suivant ++
        ecrire "nombre_depart nombre_suivant"
Fin Tant Que
Fin du programme

En boucle Pour
Variables
nombre_depart est un entier
nombre_suivant est un entier
Debut du programme
ecrire "Saisir un nombre pour connaitre les 10 suivant:"
lire <-- nombre_depart
Debut Pour
    Pour
        nombre_suivant allant de 1 a 10
        ecrire ,nombre_depart, + nombre_suivant+1
Fin de Pour
Fin de programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		int nombre_depart;
		int nombre_suivant;
		Scanner sc = new Scanner(System.in);
		//Debut du programme boucle tant Que
		System.out.println("Saisir un nombre pour connaitre les 10 suivant:");
		nombre_depart = sc.nextInt();
		nombre_suivant = 0;
		while(nombre_suivant <10)
		{
			nombre_suivant++;
			System.out.print(nombre_depart + nombre_suivant);
			
		}
		
		
		/*Debut du programme Pour
		for(nombre_suivant = 1; nombre_suivant <=10; nombre_suivant++ )
		{
			System.out.print(nombre_depart + nombre_suivant);
		}
		*/
		sc.close();
	}

}
