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
		
		//Setter
		public void setEspeceAnimal(String _especeAnimal)
		{
			this.especeAnimal = _especeAnimal;
		}
		
		public void setMangeQuoi(String _mangeQuoi)
		{
			this.mangeQuoi = _mangeQuoi;
		}
		
		public void setSeDeplaceComment(String _seDeplaceComment)
		{
			this.seDeplaceComment = _seDeplaceComment;
		}
		
		public void setCommuniqueComment(String _communiqueComment)
		{
			this.communiqueComment = _communiqueComment;
		}
		
		//Methodes
		
		public boolean manger()
		{
			return true;
		}
		
		
}
