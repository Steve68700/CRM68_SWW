package exemple_objets_ville;

public class Ville {
		//attributs
		private String nomVille;
		private int nbHabitants;
		private String nomPays;
		
		//constructeur par defaut
		public Ville()
		{
			System.out.println("Creation d'un objet ville avec le constructeur par defaut");
			nomVille = "inconnu";
			nomPays = "inconnu";
			nbHabitants = 0;
		}
		
		//construteur avec parametre
		public Ville(String pNomVille, int pNbre, String pNomPays)
		{
			System.out.println("Creation d'un ojet ville avec le constructeur avec parametre");
			nomVille = pNomVille;
			nomPays = pNomPays;
			nbHabitants = pNbre;
			
		}
		
		public String getNomVille()
		{
			return nomVille;
		}
		
		public String getNomPays()
		{
			return nomPays;
		}
		
		public int getNbHabitants()
		{
			return nbHabitants;
		}
		
		public void setNomVille(String pNomVille)
		{
			nomVille = pNomVille;
		}
		
		public void setNomPays(String pNomPays)
		{
			nomPays = pNomPays;
		}
		
		public void setNbHabitants(int pNbHabitants)
		{
			nbHabitants = pNbHabitants;
		}
		
}
