package jalon_alogo_Fibonacci;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//Variables
		int position;
		int nb;
		int nbPrecedent;
		int nbCourant;
		int nbSuivant;
		String resultat;
		Scanner sc = new Scanner(System.in);
		//Debut du programe
		System.out.println("Saisissez le nombre de suite de Fibonacci que vous souhaitez afficher:");
		nb = sc.nextInt();
		position = 2;
		resultat ="\t0\n\t1";
		nbPrecedent = 0;
		nbCourant = 1;
		if(nb > 2)
		{
			while(position < nb)
			{
				nbSuivant = nbPrecedent + nbCourant;
				resultat = resultat +"\n\t"+ nbSuivant;
				nbPrecedent = nbCourant;
				nbCourant =nbSuivant;
				position++;
			}
		}
		else
		{
			nb = 2;
		}
		System.out.println("les "+nb+" premiers nombres de la suite de Fibonacci sont \n"+resultat);
		sc.close();
		}
	}
