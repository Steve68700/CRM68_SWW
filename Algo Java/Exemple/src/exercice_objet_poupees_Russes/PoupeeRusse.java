package exercice_objet_poupees_Russes;

public class PoupeeRusse {
	
		//Attributs
		private String nom;
		private int taille;
		private boolean estOuverte;
		private boolean estDansUnePoupee;
		private boolean contientUnePoupee;
		
		//Constructeur par defaut
		public PoupeeRusse()
		{
			nom = "Inconnu";
			taille = 0;
			estOuverte = false;
			estDansUnePoupee = false;
			contientUnePoupee = false;
		}
		
		//Constructeur avec parametres
		public PoupeeRusse(String _nom, int _taille, boolean _estOuverte, boolean _estDansUnePoupee, boolean _contientUnePoupee)
		{
			this.nom = _nom;
			this.taille = _taille;
			this.estOuverte = _estOuverte;
			this.estDansUnePoupee = _estDansUnePoupee;
			this.contientUnePoupee = _contientUnePoupee;
		}
		
		//Methode
		public boolean ouvrir()
		{
			if(!this.estOuverte && !this.estDansUnePoupee)//pour s'ouvrir la poupee doit etre ferme et ne doit pas deja etre dans une autre poupee
			{
				System.out.println(this.nom+" est ouverte");
				return this.estOuverte = true;
			}
			else
			{
				System.out.println(this.nom+" est deja ouverte ou est deja dans une autre poupee");
				return false;
			}
		}
		
		public boolean fermer()
		{
			if(this.estOuverte && !this.estDansUnePoupee)//pour se fermer la poupee doit etre ouverte et ne doit pas deja etre dans une autre poupee
			{
				System.out.println(this.nom+" est ferme");
				return this.estOuverte = false;
			}
			else
			{
				System.out.println(this.nom+" est deja ferme ou est deja dans une autre poupee");
				return true;
			}
		}
		
		public boolean placerDans(PoupeeRusse autre)
		{
			if(!this.estOuverte && !autre.contientUnePoupee && this.taille < autre.taille && autre.estOuverte)//pour etre place dans une poupee, cette poupee doit etre ferm
			{
				System.out.println(this.nom+" est dans "+autre.nom);
				this.estDansUnePoupee = true;
				autre.contientUnePoupee = true;
				return  true;
			}
			else
			{
				System.out.println(this.nom+" ne peut pas etre dans "+autre.nom+" car\n Soit " +this.nom+" est ouverte et/ou trop grande\n Soit "+autre.nom+" est ferme et/ou trop petite et/ou contient deja une poupee");
				return false;
			}
			
		}
		
		public boolean sortirDe(PoupeeRusse autre)
		{
			if(!this.estOuverte && autre.contientUnePoupee && autre.estOuverte)
			{
				System.out.println(this.nom+" est sortie de "+autre.nom);
				this.estDansUnePoupee = false;
				autre.contientUnePoupee = false;
				return true;
			}
			else
			{
				System.out.println(this.nom+" ne peut pas sortir de "+autre.nom+" car\n Soit "+this.nom+" est ouverte\n Soit "+autre.nom+" ne contient aucune poupee et ou est ferme");
				return false;
			}
		}
		
}
