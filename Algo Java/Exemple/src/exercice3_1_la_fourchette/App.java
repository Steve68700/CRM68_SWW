package exercice3_1_la_fourchette;

import java.util.Scanner;

/*
Variables
nombre_myst est un entier
nombre_utilisateur est un entier
nombre_trouve = faux
Debut du programme
nombre_myst <--  random(0,100)
Debut Tant Que
    Tant Que
        nombre_trouve == faux
    Faire
        ecrire "Devniner le nombre mystere entre 0 et 100:"
        lire <-- nombre_utilisateur
        Debut Si
            Si
                nombre_utilisateur < nombre_myst
            Alors
                ecrire "Le nombre mystere est plus grand"
            Sinon Si
                nombre_utilisateur > nombre_myst
            Alors
                ecrire "Le nombre mystere est plus petit"
            Sinon
                nombre_trouve == vrai
            Alors
                ecrire "Bravo vous avez trouve le nombre mystere"
        Fin Si
Fin Tant Que
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		int nombre_myst;
		int nombre_utilisateur;
		boolean nombre_trouve = false;
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		nombre_myst = (int)(Math.random()*101);
		while(nombre_trouve == false)
		{
			System.out.println("Devinez le nombre mystere entre 0 et 100:");
			nombre_utilisateur = sc.nextInt();
			if(nombre_utilisateur < nombre_myst)
			{
				System.out.println("Le nombre mystere est plus grand...");
			}
			else if(nombre_utilisateur > nombre_myst)
			{
				System.out.println("Le nombre mystere est plus petit...");
			}
			else
			{
				nombre_trouve = true;
				System.out.println("Bravo, vous avez trouve le nombre mystere");
			}
		
		}

		
		sc.close();
	}

}
