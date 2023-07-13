package exercice2_2_1;

import java.util.Scanner;

/*
Variable
nombreA est un entier
nombreB est un entier
Debut du programme
ecrire "Saisir un 1er nombre entier positif ou negatif:"
lire <-- nombreA
ecrire "Saisir un 2e nombre entier positif ou negatif:"
lire <-- nombreB
Debut Si
    Si
        nombreA > 0 && nombreB > 0 || (nombreA < 0 && nombreB < 0)
    Alors
        ecrire "Le produit des 2 nombres est positif"
    Sinon
        ecrire "Le produit des 2 nombres est negatif"
Fin Si
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		int nombreA;
		int nombreB;
		
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir un 1er nombre positif ou negatif:");
		nombreA =sc.nextInt();
		System.out.println("Saisir un 2e nombre positif ou negatif:");
		nombreB = sc.nextInt();
		if(nombreA > 0 && nombreB > 0 || (nombreA < 0 && nombreB < 0))
		{
			System.out.println("Le produit des 2 nombres est positif");
		}
		else
		{
			System.out.println("Le produit des 2 nombres est negatif");
		}
		
		
		sc.close();
	}

}
