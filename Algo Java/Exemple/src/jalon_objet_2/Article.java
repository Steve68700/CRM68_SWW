package jalon_objet_2;

public class Article {
	
		/*attributs
		private String reference;
		private String designation;
		private double prixHt;
		private final int tauxTva;
		
		//constructeur par defaut
		public Article()
		{
			reference = " ";
			designation = " ";
			prixHt = 0;
			tauxTva = 20;
		}
		
		//constructeur avec parametre
		public Article(String _reference, String _designation, double _prixHt, int _tauxTva)
		{
			this.reference = _reference;
			this.designation = _designation;
			this.prixHt = _prixHt;
			this.tauxTva = _tauxTva;
		}
		
		public double calculerPrixTtc()
		{
			return this.prixHt + (this.prixHt * this.tauxTva/100);
		}
		
		public void afficherArticle()
		{
			System.out.println("L'article reference: " + this.reference + " de designation: " + this.designation + " est au prix TTC de " +this.calculerPrixTtc());
		}*/
	
	//Corriger de Adeline
	
		//attributs
		private String reference;
		private String designation;
		private double prixHT;
		private static double tauxTVA;
		
		//constructeur par defaut
		public Article()
		{
			this.reference = "inconnu";
			this.designation = "inconnu";
			this.prixHT = 0.0;
		}
		
		//constructeur avec parametre
		public Article(String _reference, String _designation, double _prixHT)
		{
			this.reference = _reference;
			this.designation = _designation;
			this.prixHT = _prixHT;
		}
		
		//GETTER
		public String getReference()
		{
			return this.reference;
		}
		
		public String getDesignation()
		{
			return this.designation;
		}
		
		public double getPrixHT()
		{
			return this.prixHT;
		}
		
		public static double getTauxTVA()
		{
			return tauxTVA;
		}
		
		//SETTER
		public void setReference(String _reference)
		{
			this.reference = _reference;
		}
		
		public void setDesignation(String _designation)
		{
			this.designation = _designation;
		}
		
		public void setPrixHT(double _prixHT)
		{
			this.prixHT = _prixHT;
		}
		
		public static void setTauxTVA(double _tauxTVA)
		{
			tauxTVA = _tauxTVA;
		}
		
		public double calculPrixTTC()
		{
			return this.prixHT + (this.prixHT * tauxTVA/100);
		}
		
		public String afficherArticle()
		{
			return "Reference: " +this.getReference()
			+"\nDesignation : "+this.getDesignation()
			+"\nPrix HT : "+this.getPrixHT()
			+"\nTaux TVA : "+this.getTauxTVA()
			+"\nPrix TTC : "+this.calculPrixTTC();
		}
}
