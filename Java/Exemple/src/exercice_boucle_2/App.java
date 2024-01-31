package exercice_boucle_2;

import java.util.Scanner;

/*
Variables
nombre est un entier
Debut du programme
nombre <-- 0
Debut Tan Que
    Tant Que
        nombre < 10 ou nombre > 20
    Faire
        ecrire "Saisir un nombre entre 10 et 20:"
        lire <-- nombre
        Debut Si
            Si
                nombre < 10
            Alors
                ecrire "Plus grand!"
            Sinon Si
                nombre > 20
            Alors
                ecrire "Plus petit!"
            Sinon
                ecrire "Nombre valide"
        Fin Si
Fin Tant Que
Fin du programme
*/

public class App {

	public static void main(String[] args) {
		//Variables
		int nombre;
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		nombre = 0;
		while(nombre < 10 || nombre > 20)
		{
			System.out.println("Saisir un nombre entre 10 et 20:");
			nombre = sc.nextInt();
			if(nombre < 10)
			{
				System.out.println("Plus grand!");
			}
			else if(nombre> 20)
			{
				System.out.println("Plus petit!");
			}
			else
			{
				System.out.println("Nombre valide");
			}
		}		
		sc.close();

	}

}
