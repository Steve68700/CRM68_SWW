package exercice_boucle_1;

import java.util.Scanner;

/*
Variables
nombre est un entier
Debut du programme
nombre <-- 0
Debut Tan Que
    Tant Que
        nombre < 1 ou nombre > 3
    Faire
        ecrire "Saisir un nombre entre 1 et 3:"
        lire <-- nombre
Fin Tant Que
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		int nombre;
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		nombre = 0;
		while(nombre < 1 || nombre > 3)
		{
			System.out.println("Saisir un nombre entre 1 et 3:");
			nombre = sc.nextInt();
		}
				
		
		
		sc.close();
	}

}
