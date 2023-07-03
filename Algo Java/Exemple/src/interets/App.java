package interets;

import java.util.Scanner;

/*
 * Variable
		Somme est un réel
		Intérêt est un réel
		Années est un entier
		ISimple est un réel
		IComp est un réel
Début du Programme
		Ecrire "Saisir la Somme"
		Lire <-- Somme 
		Ecrire "Saisir l'Intérêt
		Lire <-- Intérêt
		Ecrire "Saisir le nombre d'années"
		Lire <-- Années
		ISimple <-- Somme(1+Années*Intérêt)
		IComp <-- Somme(1+Intérêt)^Années
		Ecrire "L'Intérêt simple est", ISimple et "L'Intérêt Composer est", IComp
Fin du Programme
*/

public class App {

	public static void main(String[] args) {
	//Variable
		double somme;
		double interet;
		int annees;
		double isimple;
		double icomp;
		Scanner sc = new Scanner(System.in); 
	//Début du Programme
		System.out.println("saisir la Somme");
		somme = sc.nextDouble();
		System.out.println("Saisir l'Interet");
		interet = sc.nextDouble();
		System.out.println("Saisir le nombre d'Annees");
		annees = sc.nextInt();
		isimple = somme*(1+annees*interet);
		icomp = somme*-(1+interet)/annees;
		System.out.println("L'Interet simple est " + isimple + " et l'interet composer est " + icomp);
		
				
					
	    sc.close();
	}

}
