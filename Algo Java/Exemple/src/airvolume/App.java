package airvolume;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Variable
	    Rayon est un réel
	    Volume est un réel
	    Aire est un réel
		Constante
	    Pi est un réel
	Début du Programme
	    Ecrire "Saisir le Rayon"
	    Lire <-- Rayon
	    Aire <-- 4*Pi*Rayon^2
	    Volume <-- (4/3)*Pi*Rayon^3
	    Ecrire"l'aire de la Sphere est",Aire, "Le Volume de la Sphere est",Volume
	Fin du Programme
	*/
		
		//Declaration des Variables
		double rayon;
		double volume;
		double aire;
		//Constante
		final double PI = Math.PI;
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Saisir le rayon");
		rayon = sc.nextDouble();
		aire = 4*PI*Math.pow(rayon,2);
		volume = (4/3)*PI*Math.pow(rayon,3);
		System.out.println("l'aire de la sphere est " +aire+ " le volume de la sphere est " +volume);
		
		sc.close();
	}

}
