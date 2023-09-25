package exercice_4_objet_geometry;

public class cercle {
	
		//attributs
		private point centre = new point(4, 9);
		private Double rayon;
		
		//constructeur
		public cercle(point _centre, double _rayon)
		{
			this.centre = _centre;
			this.rayon = _rayon;
		}
		
		
		//methodes pour calculer le perimetre du cercle
		public double perimetre()
		{
			double pi = Math.PI;
			return 2 * pi * this.rayon;
		}
		
		//methode pour calculer la surface d'un cercle
		public double surface()
		{
			double pi = Math.PI;
			return pi * Math.pow(rayon, 2);
		}
		
		//methode pour tester si le point appartient au cercle
		public void testAppartenance(point unPoint)
		{
			//on calcule delta X et delta Y
			Double deltaX = unPoint.getAbscisse() - this.centre.getAbscisse();
			Double deltaY = unPoint.getOrdonnee() - this.centre.getOrdonnee();
			//on calcule la distance
			Double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
			//Si la distance est egal au rayon
			if(distance.doubleValue() == this.rayon.doubleValue())
			{
				//alors le point appartient au cercle
				System.out.println("Le point appartient au cercle");
			}
			else
			{
				//sinon il n'appartient pas au cercle
				System.out.println("Le point n'appartient pas au cercle");
			}
		}
		
		//methode pour afficher les informations
		public void afficher()
		{
			System.out.println("Le cercle a un perimetre de: "+this.perimetre()+" et une surface de: "+this.surface());
			System.out.println("Le centre du cercle est le point qui a pour abcsisse: "+this.centre.getAbscisse()+" et pour ordonnee: "+this.centre.getOrdonnee());
		}

}
