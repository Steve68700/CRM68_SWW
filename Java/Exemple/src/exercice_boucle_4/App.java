package exercice_boucle_4;

import java.util.Scanner;

/*
Variables
nombre_depart est un entier
nombre_suivant est un entier
resutat est un entier
Debut du programme
ecrire "Saisir un nombre pour connaitre le resultat de ces entiers jusqu'a lui meme:"
lire nombre_depart
Debut Pour
    Pour
        nombre_suivant allant de 1 a nombre_depart
    Faire
        resultat <-- resultat + nombre_suivant
        nombre_suivant ++
Fin Pour
ecrire "Le resultat des entiers jusqu'a" ,nombre_depart, "est" ,resultat,
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		int nombre_depart;
		int nombre_suivant;
		int resultat = 0;
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir un nombre entier pour connaitre le resultat de ses entiers jusqu'a lui meme:");
		nombre_depart = sc.nextInt();
		for(nombre_suivant=1; nombre_suivant<=nombre_depart; nombre_suivant++)
		{
			resultat = resultat +nombre_suivant;
		}
		System.out.println("Le resultat des entiers jusqu'a " +nombre_depart+ " est " +resultat);
		sc.close();
	}

}
