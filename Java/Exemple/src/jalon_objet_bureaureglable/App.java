package jalon_objet_bureaureglable;

public class App {

	public static void main(String[] args) {
			
			BureauReglable bureau1 = new BureauReglable(100, 170, 120, false, false);
			BureauReglable bureau2 = new BureauReglable(80, 120, 120, true, false);
			
			boolean test1 = bureau1.monter(30);
			boolean test2 = bureau1.decendre(50);
			boolean test3 = bureau1.decendre(10);
			boolean test4 = bureau2.monter(20);
			boolean test5 = bureau2.decendre(40);
		
	}

}
