package exercice2_2_2;

import java.util.Scanner;

/*
Variable
nombreA est un entier
nombreB est un entier
Debut du programme
ecrire "Saisir un 1er nombre entier:"
lire <-- nombreA
ecrire "Saisir un 2e nombre entier:"
lire <-- nombreB
Debut Si
    Si
        nombreA > 0 && nombreB > 0 || (nombreA < 0 && nombreB < 0)
    Alors
        ecrire "Le produit des 2 nombres est positif"
    Sinon Si
        nombreA || nombreB = 0
    Alors
        ecrire "Le produit des 2 nombres est nulle"
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
		System.out.println("Saisir un 1er nombre entier:");
		nombreA =sc.nextInt();
		System.out.println("Saisir un 2e nombre entier:");
		nombreB = sc.nextInt();
		if(nombreA > 0 && nombreB > 0 || (nombreA < 0 && nombreB < 0))
		{
			System.out.println("Le produit des 2 nombres est positif");
		}
		else if(nombreA == 0 || nombreB == 0)
		{
		System.out.println("Le produit des 2 nombres est nulle");
		}
		else
		{
			System.out.println("Le produit des 2 nombres est negatif");
		}
		
		sc.close();
	
	}

}
