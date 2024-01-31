package exercice_hierarchie_objet_2;

public class Herbivore extends Animal {
		
		//Attribut
		private String especeHerbivore;
		
		//Constructeur par defaut
		public Herbivore()
		{
			super();
			especeHerbivore ="Inconnu";
		}
		
		//Constructeur avec parametre
		public Herbivore(String _especeAnimal, String _mangeQuoi, String _seDeplaceComment, String _communiqueComment, String _especeHerbivore)
		{
			super(_especeAnimal, _mangeQuoi, _seDeplaceComment, _communiqueComment);
			this.especeHerbivore = _especeHerbivore;
		}
		
		//Getter
		public String getEspeceHerbivore()
		{
			return this.especeHerbivore;
		}
		
		public void AfficherComportement()
		{
			System.out.println(this.especeHerbivore+" est un animal herbivore issu des "+this.especeAnimal+" qui mange "+this.mangeQuoi+" qui se deplace "+this.seDeplaceComment+" et communique "+this.communiqueComment);
		}
}
