package exercice_tab_3;

import java.util.Scanner;

/*
Variables
nombre est un entier
i est un entier
tab1 est tableau d'entier
positif est un entier = 0
negatif est un entier = 0
Debut du programme
ecrire "Saisir la taille du tableau" ,(i+1), ":"
lire <-- nombre
tab1 <-- nombre
Debut Pour
    Pour
        i allant de 0 a nombre
    Faire
    ecrire "Saisir un nombre:"
        lire <-- tab1[i]
        Debut Si
            Si
                tab1[i] < 0
            Alors
                negatif++
            Sinon
                positif++
        Fin Si
        i++
Fin Pour
ecrire negatif, "nombre negatif et " ,positif, " nombre positif"
Fin du programme
 */


public class App {

	public static void main(String[] args) {
		//Variables
		int nombre;
		int i;
		int positif = 0;
		int negatif = 0;
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir la talle du tableau:");
		nombre = sc.nextInt();
		int []tab1 = new int[nombre];
		for(i = 0; i < nombre; i++)
		{
			System.out.println("Saisir un nombre "+(i+1)+" :");
			tab1[i] = sc.nextInt();
			if(tab1[i] < 0)
			{
				negatif++;
			}
			else
			{
				positif++;
			}
		}
		System.out.println(negatif+ " nombre negatif et "+positif+ " nombre positif");
				
		sc.close();
	}

}
