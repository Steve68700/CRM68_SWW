package surface_circulaire;

import java.util.Scanner;

/*
 * Variables
    rayon est un réel
    angle est un réel
    aire est un réel
Constante
    Pi est réel
Début du Programme
    Ecrire"Saisir le Rayon"
    Lire <-- rayon
    Ecrire"Saisir l'angle"
    Lire <-- angle
    Aire <-- (Pi*rayon^2*angle)/360
    Ecrire"L'aire du secteur circulaire est", aire
    Fin du Programme	
 */


public class App {

	public static void main(String[] args) {

		//Variable
		double rayon;
		double angle;
		double aire;
		//Constante
		final double PI = Math.PI;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le rayon");
		rayon = sc.nextDouble();
		System.out.println("Saisir l'angle");
		angle = sc.nextDouble();
		aire = (PI*Math.pow(rayon,2)*angle)/360;
		System.out.println("L'air du secteur circulaire est " +(Math.round(aire*100.0)/100.0));
		
		sc.close();
	}

}
