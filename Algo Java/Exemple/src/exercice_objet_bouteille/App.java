package exercice_objet_bouteille;

public class App {

	public static void main(String[] args) {
			
			bouteille cristaline = new bouteille("cristaline",1.25,1.5, true);
			
			//cristaline.ouvrirProcedure();
			boolean test1 = cristaline.fermer();
			boolean test2 = cristaline.ouvrir();
			//boolean test3 = cristaline.fermer();
			//boolean test4 = cristaline.viderEntierement();
			//boolean test5 = cristaline.remplirEntierement();	
			//boolean test6 = cristaline.completerEnL();
			//boolean test7 = cristaline.remplir(0.5);
			boolean test8 = cristaline.vider(0.25);
			//boolean test9 = cristaline.vider(1.5);
			//boolean test10 = cristaline.remplir(1);
			//boolean test11 = cristaline.remplir(1.5);
			boolean test12 = cristaline.vider(0.5);
	}

	
	

}
