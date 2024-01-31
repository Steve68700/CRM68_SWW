package pile_ou_face;

import java.util.Random;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
			
	  /*Variables
		choixJoueur est un entier
		essai est un entier = 0
		pointJoueur est un entier = 0
		scoreFinal est un booleen = faux
		pileFace est un booleen = faux
		coix est un booleen = faux
		
		Début du programme
		Début Tant Que
			Tant Que
				scorefinal == faux
			Faire
				pileface = Random Booleen
				ecrire "Choisissez Pile (tapez 0) ou Face (tapez 1)"
				ecrire "Votre score actuel est" ,pointJoueur,
				<-- choixJoueur
				Debut Si
					Si
						choixJoueur == 0
					Alors
						choix = faux
					Sinon Si
						choixJoueur == 1
					Alors
						choix = vrai
					Sinon
						ecrire "Saisie invalide"
					Alors
						essai +1
						ecrire "La piece est lancee !"
				Fin Si
				Début Si
					Si
						choix == pileFace
					Alors
						ecrire "Super, vous avez trouve et vous marquez 1 point"
						pointJoueur +1
					Sinon
						ecrire "Vous etes trompez, vous ne marquez pas de point"
				Fin Si
				Debut Si
					Si
						pointJoueur == 3
					Alors
						scorefinal = vrai
						ecrire "Bravo, vous avez gagne, vous avez marque 3 points en " ,essai, " essais"
				Fin Si
		Fin du programme*/
		
		//Variables
		int choixJoueur;
		int essai = 0;
		int pointJoueur = 0;
		boolean scoreFinal = false;
		boolean pileFace = false;
		boolean choix = false;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut du programme
		
		while(scoreFinal == false)
		{
			Random rd = new Random();
			pileFace = rd.nextBoolean();
			System.out.println("Choisissez Pile (tapez 0) ou Face (tapez 1)");
			System.out.println("Votre score actuel est " +pointJoueur);
			choixJoueur =sc.nextInt();
			if(choixJoueur == 0) {
				choix = false;
			}else if(choixJoueur == 1) {
				choix = true;
			}else {
				System.out.println("Saisie invalide");
			}
			essai++;
			System.out.println("La piece est lancee !");
			if(choix == pileFace)
			{
				System.out.println("Super, vous avez trouve et vous marquez 1 point");
				pointJoueur++;
			}
			else
			{
				System.out.println("Vous vous etes trompez, vous ne marquez pas de point");
			}
			if(pointJoueur == 3)
			{
				scoreFinal = true;
				System.out.println("Bravo, vous avez gagne, vous avez marque 3 points en " +essai+ " essais");
			}
		}
		sc.close();

	}

}
