package exercice2_7;

import java.util.Scanner;

/*
Variable
kilometre est un reel
miles est un reel
fermeture_prog est un booleen = faux
quit est une chaine de caractere
saisieutilisateur est une chaine de caractere
Debut du programme
quit <-- "q"
Debut tant que
    tant que
        fermeture_prog est faux
    faire
        ecrire "entrez le nombre de kilometres:"
        lire <-- saisieutilisateur
        Debut Si
            Si
                saisieutilisateurest egale a quit
            Alors
                fermeture_prog est vrai
            Sinon
                kilometre <-- conversion en reel de saisieutilisateur
            Si
                kilometre est < 0,01 ou > 1000000
            Alors
                ecrire "Saisie invalide, saisissez une valeur comprise entre 0,01 et 1000000:"
                lire <-- saisieutilisateur
            Sinon
                miles = kilometre / 1,609
            Alors
                ecrire "kilometre + kilometre donne " + miles + " miles "
        Fin Si
Fin tant que
Fin prigramme
*/

public class App {

	public static void main(String[] args) {
		////Variable
		double kilometre = 0;
		double miles = 0;
		boolean fermeture_prog = false;
		boolean isNumeric = true;
		String quit;
		String saisieUtilisateur;
		
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		quit = "q";
		while(!fermeture_prog)
		{
			System.out.println("Veuillez saisir le nombre de kilometres ou q pour quitter");
			saisieUtilisateur =  sc.next();
				if(saisieUtilisateur.equals(quit))
				{
					fermeture_prog = true;	
				}
				else
				{
					for(int i = 0; i < saisieUtilisateur.length(); i++)
					{
						if(!Character.isDigit(saisieUtilisateur.charAt(i)))
						{
							isNumeric = false;
						}
						else
						{
							isNumeric = true;
						}
					}
					if(isNumeric)
					{
						kilometre = Double.parseDouble(saisieUtilisateur);
						if(kilometre < 0.01 || kilometre > 1000000)
						{
							System.out.println("Saisie invalide, saisissez une valeur comprise entre 0,01 et 1 million ou q pour quitter");
							saisieUtilisateur = sc.next();
						}
						else
						{
							miles = kilometre / 1.609;
							miles = Math.round(miles*100.0)/100.00;
							System.out.println(kilometre+ " kilometre donne " + miles+ " miles");
						}
					}
				}
		
		
			}
		sc.close();
	}
}
