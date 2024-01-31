package exercice_3_2;

import java.util.Scanner;

/*
Variables
somme est un reel
nombre_magasin est un entier
Debut du programme
nombre_magasin = 0
ecrire "Saisissez la somme de depart:"
lire <-- somme
Debut Si
    Si
        somme >= 1
    Alors
        Debut Tant Que
            Tant Que
                somme > 0
                Debut Si
                    Si
                    somme - (somme/2+1) >= 0
                Alors
                    somme <-- somme - ((somme/2)+1)
                Sinon
                    somme <-- 0
                Fin Si
                nombre_magasin <-- +1
        Fin Tant Que     
    Fin Si
ecrire "Vous avez fait" ,nombre_magasin, "magasin(s)"
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		int nombre_magasin = 0;
		double somme;
		Scanner sc = new Scanner(System.in);
		//Debut du programe
		System.out.println("Saisissez la somme de depart:");
		somme = sc.nextDouble();
		if(somme >= 1)
		{
			while(somme > 0)
			{
				if(somme -(somme/2) +1 >= 0)
				{
					somme-= (somme/2)+1;
				}
				else
				{
					somme = 0;	
				}
				nombre_magasin++;
			}
		}
		System.out.println("Vous avez fait " +nombre_magasin+ " magasin(s)");
		sc.close();
	}

}
