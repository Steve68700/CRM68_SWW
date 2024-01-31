package exercice_hierarchie_objet_2;

public class Chien extends Animal {
		
		//Attribut
		private String race;
		private String nom;
		
		//Constructeur par defaut
		public Chien()
		{
			super();
			race = "Inconnu";
			nom = "Inconnu";
		}
		
		//Constructeur avec parametres
		public Chien(String _especeAnimal, String _mangeQuoi, String _seDeplaceComment, String _communiqueComment, String _race, String _nom)
		{
			super(_especeAnimal, _mangeQuoi, _seDeplaceComment, _communiqueComment);
			this.race = _race;
			this.nom = _nom;
		}
		
		//Getter
		public String getRace()
		{
			return this.race;
		}
		
		public String getNom()
		{
			return this.nom;
		}
		
		public void AfficherComportement()
		{
			System.out.println(this.nom+ " est un chien de race "+this.race+" issue de la categorie des "+this.especeAnimal+ " qui mange "+this.mangeQuoi+ " qui se deplace "+this.seDeplaceComment+ " et communique "+this.communiqueComment);
		}
		
}
