package exercice6_6_1;

import java.util.Scanner;

/*
Variables
age est un entier
sexe est une chaine de caractere
Debut du programme
ecrire "Quel est votre sexe? (homme = h et femme = f)"
lire <-- sexe
ecrire "Quel est votre age?"
lire <-- age
Debut Si
    Si
        age >= 18 et age <= 35 et sexe = f
    Alors
        ecrire "Vous etes imposable"
    Sinon Si
        age >= 20 et sexe = h
    Alors
        ecrire "Vous etes imposable"
    Sinon
        ecrire "Vous n'etes pas imposable"
Fin Si
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		int age;
		String sexe;
		
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Quel est votre sexe, Zorglubien? (homme = h et femme = f)");
		sexe = sc.next();
		System.out.println("Quel est votre age, Zorglubien?");
		age = sc.nextInt();
		if(age >= 18 && age >= 35 && sexe.equals("f"))
		{
			System.out.println("Vous etes imposable");
		}
		else if(age >= 20 && sexe.equals("h"))
		{
			System.out.println("Vous etes imposable");
		}
		else
		{
			System.out.println("Vous n'etes pas imposable");
		}
		
		sc.close();
	}

}
