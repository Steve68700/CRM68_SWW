package jalon_objet_2bis;

public class Domino {
	
		private int faceA;
		private int faceB;
		
		public Domino()
		{
			this.faceA = 0;
			this.faceB = 0;
		}
		
		public Domino(int _faceA, int _faceB)
		{
			this.faceA = _faceA;
			this.faceB = _faceB;
		}
		
		public String affichePoint()
		{
			return "Point face A: " +this.faceA
							+"\nPoint face B: " +this.faceB;
		}
		
		public int valeur()
		{
			return this.faceA + this.faceB;
		}
		 public boolean peutEtrePoser(Domino domino)
		 {
			 if(this.faceA == domino.faceA
						|| this.faceB == domino.faceB
						|| this.faceA == domino.faceB
						|| this.faceB == domino.faceA)
						{
							return true;
						}
						else
						{
							return false;
						}
		 }
	}
