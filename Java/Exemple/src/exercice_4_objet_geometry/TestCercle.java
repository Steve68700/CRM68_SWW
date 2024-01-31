package exercice_4_objet_geometry;

public class TestCercle {
	
	public static void main(String[] args) {
		
			/*
			on cree un objet point pour le centre du cercle
			avec pour abscisse 4 et pourr ordonnee 0
			*/
			point centre = new point(4.0,0.0);
			/*
			on cree un objet cercle avec pour centre le point cree precedement
			et pour rayon 4
			*/
			
			cercle monCercle = new cercle(centre, 4.0);
			/*
			on cree un objet point
			avec pour abscisse 0 et pour ordonnee 0
			*/
			
			point monPoint = new point(0.0, 0.0);
			//on affiche les information du cercle
			monCercle.afficher();
			//on teste si le point monPoint appartient au cercle moncercle
			monCercle.testAppartenance(monPoint);
	}

}
