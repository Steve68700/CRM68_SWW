package exercice3_3;

import java.util.Arrays;
import java.util.Scanner;

/*
Variables
    nombre est un entier
    nombreN est un entier
    i est un entier
    indice est un entier = 0
    nombrePresent est un bouleen = faux
Debut du programme
    ecrire "Saisir la taille du tableau:"
    lire <-- nombre
    tab1<-- nombre
    Debut Pour
        Pour
            i allant de 0 a nombre
        Faire
            ecrire "Saisir un nombre ",(i+1), ":"
            lire <-- tab1[i]
    Fin Pour
    tri [tab1]
    ecrire "Saisissez un des nombres saisie avant pour connaitre son indice dans le tableau:"
    lire <-- nombreN
    Debut Pour
        Pour
            un entier j allant a tab1[j]
            nombrePresent = vrai 
            indice = j
    Fin Pour
    Debut Si
        Si
            nombrePresent = vrai
        Alors
            ecrire "Le nombre ",nombreN, "se trouve a l'indice ",indice
        Sinon
            ecrire "404 Not Found"
    Fin Si
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		int nombre;
		int i;
		int nombreN;
		int indice = 0;
		boolean nombrePresent = false;
		
		Scanner sc = new Scanner(System.in);
		//debut du programme
		System.out.println("Saisir la taille du tableau:");
		nombre = sc.nextInt();
		int []tab1 = new int[nombre];
		for(i = 0; i < nombre; i++)
		{
			System.out.println("Saisir un nombre "+(i+1)+" :");
			tab1[i] = sc.nextInt();
		}	
		Arrays.sort(tab1);
		System.out.println("Saisissez un des nombres saisie avant pour connaitre son indice dans le tableau:");
		nombreN = sc.nextInt();
		for(int j = 0; j < tab1.length; j++)
		{
			if(nombreN == tab1[j])
			{
				nombrePresent = true;
				indice = j;
			}
		}
		if(nombrePresent)
		{
			System.out.println("Le nombre "+nombreN+" se trouve a l'indice "+indice );
		}
		else
		{
			System.out.println("404 Not Found");
		}
		
		sc.close();
	
	
	
	
	}


}
