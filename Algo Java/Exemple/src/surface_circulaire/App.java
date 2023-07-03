package surface_circulaire;

import java.util.Scanner;

/*
 * Variables
    R est un réel
    A est un réel
    Aire est un réel
Constante
    Pi est réel
Début du Programme
    Ecrire"Saisir le Rayon(R)"
    Lire <-- R
    Ecrire"Saisir l'angle(A)"
    Lire <-- A
    Aire <-- Pi*R*2*
    Ecrire"L'Aire du secteur circulaire est", Aire
    Fin du Programme	
 */


public class App {

	public static void main(String[] args) {

		//Variable
		double R;
		double A;
		double Aire;
		//Constante
		final double PI = Math.PI;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le rayon R");
		R = sc.nextDouble();
		System.out.println("Saisir l'angle A");
		A = sc.nextDouble();
		Aire = (PI*Math.pow(A,2)*A)/360;
		System.out.println("L'air du secteur circulaire est " +(Math.round(Aire*100.0)/100.0));
		
		sc.close();
	}

}
