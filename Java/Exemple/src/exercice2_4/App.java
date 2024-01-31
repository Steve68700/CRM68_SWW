package exercice2_4;
import java.util.Scanner;
/*
Variable
annee est un entier
Debutdu programme
ecrire "Saisir une Annee : "
lire <-- annee
Debut Si
    Si
        (annee / 4 && /annee /100) ou annee /400
    Alors
        ecrire "C'est une annee bissextile"
    Sinon
        ecrire "Ce n'est pas une annee bissextile"
    Fin Si
Fin Si
*/
public class App {

	public static void main(String[] args) {
		//Variable
		int annee;
		int mod1;
		int mod2;
		int mod3;
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir une Annee : ");
		annee = sc.nextInt();
		mod1 = annee%4;
		mod2 = annee%100;
		mod3 = annee%400;
		if((mod1 == 0 && mod2 != 0) || mod3 == 0)
		{
			System.out.println(+ annee+ " est une annee bissextile");
		}
		else
		{
			System.out.println(+annee+ " n'est pas une annee bissextile");
		}
		sc.close();

	}

}
