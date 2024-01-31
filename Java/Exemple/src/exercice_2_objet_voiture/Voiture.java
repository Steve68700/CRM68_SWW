package exercice_2_objet_voiture;

public class Voiture {
		
		//attribut
		String marque;
		double prix;
		
		//constructeur par defaut
		public Voiture()
		{
			this.marque = " ";
			this.prix = 0;
		}
		
		//getter
		public String getMarque()
		{
			return this.marque;
		}
		
		public double getPrix()
		{
			return this.prix;
		}
		
		//setter
		public void setMarque(String _marque)
		{
			this.marque = _marque;
		}
		
		public void setPrix(double _prix)
		{
			this.prix = _prix;
		}
		
		public void afficher( )
		{
			System.out.println("Votre vehicule est de la marque "+this.marque+ " et est affiche au prix de: "+this.prix);
		}
}
