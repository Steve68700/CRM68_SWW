package jalon_objet_2;

public class Article {
	
		//attributs
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
		}
		

}
