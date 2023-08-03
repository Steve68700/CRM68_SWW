package exo_proced_fonc_3;

import java.util.Scanner;

/*
Fonction
    calculMoyenne(reel a, reel b)
    moyenne est un reel
    moyenne <-- (a+b)/2
    retourne moyenne
Fin Fonction
    Variables
    nombre1, nombre2 sont des reels
Debut du programme
    ecrire "Saisir le 1er nombre:"
    lire <-- nombre1
    ecrire "Saisir le 2e nombre:"
    lire <-- nombre2
    ecrire "Avec la fonction: la moyenne des 2 nombres est: " ,calculMoyenne(nombre1,nombre2)
Fin du programme
 */

public class App {
	
	//Fonction
	public static double calculMoyenne(double a, double b)
	{
		double moyenne;
		moyenne = (a+b)/2;
		return moyenne;
	}
	
	public static void main(String[] args) {
		//Variables
		double nombre1, nombre2;
		
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir le 1er nombre:");
		nombre1 = sc.nextDouble();
		System.out.println("Saisir le 2e nombre:");
		nombre2 = sc.nextDouble();
		System.out.println("Avec la fonction: la moyenne des 2 nombres est "+calculMoyenne(nombre1,nombre2));
		
		sc.close();

	}

}
