package exercice2_5;

import java.util.Scanner;

/*
Variable
nombre est un entier
Debut du programme
    ecrire "Saisir un nombre :"
    lire <-- nombre
    Pour i allant de 2 a nombre-1
        Debut Si
            Si
                nombre%i = 0
            Alors 
                ecrire "Diviseur :",i
        Fin Si
    Fin boucle Pour
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variable
		int nombre;
		int i;
		Scanner sc = new Scanner(System.in);
		
		//Debut du programme
		System.out.println("Saisir un nombre entier :");
		nombre = sc.nextInt();
		for(i = 2; i < nombre; i+= 1)
		{
			if(nombre%i == 0)
			{
				System.out.println("Diviseur : " +i);
			}
		}
		
		sc.close();
	}

}
