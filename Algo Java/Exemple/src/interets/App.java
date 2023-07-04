package interets;

import java.util.Scanner;

/*
 * Variable
		somme est un réel
		intérêt est un réel
		années est un entier
		isimple est un réel
		icomp est un réel
Début du Programme
		Ecrire "Saisir la somme"
		Lire <-- somme 
		Ecrire "Saisir l'intérêt"
		Lire <-- intérêt
		Ecrire "Saisir le nombre d'années"
		Lire <-- années
		isimple <-- somme(1+années*intérêt)
		icomp <-- somme(1+intérêt)^années
		Ecrire "L'intérêt simple est", isimple et "L'intérêt composer est", icomp
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
		isimple = somme*(1+annees*interet/100d);
		icomp = somme*Math.pow(1+interet/100d,annees);
		System.out.println("L'Interet simple est " + isimple + " et l'interet composer est " + icomp);
	//Fin du Programme	
				
					
	    sc.close();
	}

}
