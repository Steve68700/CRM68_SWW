package jalon_algo_niveau2_WS;

import java.util.Scanner;

/*
Variables
	estTilEtudiant est une chaine caracteres
	etudiant est un booleen
	jourDeLaSemaine est un entier
Debut du programme
    ecrire "etes vous etutiant Oui(O ou o) ou Non(N ou n)"
    lire <-- estTilEtudiant
    Debut Si
        Si
            estTilEtudiant egale O ou o
        Alors
            etudiant egale vrai
        Sinon
            etudiant egale faux
    Fin Si
    Debut Si
        Si
            etudiant egale vrai
        Alors
            ecrire "Quel jour de la semaine : 1 lundi, 2 mardi, 3 mercredi, 4 jeudi, 5 vendredi, 6 samedi"
            lire <-- jourDeLaSemaine
            Debut Si
                Si
                    jourDeLaSemaine est egale a 3
                Alors
                    ecrire "Vous avez droit a une reduction de 50%"
                Sinon Si
                    jourDeLaSemaine est egale a 4
                Alors
                    ecrire "Vous avez droit a une reduction de 20%"
                Sinon
                    ecrire "Vous n'avez droit a aucune reduction"
            Fin Si
        Sinon
            ecrire "Vous n'avez droit a aucune reduction"
    Fin Si
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		String estTilEtudiant;
		boolean etudiant;
		int jourDeLaSemaine;
		
		Scanner sc = new Scanner(System.in);
		//debut du programme
		System.out.println("Etes vous etudiant Oui (O ou o) ou Non(N ou n)");
		estTilEtudiant = sc.next();
		if(estTilEtudiant.equals("o") || estTilEtudiant.equals("o"))
		{
			etudiant = true;
		}
		else
		{
			etudiant = false;
		}
		if(etudiant)
		{
			System.out.println("Quel jour de la semaine : \n1 Lundi 2 Mardi 3 Mercredi \n4 Jeudi 5 Vendredi 6 Samedi");
			jourDeLaSemaine = sc.nextInt();
			if(jourDeLaSemaine == 3)
			{
				System.out.println("Vous avez droit a une reduction de 50%");
			}
			else if(jourDeLaSemaine == 4)
			{
				System.out.print("Vous avez droit a une reduction de 20%");
			}
			else
			{
				System.out.println("Vous n'avez pas droit a une reduction");
			}
		}
		else
		{
			System.out.println("Vous n'avez pas droit a une reduction");
		}
		
		
		sc.close();
		}
	}

