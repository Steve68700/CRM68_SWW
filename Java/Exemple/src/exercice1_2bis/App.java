package exercice1_2bis;

import java.util.Scanner;

/*
Variables
rayon est un reel
aire est un reel
volume est u reel
Constante
Pi est un reel
Debut du programme
ecrire "Saisir le rayon:"
lire <-- rayon
aire = (4*Pi)*rayon^2
volume = (4/3*Pi)*rayon^3
ecrire ,aire, "est son aire et" ,volume, "est son volume"
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		double rayon;
		double aire;
		double volume;
		//Constante
		final double Pi = Math.PI;
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir le rayon:");
		rayon = sc.nextDouble();
		aire = (4*Pi)*Math.pow(rayon,2);
		volume = (4d/3*Pi)*Math.pow(rayon,3);
		System.out.println(aire+ " est son aire et " +volume+ " est son volume");
		
		sc.close();
	}

}
