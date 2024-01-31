package exercice2_6;

import java.util.Scanner;

/*
Variable
nombre est un entier
i est un entier
premier est un booleen
Debut du programme
    premier <-- vrai
    ecrire "Saisir un nombre :"
    lire <-- nombre
    Pour i allant de 2 a nombre-1
        Debut Si
            Si
                nombre%i = 0
            Alors 
                premier <-- faux
        Fin Si
    Fin boucle Pour
    Debut Si
        Si
            premier = vrai
        Alors
            ecrire "nombre ",nombre " est un nombre premier"
        Sinon 
            ecrire "nombre " ,nombre " n'est pas un nombre premier"
    Fin Si
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variable
		int nombre;
		int i;
		boolean premier = true;
		
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir un nombre entier :");
		nombre =sc.nextInt();
		for(i = 2; i < nombre; i+= 1)
		{
			if(nombre%i == 0)
			{
				premier = false;
			}
		}
		if(premier == true)
		{
			System.out.println(+nombre+ " est un nombre premier");
		}
		else
		{
			System.out.println(+nombre+ " n'est pas un nombre premier");
		}
		
		
		sc.close();
		
	}

}
