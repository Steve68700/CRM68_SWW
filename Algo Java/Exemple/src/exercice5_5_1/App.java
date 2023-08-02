package exercice5_5_1;

import java.util.Scanner;

/*
Variables
photocop est un entier
facture1 est un reel
facture2 est un reel
facture3 est un reel
total est un reel = 0
Debut du programme
ecrire "Combien souhaitez vous de photocopies ?"
lire <-- photocop
facture1 = 0,10
facture2 = 0,09
facture3 = 0,08
Debut Si
    Si
        photocop <= 10
    Alors
        total = photocop* facture1
Fin Si
Debut Si
    Si
        photocop > 10 et photocop <= 30
    Alors
        total = 10*facture1 + (photocop - 10)* facture2
Fin Si
Debut Si
    Si 
        photocop > 30
    Alors
        total = 10*facture1 + 20*facture2 + (photocop - 30)* facture3
Fin Si
ecrire "Le tarif de vos photocopies est de" ,total, "euros"
Fin de programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		int photocop;
		double facture1;
		double facture2;
		double facture3;
		double total = 0;
		
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Combien souhaitez vous de photocopies ?");
		photocop = sc.nextInt();
		facture1 = 0.10;
		facture2 = 0.09;
		facture3 = 0.08;
		if(photocop <= 10)
		{
			total = photocop*facture1;
		}
		if(photocop > 10 && photocop <= 30)
		{
			total = 10*facture1+(photocop-10)*facture2;
		}
		if(photocop > 30)
		{
			total = 10*facture1+20*facture2+(photocop-30)*facture3;
		}
		System.out.println("Le tarif de vos photocopies est de "+Math.round((total)*100.00)/100.00+ " euros");
		
		sc.close();
	}

}
