package exercice4_4_1;

import java.util.Scanner;

/*
Variables
heure est un entier
minute est un entier
Debut du programme
    ecrire "Quelle heure est-il ?"
    lire <-- heure
    ecrire "Quelle minute est-il ?"
    lire <-- minute
    minute = +1 
    Debut Si
        Si
            minute = 60
        Alors
            ecrire "heure +1 et minute 00"
    Fin Si
    Debut Si
        Si
            heure = 24
        Alors
            ecrire "heure 00 et minute"
    Fin Si
Fin programme
 */
public class App {

	public static void main(String[] args) {
		//Variables
		int heure;
		int minute;
		
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Quelle heure est-il ?");
		heure = sc.nextInt();
		System.out.println("Quelle minute est-il ?");
		minute = sc.nextInt();
		minute++;
		if(minute == 60)
		{
			heure++;
			minute = 0;
		}
		if(heure == 24)
		{
			heure = 0;
		}
		System.out.println(heure + " heure et " +minute+ " minute");
		
		sc.close();
		
	}

}
