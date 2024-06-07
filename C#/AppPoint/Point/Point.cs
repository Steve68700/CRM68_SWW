namespace ClassPoint
{
    public class Point
    {
        //Variables
        float x;
        float y;

        //Constructeur par defaut
        public Point()
        {
            this.x = 0;
            this.y = 0;
        }

        //Constructeur par clonage
        public Point(Point _point) : this(_point.x, _point.y)
        {
        }

        //Constructeur avec parametres
        public Point(float _x, float _y)
        {
            this.y= _y;
            this.x = _x;
        }

        //Methodes
        public void Deplacer(float _nouveauX, float _nouveauY)
        {
            this.x = _nouveauX;
            this.y = _nouveauY;
        }

        public void Permuter()
        {
            (this.x, this.y) = (this.y, this.x);
        }

        /*public void Permuter()
        {
            float temp = this.x;
            this.x = this.y;
            this.y = temp;
        }*/

        public Point SymetrieAbscisse()
        {
            return new Point(this.x * -1, this.y);
        }

        public Point SymetrieOrdonnee()
        {
            return new Point(this.x, this.y * -1);
        }

        /*public Point SymetrieOrigine()
        {
            return new Point(-this.x, -this.y);
        }*/

        public Point SymetrieOrigine()
        {
            return this.SymetrieAbscisse().SymetrieOrdonnee();
        }

        public override string ToString()
        {
            return "Les coordonees du point sont " + x + " et " + y;
        }
    }
}