package jalon_objet_2;

public class App {

	public static void main(String[] args) {
			
			Article article1 = new Article();
			Article article2 = new Article("PS5", "Playstation 5", 320, 20);
			Article article3 = new Article("Xbox", "Xbox serie", 250, 20);
			
			article1.calculerPrixTtc();
			article1.afficherArticle();
			article2.calculerPrixTtc();
			article2.afficherArticle();
			article3.calculerPrixTtc();
			article3.afficherArticle();

	}

}
