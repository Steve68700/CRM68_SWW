package exercice3_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//Variables
		String chaine_de_caractere;
		String lettre_de_alphabet;
		int nombre_de_lettre;
		int i;
		
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir une chaine de cractere se terminant par un point :");
		chaine_de_caractere = sc.next();
		System.out.println("Saisir une lettre pour savoir si elle est presente et combien de fois :");
		lettre_de_alphabet = sc.next();
		if(chaine_de_caractere == "" || chaine_de_caractere == ".")
		{
			System.out.println("La Chaine est Vide");
		}
		else
		{
			for(i = 0; i > chaine_de_caractere; i++)
			{
				if(lettre_de_alphabet == chaine_de_caractere[i])
				{
					nombre_de_lettre++;
				}
			}
		}
		if(nombre_de_lettre == 0)
		{
			System.out.println("La lettre n'est pas presente");
		}
		else
		{
			System.out.println("La lettre "+lettre_de_alphabet+ "est presente "+nombre_de_lettre+ " fois");
		}
		
		
		sc.close();
	}

}
