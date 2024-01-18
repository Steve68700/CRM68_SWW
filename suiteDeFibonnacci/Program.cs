namespace suiteDeFibonnacci
{
    internal class Program
    {
        static string SuiteFibonacci(int n)
        {

            //Declaration des variables
            int position;
            string resultat;
            long nbPrecedent;
            long nbSuivant;
            long nbCourant;

            position = 2;
            resultat = "\n0\n1";
            nbPrecedent = 0;
            nbCourant = 1;

            if (n > 2)
            {
                while (position < n)
                {
                    nbSuivant = nbPrecedent + nbCourant;
                    resultat += "\n" + nbSuivant;
                    nbPrecedent = nbCourant;
                    nbCourant = nbSuivant;
                    position++;
                }
            }
            else
            {
                n = 2;
            }
            return "Les " +
                n +
                " premiers nombres de la suite de Fibonacci sont: "
                + resultat;
        }

        static void Main(string[] args)
        {
            Console.WriteLine("Combien de nombre de la suite souhaitez vous afficher ?");
            int n;
            string saisie = Console.ReadLine();
            int.TryParse(saisie, out n);
            String test = SuiteFibonacci(n);
            Console.WriteLine(test);
        }
    }

    
   


}