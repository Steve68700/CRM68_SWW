package jalon_algo_niveau1_ws;

import java.util.Scanner;

/*
 * Variable
 * 		prenom est une chaine de caractère
 * 		nom est une chaine de caractère
 * 		dept est un entier
 * 		mail1 est une chaine de caractère
 * 		mail2 est une chaine de caractère
 * 	Début du Programme
 * 		ecrire "saisir votre prenom"
 * 		lire <-- prenom
 * 		ecrire "saisir votre nom"
 * 		lire <-- nom
 * 		ecrire "saisir votre departement"
 * 		lire <-- departement
 * 		mail1 <-- prenom,".",nom,dept,"@arfp.asso.fr"
 * 		mail2 <-- nom,dept,prenom,"@arfp.asso.fr"
 * 		ecrire "Mail 1 : ",mail1,"Mail 2 :",mail2
 * Fin du Programme
 */

public class App {

	public static void main(String[] args) {
			String prenom;
			String nom;
			int dept;
			String mail1;
			String mail2;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Saisir votre Prenom :");
			prenom = sc.nextLine();
			System.out.println("Saisir votre Nom :");
			nom = sc.next();
			System.out.println("Saisir votre Departement :");
			dept = sc.nextInt();
			mail1 = prenom + "." + nom + dept + "@arfp.asso.fr";
			mail2 = nom + dept + prenom + "@arfp.asso.fr";
			
			System.out.println("Mail 1 : " + mail1 + " et Mail 2 : " + mail2);
			
			
			sc.close();
				
	}

}
