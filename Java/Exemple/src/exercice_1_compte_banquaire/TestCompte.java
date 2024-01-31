package exercice_1_compte_banquaire;

public class TestCompte {

	public static void main(String[] args) {
		
			Compte compte1 = new Compte(0);
			
			compte1.deposer(20);
			compte1.retirer(12);
			compte1.afficher();
			compte1.deposer(100);
			compte1.afficher();
	}

}
