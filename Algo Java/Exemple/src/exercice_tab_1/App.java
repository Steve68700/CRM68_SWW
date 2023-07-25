package exercice_tab_1;

/*
Variables
tab1[7] est un tableau d'entier
i est un entier
Debut du programme
Debut Pour
    Pour
        i allant de 0 a 6
        tab1[i] <-- 0
        i suivant
Fin Pour
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		int []tab1 = new int[7];
		int i;
		//Debut du programme
		for(i = 0; i < tab1.length; i++ )
		{
			tab1[i] = 0;
			i++;
		}

	}

}
