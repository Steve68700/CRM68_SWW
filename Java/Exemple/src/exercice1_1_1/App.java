package exercice1_1_1;

import java.util.Scanner;

/*
Variable
nombre est un entier
Debut de programme
    ecrire "Saisir un nombre entier positif ou negatif :"
    lire <-- nombre
    Debut Si
        Si 
            le nombre est positif
        Alors
            ecrire "le nombre est positif"
        Sinon Si
        	le nombre est negatif
        Alors
            ecrire "le nombre est negatif"
    Fi Si
Fin du programme
*/

public class App {

	public static void main(String[] args) {
		//Variables
		int nombre;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut du programme
		System.out.println("Saisir un nombre positif ou negatif :");
		nombre = sc.nextInt();
		//Condition
		if(nombre > 0)
		{
			System.out.println(nombre+ " est positif");
		}
		else if(nombre < 0)
		{
			System.out.println(nombre+ " est negatif");
		}
		
		
	sc.close();	
	}

}
