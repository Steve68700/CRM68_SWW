package exemple_boucleFor;

/*
Exemple de boucle for qui compte de 1 a 50

Variable
i est un entier
Debut du programme
Debut Boucle For
	pour i allant de 1 a 50
		ecrire i
		suivant i+1
Fin Boucle For
Fin du programme
 */
public class App {

	public static void main(String[] args) {
		//variable
		int i;
		//Bouble For de 1 a 50
		for(i=1; i<=50; i++)
		{
			System.out.println(i);
		}
		
		//Boucle For de 50 a 1
		for(int j=50; j>=1; j--)
		{
			System.out.println(j);
		}
		
		// Boucle For de 1 a 50 avec un pas de 2
		for(int k = 0; k<=50; k+=2)
		{
			System.out.println(k);
		}
		
		for(i=20; i<=100; i+=15)
		{
			System.out.println(i);
		}

	}

}
