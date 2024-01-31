package airvolume;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		/*Variable
	    rayon est un réel
	    volume est un réel
	    aire est un réel
		Constante
	    Pi est un réel
	Début du Programme
	    Ecrire "Saisir le rayon"
	    Lire <-- rayon
	    aire <-- 4*Pi*rayon^2
	    volume <-- (4/3)*Pi*rayon^3
	    Ecrire"l'aire de la Sphere est",aire, "Le volume de la Sphere est",volume
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
		System.out.println("l'aire de la sphere est " +(Math.round(aire*100.0)/100.0)+ " et le volume de la sphere est " +Math.round(volume*100.0)/100.0);
		
		sc.close();
	}

}
