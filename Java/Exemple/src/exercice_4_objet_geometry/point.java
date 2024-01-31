package exercice_4_objet_geometry;

public class point {
	
	//attributs
	double abscisse;
	double ordonnee;
	
	//constructeur avec parametres
	public point(double _abscisse, double _ordonnee)
	{
		this.abscisse = _abscisse;
		this.ordonnee = _ordonnee;
	}
	
	//getter qui retourne l'abscisse du point
	public double getAbscisse()
	{
		return this.abscisse;
	}
	
	//getter qui retourne l'ordonnee du point
	public double getOrdonnee()
	{
		return this.ordonnee;
	}
	
	

}
