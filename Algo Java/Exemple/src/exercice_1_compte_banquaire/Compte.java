package exercice_1_compte_banquaire;

public class Compte {
	
		//attribut
		public double solde;
		
		//constructeur avec parametre
		public Compte(double _solde)
		{
			solde = _solde;
		}
		
		public void deposer(double versements)
		{
			solde = solde + versements;
		}
		
		public void retirer(double retraits)
		{
			solde = solde - retraits;
		}
		
		public void afficher()
		{
			System.out.println(solde);
		}
		

}
