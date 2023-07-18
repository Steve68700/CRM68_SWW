package exercice3_3_1;

import java.util.Scanner;

/*
Variables
age est un entier
poussin est une chaine de caractere
pupille est une chaine de caractere
minime est une chaine de caractere
cadet est une chaine de caractere
debut du programme
    ecrire "Quel est l'age de l'enfant entre 6 et 12 ans ?"
    lire <-- age
    Debut Si
        Si 
            age <= 5 ans
        Alors
            ecrire "L'enfant n'a pas l'age pour etre inscrit"
        Sinon Si
            age >= 6 et <= 7 ans
        Alors
            ecrire "L'enfant est en poussin"
        Sinon Si
            age >= 8 et <= 9 ans
        Alors
            ecrire "L'enfant est en pupille"
        Sinon Si
            age >= 10 et <= 11 ans
        Alors
            ecrire "L'enfant est en minime"
        Sinon
            age >= 12 ans
        Alors
            ecrire "L'enfant est en cadet"
    Fin Si
Fin du programme
*/

public class App {

	public static void main(String[] args) {
		//Variables
		int age;
		
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Quel est l'age de l'enfant :");
		age = sc.nextInt();
		if(age <= 5)
		{
			System.out.println("L'enfant n'a pas l'age pour etre inscrit");
		}
		else if(age >= 6 && age <= 7)
		{
			System.out.println("L'enfant est en poussin");
		}
		else if(age >= 8 && age <= 9)
		{
			System.out.println("L'enfant est en pupille");
		}
		else if(age >= 10 && age <= 11)
		{
			System.out.println("L'enfant est en minime");
		}
		else if(age >= 12)
		{
			System.out.println("L'enfant est en cadet");
		}
		
		sc.close();

	}

}
