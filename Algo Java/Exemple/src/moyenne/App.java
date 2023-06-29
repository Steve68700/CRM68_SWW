package moyenne;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Variable
    N1 est un entier
    N2 est un entier
    Moyenne es un réel
Début Programme
    Ecrire "Saisir le 1er Nombre"
    Lire <-- N1
    Ecrire "Saisir le 2eme Nombre"
    Lire <-- N2
    Moyenne <-- (N1+N2)/2
    Ecrire "La Moyenne est", Moyenne
Fin de programme
 */
		
		//Declaration des Variables
		int nombre1;
		int nombre2;
		double moyenne;
		String maChaine = "Saisir le 1er nombre";
		Scanner sc;
		sc = new Scanner(System.in);
		
		
		System.out.println(maChaine);
		nombre1 = sc.nextInt();
		System.out.println("Saisir le 2eme nombre");
		nombre2 = sc.nextInt();
		moyenne = (nombre1 + nombre2) /2;
		
		System.out.println("La moyenne est " +moyenne);
		
		sc.close();
	}

}
