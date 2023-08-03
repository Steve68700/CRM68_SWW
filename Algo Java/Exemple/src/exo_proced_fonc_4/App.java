package exo_proced_fonc_4;

import java.util.Scanner;

/*

 */

public class App {
	
	public static boolean anneebissextile(int annee)
	{
	boolean bissextile;
	bissextile = (annee%4 == 0 && annee%100!= 0) || annee%400 == 0;
	return bissextile;
	}
	

	public static void main(String[] args) {
		//Variables
		int annee;
		
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir une annee pour savoir si elle est bissextile:");
		annee = sc.nextInt();
		if(anneebissextile(annee))
		{
			System.out.println("Avec la fonction: l'annee "+annee+" est bissextile");
		}
		else
		{
			System.out.println("L'annee "+annee+" n'est pas bissextile");
		}
		
		sc.close();
	}

}
