package exercice_objet_poupees_Russes;

public class PoupeeTest {

	public static void main(String[] args) {
			
			PoupeeRusse poupee1 = new PoupeeRusse("Poupee 1", 10, false, false, false);//nom, 10, est ferme, est dans aucune autre et ne contient rien
			PoupeeRusse poupee2 = new PoupeeRusse("Poupee 2", 20, false, false, false);//nom, 20, est ferme, est dans aucune autre et ne contient rien
			
			//Verification que tout fonctionne correctement
			/*poupee2.ouvrir();
			poupee1.placerDans(poupee2);
			poupee2.fermer();
			poupee2.ouvrir();
			poupee1.sortirDe(poupee2);
			poupee2.fermer();
			*/
			//Verification que tout ne fonctionne pas
			poupee1.placerDans(poupee2);
			poupee1.fermer();
			poupee1.ouvrir();
			poupee2.placerDans(poupee1);
			
	}

}
