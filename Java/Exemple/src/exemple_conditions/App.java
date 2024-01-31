package exemple_conditions;

import java.util.Scanner;

/*
	Variables
		nombre1 est un entier
	Debut du programme
		Ecrire "saisir un nombre entier"
		Lire <-- nombre1
	Debut Si
		Si
			nombre1 est egale a 20
		Alors
			Ecrire "Le nombre est egale a 20"
		Sinon Si
			nombre1 est egale a 15
		Alors
			Ecrire "Le nombre est egale a 15"
		Sinon
			Ecrire "le nombre n'est pas egale a 20 et n'est pas egal  a 15"
	Fin Si
	Fin du Programme
 */
public class App {

	public static void main(String[] args) {
			
			int nombre1;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Saisir un nombre entier : ");
			nombre1 = sc.nextInt();
			
			if(nombre1 == 20)
			{
				System.out.println("Le nombre saisi est egal a 20");
			}
			else if(nombre1 == 15)
			{
				System.out.println("Le nombre saisi est egal a 15");
			}
			else
			{
				System.out.println("Le nombre saisi est ni egale a 20 ni égale a 15");
			}
			
			sc.close();
			
			
	}

}
