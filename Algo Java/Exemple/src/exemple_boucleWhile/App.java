package exemple_boucleWhile;

/*
Variable
compteur est un entier
Debut du programme
compteur <-- 1
Debut Boucle Tant Que
	Tant Que
		compteur <=50
	Faire
		ecrire compteur
		compteur + 1
Fin boucle tant que
Fin du programme
*/


public class App {

	public static void main(String[] args) {
		//Variable
		int compteur = 0;
		//Debut Boucle Tant Que
		while(compteur <= 50)
		{
			System.out.println(compteur+ "");
			compteur +=1;
		}
		
		compteur = 0;
		do
		{
			System.out.print(compteur+ "");
			compteur++;
		}
		while(compteur<=50);
		
	}

}
