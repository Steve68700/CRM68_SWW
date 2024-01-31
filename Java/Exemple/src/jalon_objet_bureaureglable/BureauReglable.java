package jalon_objet_bureaureglable;

public class BureauReglable {
		private final int hauteurMin;
		private final int hauteurMax;
		private int hauteurCourante;
		private boolean estHauteurMax;
		private boolean estHauteurMin;
		
		public BureauReglable(int _hauteurMin, int _hauteurMax, int _hauteurCourante, boolean _estHauteurMax, boolean _estHauteurMin)
		{
			this.hauteurMin = _hauteurMin;
			this.hauteurMax = _hauteurMax;
			this.hauteurCourante = _hauteurCourante;
			this.estHauteurMax = _estHauteurMax;
			this.estHauteurMin = _estHauteurMin;
		}
		
		public boolean monter(int hauteur)
		{
			if(this.hauteurCourante + hauteur <= this.hauteurMax)
			{
				this.hauteurCourante = this.hauteurCourante + hauteur;
				if(this.hauteurCourante == this.hauteurMax)
				{
					this.estHauteurMax = true;
				}
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public boolean decendre(int hauteur)
		{
			if(this.hauteurCourante - hauteur >= this.hauteurMin)
			{
				this.hauteurCourante = this.hauteurCourante - hauteur;
				if(this.hauteurCourante == this.hauteurMin)
				{
					this.estHauteurMin = true;
				}
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
}
		
			
