package exercice_objet_bouteille;

public class bouteille {
		
		//attributs
		private final double capaciteEnL;
		private double contenanceEnL;
		private boolean estOuverte;
		private String nom;
		
		//constructeur par defaut
		public bouteille()
		{
			nom = " ";
			contenanceEnL = 0.9;
			capaciteEnL = 1;
			estOuverte = true;
		}
		
		//construteur avec parametre
		public bouteille(String _nom, double _contenanceEnL, double _capaciteEnL, boolean _estOuverte)
		{
			this.nom = _nom;
			this.contenanceEnL = _contenanceEnL;
			this.capaciteEnL = _capaciteEnL;
			this.estOuverte = _estOuverte;
		}
		
		public boolean ouvrir()
		{
			if(!this.estOuverte)
			{
				this.estOuverte = true;
				return true;
			}
			else
			{
				return false;
			}
			
		}
		
//		public void ouvrirProcedure() //procedure
//		{
//			if(this.estOuverte)
//			{
//				this.estOuverte = true;
//			}
//		}
		
		public boolean fermer()  //fonction
		{
			if(this.estOuverte)
			{
				this.estOuverte = false;
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public boolean viderEntierement()
		{
			if(this.estOuverte)
			{
				this.contenanceEnL = 0;
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public boolean remplirEntierement()
		{
			if(this.estOuverte)
			{
				this.contenanceEnL = this.capaciteEnL;
				return true;
			}
			else
			{
				return false;
			}
			
		}
		
		public boolean completerEnL()
		{
			if(this.contenanceEnL < this.capaciteEnL)
			{
				this.contenanceEnL = this.capaciteEnL;
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
}
