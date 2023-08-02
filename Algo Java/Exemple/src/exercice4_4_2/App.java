package exercice4_4_2;

import java.util.Scanner;

/*
Variables
heure est un entier
minute est un entier
seconde est un entier
Debut du programme
    ecrire "Quelle heure est-il ?"
    lire <-- heure
    ecrire "Quelle minute est-il ?"
    lire <-- minute
    ecrire "Quelle seconde est-il ?"
    lire <-- seconde
    seconde = +1
    Debut Si
        Si
            seconde = 60
        Alors
            minute+1
            seconde = 0
    Fin Si
    Debut Si
        Si
            minute = 60
        Alors
            heure+1
            minute = 0
    Fin Si
    Debut Si
        Si
            heure = 24
        Alors
            heure = 0
    Fin Si
    ecrire "Dans une seconde il sera ",heure,"h",minute,"m",seconde,"s"
Fin programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		int heure;
		int minute;
		int seconde;
		
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Quelle heure est-il ?");
		heure = sc.nextInt();
		System.out.println("Quelle minute est-il ?");
		minute = sc.nextInt();
		System.out.println("Quelle seconde est-il ?");
		seconde = sc.nextInt();
		seconde++;
		if(seconde == 60)
		{
			minute++;
			seconde = 0;
		}
		if(minute == 60)
		{
			heure++;
			minute = 0;
		}
		if(heure == 24)
		{
			heure = 0;
		}
		
		System.out.println("Dans une seconde il sera " +heure+"h"+minute+"m"+seconde+"s");
		
		
		sc.close();
	}

}
