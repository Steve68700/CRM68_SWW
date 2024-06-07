using ClassPoint;

namespace AppPoint
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
        

            Point pointA = new Point();
            pointA.Deplacer(3, 2);
            Point pointB = pointA.SymetrieAbscisse();
            
            Point pointC = pointA.SymetrieOrigine();
            Console.WriteLine("test");

            Console.WriteLine(pointA);
            Console.WriteLine(pointB);
            Console.WriteLine(pointC);
        }
    }
}