package exercice2_3;

import java.util.Scanner;

/*
Variables
	nombreA est un reel
	nombreB est un reel
	nombreC est un reel
Debut du programme
	ecrire "Saisir un nombre A:"
	lire <-- nombreA
	ecrire "Saisir un nombre B:"
	lire <-- nombreB
	ecrire "Saisir un nombre C:"
	lire <-- nombreC
Debut Si
	Si
		nombreC < nombreA && nombreC < nombreB
		Si
			nombreA > nombreB
		Alors
			ecrire "Le nombreC est < au nombreB qui lui est < au nombreA"
		Sinon
			ecrire "Le nombreC est < au nombreA qui lui est < au nombreB"
	Fin Si
	Si
		nombreB < nombreA && nombreB < nombreC
		Si
			nombreA > nombreC
		Alors
			ecrire "le nombreB est < au nombreC qui lui est < au nombreA"
		Sinon
			ecrire "Le nombreB est < au nombreA qui lui est < au nombreC"
	Fin Si
	Si
		nombreA < nombreB && nombreA < nombreC
		Si
			nombreB > nombreC
		Alors
			ecrire "Le nombreA est < au nombreC qui lui est < au nombreB"
		Sinon
			ecrire "Le nombreA est < au nombreB qui lui est < au nombreC"
	Fin Si
Fin Si
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		double nombreA;
		double nombreB;
		double nombreC;
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir un nombre A : ");
		nombreA = sc.nextDouble();
		System.out.println("Saisir un nombre B : ");
		nombreB = sc.nextDouble();
		System.out.println("Saisir un nombre C : ");
		nombreC = sc.nextDouble();
		//Conditions
		if(nombreC < nombreA && nombreC < nombreB)
		{
			if(nombreA > nombreB)
			{
				System.out.println(+nombreC+ " < " +nombreB+ " < " +nombreA);
			}
			else
			{
				System.out.println(+nombreC+ " < " +nombreA+ " < " +nombreB);
			}
		}
		if(nombreB < nombreA && nombreB < nombreC)
		{
			if(nombreA > nombreC)
			{
				System.out.println(+nombreB+ " < " +nombreC+ " < " +nombreA);
			}
			else
			{
				System.out.println(+nombreB+ " < " +nombreA+ " < " +nombreC);
			}
		}
		if(nombreA < nombreB && nombreA < nombreC)
		{
			if(nombreB > nombreC)
			{
				System.out.println(+nombreA+ " < " +nombreC+ " < " +nombreB);
			}
			else
			{
				System.out.println(+nombreA+ " < " +nombreB+ " < " +nombreC);
			}
		}
		

		
		sc.close();
	}

}
