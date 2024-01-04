namespace LaFourchette
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Declaration des variables
            string saisie;
            int nombreMystere;
            int nombreJoueur;
            int compteur = 1;
            bool win = false;

            //debut du programme
            Random random = new Random();
            nombreMystere = random.Next(0, 101);
            do
            {
                Console.WriteLine("Devinez le nombre mystere entre 1 et 100:");
                saisie = Console.ReadLine();
                nombreJoueur = int.Parse(saisie);
                if(nombreJoueur == nombreMystere){
                    win = true;
                }
                else if(nombreJoueur < nombreMystere)
                {
                    Console.WriteLine("Le nombre est plus grand");
                }
                else
                {
                    Console.WriteLine("Le nombre est plus petit");
                }
                compteur++;
            }
            while (!win);
            Console.WriteLine("Bravo, vous avez trouve le nombre mystere en "+compteur+" tours");
            

        }
    }
}