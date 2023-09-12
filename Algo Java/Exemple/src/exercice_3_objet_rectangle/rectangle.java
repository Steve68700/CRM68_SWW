package exercice_3_objet_rectangle;

public class rectangle {
	
		//attributs
		double longueur;
		double largeur;
		
		//constructeur avvec parametres
		public rectangle(double _longueur, double _largeur)
		{
			this.longueur = _longueur;
			this.largeur = _largeur;
		}
		
		//methodes
		public double surface()
		{
			return this.longueur * this.largeur;
		}
		
		public double perimetre()
		{
			return (this.longueur + this.largeur)*2;
		}
		
		public void afficher()
		{
			System.out.println("La surface du rectangle est " +this.surface()+ " et son perimetre est de " +this.perimetre());
		}
}
