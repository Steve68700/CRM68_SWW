package exercice_hierarchie_objet_2;

public class Animal {
	
		//Attributs
		protected String especeAnimal;
		protected String mangeQuoi;
		protected String seDeplaceComment;
		protected String communiqueComment;
		
		//Constructeur par defaut
		public Animal()
		{
			especeAnimal = "Inconnu";
			mangeQuoi = "Inconnu";
			seDeplaceComment = "Inconnu";
			communiqueComment = "Inconnu";
		}
		
		//Constructeur avec parametres
		public Animal(String _especeAnimal, String _mangeQuoi, String _seDeplaceComment, String _communiqueComment)
		{
			this.especeAnimal = _especeAnimal;
			this.mangeQuoi = _mangeQuoi;
			this.seDeplaceComment = _seDeplaceComment;
			this.communiqueComment = _communiqueComment;
		}
		
		//Getter
		public String getEspeceAnimal()
		{
			return this.especeAnimal;
		}
		
		public String getMangeQuoi()
		{
			return this.mangeQuoi;
		}
		
		public String getSeDeplaceComment()
		{
			return this.seDeplaceComment;
		}
		
		public String getCommuniqueComment()
		{
			return this.communiqueComment;
		}
		
		//Methodes
		
		public void manger()
		{
			System.out.println("Un "+this.especeAnimal+" est un animal qui mange "+this.mangeQuoi);
		}
		
		public void seDeplacer()
		{
			System.out.println("Un "+this.especeAnimal+" est un animal qui se deplace "+this.seDeplaceComment);
		}
		
		public void communiquer()
		{
			System.out.println("Un "+this.especeAnimal+" est un animal qui "+this.communiqueComment);
		}
		
		public void AfficherComportement()
		{
			System.out.println("Un "+this.especeAnimal+ " est un animal qui mange "+this.mangeQuoi+ " qui se deplace "+this.seDeplaceComment+ " et communique "+this.communiqueComment);
		}
		
		
}
