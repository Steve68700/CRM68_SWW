using ClassCompteBancaire;
using System.Runtime.CompilerServices;

namespace AppCompte
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Compte compte1 = new Compte(125521, "Gigi", 1000, -500); // Creation du compte1
            Console.WriteLine(compte1); // Affichage du compte1

            compte1.Crediter(-100); // Crediter le compte1 de -100 qui n'est pas posible
            Console.WriteLine(compte1); // Affichage compte1
            Console.WriteLine("Le solde du compte apres la transaction est de " + compte1.Solde + " euros");

            compte1.Debiter(800); // Debiter de 800
            Console.WriteLine(compte1); // Affichage compte1
            Console.WriteLine("Le solde apres la transaction est de " + compte1.Solde + " euros");

            Compte compte2 = new Compte(138866, "Gigi", 1000, -500); //Creation du compte2
            Console.WriteLine(compte2); // Affichage compte2

            Console.WriteLine(compte1.Virement(compte2, 200)); //Virement de 800 entre compte1 et compte2
            Console.WriteLine(compte1); // Affichage compte1
            Console.WriteLine("Le solde apres la transaction est de " + compte1.Solde + " euros");
            Console.WriteLine(compte2); // Affichage compte2
            Console.WriteLine("Le solde apres la transaction est de " + compte2.Solde + " euros");
        }
    }
}