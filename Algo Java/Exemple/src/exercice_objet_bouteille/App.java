package exercice_objet_bouteille;

public class App {

	public static void main(String[] args) {
			
			bouteille cristaline = new bouteille("cristaline",1.25,1.5, true);
			
			//cristaline.ouvrirProcedure();
			boolean test1 = cristaline.fermer();
			boolean test2 = cristaline.ouvrir();
			//boolean test3 = cristaline.fermer();
			boolean test4 = cristaline.viderEntierement();
			//boolean test5 = cristaline.remplirEntierement();	
			boolean test6 = cristaline.completerEnL();
	}
	
	

}
