package exercice_2_objet_voiture;

public class App {

	public static void main(String[] args) {
		
			Voiture voiture1 = new Voiture();
			Voiture voiture2 = new Voiture();
			
			String marque = voiture1.getMarque();
			double prix = voiture1.getPrix();
			voiture1.afficher();
			voiture2.setMarque("Opel");
			voiture2.setPrix(15000);
			voiture2.afficher();
	}

}
