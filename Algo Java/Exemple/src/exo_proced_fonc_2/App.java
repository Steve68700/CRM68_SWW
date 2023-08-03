package exo_proced_fonc_2;

import java.util.Scanner;

public class App {

/*
Procedure
    calculPerimetreAire(rell a, reel b, reel c)
    perimetre est un reel
    aire est un reel
    perimetre <-- a+b+c 
    aire <-- ((perimetre/2-a)*(perimetre/2-b)*(perimetre/2-c))^1/2
    ecrire "Avec la procedure: le perimetre est: ",perimetre," l'aire est: ",aire
Fin Procedure
Fonction
    reel calculperimetre(reel a, reel b, reel c)
    perimetre est un reel
    perimetre <-- a+b+c 
    retourne perimetre
Fin Fonction
Fonction
    reel calculAire(reel a, reel b, reel c)
    aire est un reel
    aire <-- ((perimtre/2-a)*(perimetre/2-b)*(perimetre/2-c))^1/2
    retourne aire
Fin Fonction
    Variables
    a, b, c sont des reels
Debut du programme
    ecrire "Saisir le cote a:"
    lire <--a
    ecrire "Saisir le cote b:"
    lire <-- b 
    ecrire "Saisir le cote c:"
    lire <-- c 
    calculPerimetreAire(a,b,c)
    ecrire "Avec la fonction: le perimetre est: ",calculPerimetre(a,b,c)," l'aire est: ",calculAire(a,b,c)
Fin du programme
 */

	//Procedure
	public static void calculPerimetreAire(double a,double b,double c)
	{
		double perimetre, aire;
		perimetre = a+b+c;
		aire = Math.pow(((perimetre/2-a)*(perimetre/2-b)*(perimetre/2-c)),1/2);
	}
	
	//Fonction
	public static double calculPerimetre(double a, double b, double c)
	{
		double perimetre;
		perimetre = a+b+c;
		return perimetre;
	}
	public static double calculAire(double a, double b, double c)
	{
		double aire;
		double perimetre = calculPerimetre(a,b,c);
		aire = Math.pow(((perimetre/2-a)*(perimetre/2-b)*(perimetre/2-c)),0.5);
		return Math.round(aire*100.0)/100.0;
	}
	
	public static void main(String[] args) {
		//Variables
		double a, b, c;
		
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir le cote a:");
		a = sc.nextDouble();
		System.out.println("Saisir le cote b:");
		b = sc.nextDouble();
		System.out.println("Saisir le cote c:");
		c = sc.nextDouble();
		calculPerimetreAire(a,b,c);
		System.out.println("Avec la fonction: le perimetre est: "+calculPerimetre(a,b,c)+" l'aire est: "+calculAire(a,b,c));
		
		sc.close();

	}

}
