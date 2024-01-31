package exercice_hierarchie_objet_2;

public class Abeille extends Animal {
		
		//Constructeur par defaut
		public Abeille()
		{
			super();
		}
		
		//Constructeur avec parametres
		public Abeille(String _especeAnimal, String _mangeQuoi, String _seDeplaceComment, String _communiqueComment)
		{
			super(_especeAnimal, _mangeQuoi, _seDeplaceComment, _communiqueComment);
		}
		
		public void AfficherComportement()
		{
			System.out.println("L'abeille est "+this.especeAnimal+ " qui mange "+this.mangeQuoi+ " qui se deplace "+this.seDeplaceComment+ " et communique "+this.communiqueComment);
		}
		
		
		
}
