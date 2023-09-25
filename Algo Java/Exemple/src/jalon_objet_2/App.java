package jalon_objet_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
			
			/*Article article1 = new Article();
			Article article2 = new Article("PS5", "Playstation 5", 320, 20);
			Article article3 = new Article("Xbox", "Xbox serie", 250, 20);
			
			article1.calculerPrixTtc();
			article1.afficherArticle();
			article2.calculerPrixTtc();
			article2.afficherArticle();
			article3.calculerPrixTtc();
			article3.afficherArticle();*/
		
		Scanner sc = new Scanner(System.in);
		
		Article article1 = new Article();
		Article article2 = new Article("12A45E","PS5",499.99);
		Article article3 = new Article("36B56D", "XBOX Serie X",399.99);
		
		double tauxTVA;
		
		System.out.println("Saisir le taux de TVA pour tout les articles :");
		tauxTVA = sc.nextDouble();
		
		Article.setTauxTVA(tauxTVA);
		
		System.out.println(article1.afficherArticle());
		System.out.println(article2.afficherArticle());
		System.out.println(article3.afficherArticle());

		sc.close();

	}

}
