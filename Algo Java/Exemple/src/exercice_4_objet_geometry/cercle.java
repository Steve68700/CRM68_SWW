package exercice_4_objet_geometry;

public class cercle {
	
		//attribut
		point centre = new point(4, 9);
		double rayon;
		final double Pi = 3.14;
		
		//constructeur avec parametres
		public cercle( double _rayon)
		{
			this.rayon = _rayon;
		}
		
		
		//methodes
		public double perimetre()
		{
			return 2 * Pi * this.rayon;
		}
		
		public double surface()
		{
			return Pi * this.rayon * this.rayon;
		}
		
		public void testAppartenance()
		{
			
		}
		
		public void afficher()
		{
			
		}

}
