package jalon_algo_niveau_3_WS;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//Variables
		int nombre;
		int resultat;
		int i;
		String back = "o";
		Scanner sc = new Scanner(System.in);
		
		//Debut du programme
		i = 0;
		while(back.equals("o"))
		{
			System.out.println("Saisir un nombre entre 1 et 10 pour connaitre sa table de multiplication:");
			nombre = sc.nextInt();
			for(i=0; i<=10; i++)
			{
				resultat = i*nombre;
				System.out.println(+i+ "x" +nombre+ "=" +resultat);
			}
			System.out.println("Souhaitez vous afficher une autre table de multiplication? oui = o");
			back = sc.next();
		}
		
		
		sc.close();
	}

}
