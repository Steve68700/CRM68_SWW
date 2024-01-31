package exercice_hierarchie_objet_2;

public class Test_Animal {

	public static void main(String[] args) {
			
			Animal animal = new Animal();
			animal.AfficherComportement();
			Animal animal1 = new Animal("carnivore", "de la viande", "a quatre ou deux pattes", "de divers facon");
			animal1.AfficherComportement();
			Abeille abeille = new Abeille("insecte", "du nectar", "en volant", "en bourdonnant");
			abeille.AfficherComportement();
			Chien chien = new Chien("canide", "de la patee", "une fois sur deux", "pas", "labrador", "Prince");
			chien.AfficherComportement();
			Chien chien1 = new Chien("canide", "pas", "tout le temps", "en aboyant", "Pinsher", "Cliff");
			chien1.AfficherComportement();
			Herbivore herbivore = new Herbivore("equide", "du foin", "en galopant", "en hennisant", "Un cheval");
			herbivore.AfficherComportement();
	}

}
