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
			if(!this.estOuverte && !this.estDansUnePoupee)//pour s'ouvrir une poupee doit etre ferme et pas deja dans une autre poupee
			{
				System.out.println(this.nom+" est ouverte");
				this.estOuverte = true;
				return true;
			}
			else if(this.estOuverte)
			{
				System.out.println(this.nom+" est deja ouverte");
				return false;
			}
			else
			{
				System.out.println(this.nom+" ne peut pas s'ouvrir car elle est deja dans une autre poupee");
				return false;
			}
		}
		
		public boolean fermer()
		{
			if(this.estOuverte && !this.estDansUnePoupee)//pour se fermer une poupee doit etre ouverte et pas deja etre dans une autre poupee
			{
				System.out.println(this.nom+" est ferme");
				this.estOuverte = false;
				return true;
			}
			else if(!this.estOuverte)
			{
				System.out.println(this.nom+" est deja ferme");
				return false;
			}
			else
			{
				System.out.println(this.nom+" ne peut pas se fermer car elle est deja dans une autre poupee");
				return false;
			}
		}
		
		public boolean placerDans(PoupeeRusse autre)
		{
			if(!this.estOuverte && this.taille < autre.taille && !autre.contientUnePoupee && !autre.estDansUnePoupee && autre.estOuverte)//pour etre place dans une poupee, celle-ci doit etre ferme et plus petite que l'autre et l'autre doit etre vide et ouverte
			{
				System.out.println(this.nom+" est dans "+autre.nom);
				this.estDansUnePoupee = true;
				autre.contientUnePoupee = true;
				return  true;
			}
			else if(this.estOuverte)
			{
				System.out.println(this.nom+" est ouverte et ne peut donc pas etre place dans "+autre.nom);
				return false;
			}
			else if(this.taille > autre.taille)
			{
				System.out.println(this.nom+" est trop grande et ne peut donc pas etre place dans "+autre.nom);
				return false;
			}
			else if(autre.contientUnePoupee)
			{
				System.out.println(autre.nom+" contient deja une poupee");
				return false;
			}
			else if(autre.estDansUnePoupee)
			{
				System.out.println(autre.nom+" est deja dans une autre poupee et ne peut donc pas s'ouvrir ou accueillir "+this.nom);
				return false;
			}
			else
			{
				System.out.println(autre.nom+" est ferme, il faut d'abord l'ouvrir");
				return false;
			}
			
		}
		
		public boolean sortirDe(PoupeeRusse autre)
		{
			if(!this.estOuverte && autre.contientUnePoupee && autre.estOuverte && !autre.estDansUnePoupee)
			{
				System.out.println(this.nom+" est sortie de "+autre.nom);
				this.estDansUnePoupee = false;
				autre.contientUnePoupee = false;
				return true;
			}
			else if(this.estOuverte)
			{
				System.out.println(this.nom+" doit etre ferme pour sortir de "+autre.nom);
				return false;
			}
			else if(!autre.contientUnePoupee)
			{
				System.out.println(autre.nom+" ne contient pas "+this.nom);
				return false;
			}
			else if(!autre.estOuverte)
			{
				System.out.println(autre.nom+" doit etre ouverte");
				return false;
			}
			else
			{
				System.out.println(autre.nom+" est deja dans une autre poupee");
				return false;
			}
		}
		
}
