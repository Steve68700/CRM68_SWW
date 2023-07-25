package exercice_tab_2;

/*
Variables
tab2[6] est un tableau de caractere
debut du programme
tab2[0] <-- "a"
tab2[1] <-- "e"
tab2[2] <-- "i"
tab2[3] <-- "o"
tab2[4] <-- "u"
tab2[5] <-- "y"
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		//Variables
		char[] tab2 = new char[6];
		//Debut du programme
		tab2[0] = 'a';
		tab2[1] = 'e';
		tab2[2] = 'i';
		tab2[3] = 'o';
		tab2[4] = 'u';
		tab2[5] = 'y';
		for( int i = 0; i< tab2.length; i++)
		{
		System.out.println(tab2[i]+ " ");//ou print pour afficher en ligne
		}
	}

}
