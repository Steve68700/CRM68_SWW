package exercice_porte_garage;

public class App {

	public static void main(String[] args) {
		
		porte_garage porteGarage = new porte_garage();
		//porte_garage Maporte = new porte_garage("Leroy Merlin", true, false, 25, 100, 0);
		
		boolean test1 = porteGarage.deverouiller();		
		boolean test2 = porteGarage.ouvrir();
		boolean test3 = porteGarage.fermer();
		boolean test4 = porteGarage.verouiller();
		//boolean test5 = porteGarage.ouvrirPartiellement(25);
		//boolean test6 = porteGarage.fermerPartielement(25);
	}

}
