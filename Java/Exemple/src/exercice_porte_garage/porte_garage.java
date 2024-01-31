package exercice_porte_garage;

public class porte_garage {

		//attribut
		private final String marque;
		private boolean estOuverte;
		private boolean estVerouiller;
		private int degresOuverture;
		private final int degresMax;
		private  final int degresMin;
		
		//constructeur par defaut
		public porte_garage()
		{
			marque = " ";
			estOuverte = false;
			estVerouiller = true;
			degresOuverture = 0;
			degresMax = 100;
			degresMin = 0;
		}
		
		//constructeur avec parametre
		public porte_garage(String _marque, boolean _estOuverte, boolean _estVerouiller, int _degresOuverture, int _degresMax, int _degresMin)
		{
			this.marque =_marque;
			this.estOuverte = _estOuverte;
			this.estVerouiller = _estVerouiller;
			this.degresOuverture = _degresOuverture;
			this.degresMax = _degresMax;
			this.degresMin = _degresMin;
		}
		
		public boolean deverouiller()
		{
			if(!this.estOuverte)
			{
				if(this.estVerouiller)
				{
					this.estVerouiller = false;
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		
		public boolean ouvrir()
		{
			if(!this.estVerouiller)//(!this.estVerouiller && !this.estOuverte)
			{
				if(this.degresOuverture < this.degresMax)
				{
					this.degresOuverture = this.degresMax;
					this.estOuverte = true;
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		
		public boolean fermer()
		{
			if(this.estOuverte)
			{
				if(this.degresOuverture > this.degresMin)
				{
					this.degresOuverture = this.degresMin;
					this.estOuverte = false;
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		
		public boolean verouiller()
		{
			if(!this.estOuverte)
			{
				if(!this.estVerouiller)
				{
					this.estVerouiller = true;
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		
		public boolean ouvrirPartiellement(int degresOuvrable)
		{
			if(!this.estVerouiller)
			{
				if(degresOuvrable > this.degresMin && degresOuvrable <= this.degresMax)
				{
					this.degresOuverture = degresOuvrable;
					this.estOuverte = true;
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		
		public boolean fermerPartielement(int degresFermable)
		{
			if(this.estOuverte)
			{
				if(degresFermable < this.degresMax && degresFermable > this.degresMin)
				{
					this.degresOuverture -= degresFermable;
					if(this.degresOuverture == 0)
					{
						this.estOuverte = false;
					}
					return true;
				}
				else
				{
					return false;
				}
				
			}
			else
			{
				return false;
			}
		}
}
