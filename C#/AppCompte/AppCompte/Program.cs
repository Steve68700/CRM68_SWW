using ClassCompteBancaire;
using System.Runtime.CompilerServices;

namespace AppCompte
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Compte compte1 = new Compte(125521, "Gigi",1000, -500);
            Console.WriteLine(compte1);
            // Console.WriteLine("Le compte numero " +  compte1.Numero + " de " + compte1.Nom + " possede un solde actuel de " + compte1.Solde + " euros");
            compte1.Crediter(-100);
            Console.WriteLine("Le nouveau solde apres la transaction est de " + compte1.Solde + " euros");
            Console.WriteLine(compte1);
            // Console.WriteLine("Le compte numero " + compte1.Numero + " de " + compte1.Nom + " possede un solde actuel de " + compte1.Solde + " euros");
            compte1.Debiter(800);
            Console.WriteLine("Le nouveau solde apres la transaction est de " + compte1.Solde + " euros");
            Console.WriteLine(compte1);
        }
    }
}