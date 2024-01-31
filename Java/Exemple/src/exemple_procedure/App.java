package exemple_procedure;

import java.util.Scanner;

public class App {

	//procedure qui ne prend aucun argument
	public static void disBonjour()
	{
		System.out.println("Bonjour !!!");
	}
	
	public static void disBonjourPrenom(String prenom)
	{
		System.out.println("Bonjour "+prenom);
	}
	
	public static void main(String[] args) {
		
		disBonjour();
		
		String saisie;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisir votre nom :");
		saisie = sc.next();
		
		disBonjourPrenom(saisie);
		
		sc.close();
		
	}
}
