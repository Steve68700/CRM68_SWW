package exercice2_1;

import java.util.Scanner;

/*
Variable
  age est un entier
Debut du Programme
  Ecrire "entrez votre age"
  Lire <-- age
  Debut Si
     Si
       age est >= 18
     Alors 
       Ecrire "Vous etes majeur"
     Sinon Si 
       age est < 0
     Alors
       Ecrire "Vous n'etes pas encore ne"
     Sinon
       Ecrire"Vous etes mineur"
   Fin Si
 Fin du Programme 
*/


public class App {

	public static void main(String[] args) {
		
		//Variable
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		//Debut du Programme
		System.out.println("Entrez votre age :");
		age =sc.nextInt();
		
		if(age >= 18)
		{
			System.out.println("Vous etes majeur");
		}
		else if(age < 0)
		{
			System.out.println("Vous n'etes pas encore ne");
		}
		else
		{
			System.out.println("Vous etes mineur");
		}
		
		sc.close();
		
		

	}

}
