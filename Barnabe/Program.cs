namespace Barnabe
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Declaration des variables
            double somme;
            double reste;
            int nombreMagasin = 0;
            string saisie;
            //Debut du programme
            Console.WriteLine("Quel est la somme de départ de Barnabe:");
            saisie = Console.ReadLine();
            somme = double.Parse(saisie);
            if(somme > 2 )
            {
                do
                {
                    somme = somme - (somme / 2 + 1);
                    nombreMagasin++;
                }
                while(somme > 0 && somme >= 1);
                Console.WriteLine("Barnabe a fait "+nombreMagasin+" magasin(s).");
            }
            else
            {
                Console.WriteLine("Barnabe n'a pas assez d'argent pour faire au moins un magasin...");
            }
            


        }

    }
}