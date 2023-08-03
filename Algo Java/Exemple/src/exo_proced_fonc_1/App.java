package exo_proced_fonc_1;

import java.util.Scanner;

public class App {

/*
Procedure
	inversion(entier a, entier b)
	tmp est un entier
	tmp <-- a 
	a <-- b 
	b <-- tmp
	ecrire "apres inversion: nombre a = ",a," nombre b = ,b
Fin Procedure
	Variables
	nombre1 est un entier
	nombre2 est un entier
Debut du programme
	ecrire "Saisir le  1er nombre:"
	lire <-- nombre1
	ecrire "Saisir le 2e nombre:"
	lire <-- nombre2
	ecrire "Avant inversion: nombre a = ",nombre1," nombre b = ",nombre2
	inversion(nombre1,nombre2)
Fin du programme
 */
	
	public static void inversion(int a,int b)
	//Procedure
	{
		int tmp;
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("Apres inversion: nombre a = "+a+" nombre b = "+b);
	}
	//Fin Procedure
	public static void main(String[] args) {
		//Variables
		int nombre1;
		int nombre2;
		
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir le 1er nombre:");
		nombre1 = sc.nextInt();
		System.out.println("Saisir le 2e nombre:");
		nombre2 = sc.nextInt();
		System.out.println("Avant inversion: nombre a = "+nombre1+" nombre b = "+nombre2);
		inversion(nombre1,nombre2);
		
		sc.close();

	}

}
