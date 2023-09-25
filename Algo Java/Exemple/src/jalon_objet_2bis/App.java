package jalon_objet_2bis;

public class App {

	public static void main(String[] args) {
			
		Domino domino1 = new Domino();
		Domino domino2 = new Domino(2,6);
		Domino domino3 = new Domino(6,6);
		
		System.out.println(domino1.affichePoint()+"\n"+domino1.valeur()
		+"\n"+domino1.peutEtrePoser(domino2));
		System.out.println(domino2.affichePoint()+"\n"+domino2.valeur()
		+"\n"+domino2.peutEtrePoser(domino3));
		System.out.println(domino3.affichePoint()+"\n"+domino3.valeur()
		+"\n"+domino3.peutEtrePoser(domino1));

	}

}
