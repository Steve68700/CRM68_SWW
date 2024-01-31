using System.ComponentModel.Design;
using System.Formats.Asn1;

namespace AdditionTest
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*
            //Ex. ADDITION
            
            //Declaration des variables
            int nombre1;
            int nombre2;
            int resultat;
            string saisie;

            //Debut du programme
            Console.WriteLine("Saisir le 1er nombre");
            saisie = Console.ReadLine();
            nombre1 = int.Parse(saisie);
            
            Console.WriteLine("Saisir le 2e nombre");
            saisie = Console.ReadLine();
            nombre2 = int.Parse(saisie);
            resultat = nombre1 + nombre2;

            Console.WriteLine("le resultat de " + nombre1 + " plus " + nombre2 + " est egal " + resultat);
            //Fin du programme


            //1.1 MOYENNE
            
            //Declaration des variables
            double nombre1;
            double nombre2;
            double resultat;
            string saisie;

            //Debut du programme
            Console.WriteLine("Saisir le 1er nombre");
            saisie = Console.ReadLine();
            nombre1 = double.Parse(saisie);

            Console.WriteLine("Saisir le 2e nombre");
            saisie = Console.ReadLine();
            nombre2 = double.Parse(saisie);
            resultat = (nombre1 + nombre2) /2;
            Console.WriteLine("La moyenne des deux nombre est: " + resultat);
            //Fin du programme
            

            //1.2 AIRE D'UNE SHERE

            //Declaration des variables
            double rayon;
            double resultat;
            string saisie;

            //Debut du programme
            Console.WriteLine("Saisir la valeur du rayon");
            saisie = Console.ReadLine();
            rayon = double.Parse(saisie);
            resultat = 4 * Math.PI * Math.Pow(rayon,2);
            resultat = Math.Round(resultat * 100) /100;
            Console.WriteLine("L'aire de la sphere est " + resultat);
            //Fin du programme

            
            //1.2 VOLUME D'UNE SPHERE
            
            //Declaration des variables
            double rayon;
            double resultat;
            string saisie;
            
            //Debut du programe
            Console.WriteLine("Saisir la valeur du rayon");
            saisie = Console.ReadLine();
            rayon = double.Parse(saisie);
            resultat = 4.0/3.0 * Math.PI * Math.Pow(rayon,3);
            resultat = Math.Round(resultat * 100) / 100;
            Console.WriteLine("Le volume de la sphere est : " + resultat);
            //Fin du programme
            

            //1.3 SURFACE SECTEUR CIRCULAIRE

            //Declaration des variables
            double rayon;
            double angle;
            double resultat;
            string saisie;

            //Debut du programme
            Console.WriteLine("Saisir le rayon du cercle:");
            saisie = Console.ReadLine();
            rayon = double.Parse(saisie);
            Console.WriteLine("Saisir les degres de l'angle:");
            saisie = Console.ReadLine();
            angle = double.Parse(saisie);
            resultat = Math.PI * Math.Pow(rayon, 2) * angle / 360;
            resultat = Math.Round(resultat * 100) / 100;
            Console.WriteLine("La surface du secteur circulaire est de " + resultat);
            //Fin du programme

            
            //1.4 CALCUL D'INTERET
            
            //Declaration des variables
            double sommePlace;
            double interetOffert;
            double interetSimple;
            double interetCompose;
            int annees;
            string saisie;

            //Debut du programme
            Console.WriteLine("Saisissez la somme place:");
            saisie = Console.ReadLine();
            sommePlace = double.Parse(saisie);
            Console.WriteLine("Saisissez le taux d'interet offert par la banque:");
            saisie = Console.ReadLine();
            interetOffert = double.Parse(saisie);
            interetOffert = interetOffert / 100;
            Console.WriteLine("Saisissez le nombre d'annees de placement:");
            saisie = Console.ReadLine();
            annees = int.Parse(saisie);
            interetSimple = sommePlace * (annees * interetOffert);
            //interetSimple = Math.Round(interetSimple * 100) / 100;
            interetCompose = (sommePlace * (Math.Pow(interetOffert, annees))) + interetSimple;
            Console.WriteLine("Les interets simple sont de : "+interetSimple+ " et les interets composees sont de : "+interetCompose);
            //Fin du programme

            
            //2.1COMPARAISON DE NOMBRES

            //Declaration des variables
            int age;
            string saisie;

            //Debut du programme
            Console.WriteLine("Saisissez votre age:");
            saisie = Console.ReadLine();
            age = int.Parse(saisie);
            if(age >= 18)
            {
                Console.WriteLine("Vous etes majeur");
            }
            else if(age <= 0)
            {
                Console.WriteLine("Vous n'etes pas encore de ce monde...");
            }
            else
            {
                Console.WriteLine("Vous etes mineur");
            }
            //Fin du programme

            
            //2.2 TRI DE NOMBRES
            
            //Declaration des variables
            int nombreA;
            int nombreB;
            string saisie;
            //Debut du programme
            Console.WriteLine("Saisissez un nombre entier:");
            saisie = Console.ReadLine();
            nombreA = int.Parse(saisie);
            Console.WriteLine("Saisissez un deuxieme nombre entier different:");
            saisie = Console.ReadLine();
            nombreB = int.Parse(saisie);
            if(nombreA < nombreB)
            {
                Console.WriteLine("Les nombres dans l'ordre croissant sont : " + nombreA + " , " + nombreB);
            }
            else
            {
                Console.WriteLine("Les nombres dans l'ordre croissant sont : " + nombreB +" , "+ nombreA);
            }
            //Fin du programme

            //TRI DES NOMBRES++
            
            //Declaration des variables
            double nombreA;
            double nombreB;
            double nombreC;
            string saisie;
            //Debut du programme
            Console.WriteLine("Saisissez le premier nomnbre:");
            saisie = Console.ReadLine();
            nombreA = double.Parse(saisie);
            Console.WriteLine("Saisissez le deuxieme nomnbre:");
            saisie = Console.ReadLine();
            nombreB = double.Parse(saisie);
            Console.WriteLine("Saisissez le troisieme nomnbre:");
            saisie = Console.ReadLine();
            nombreC = double.Parse(saisie);
            if(nombreC < nombreA && nombreC < nombreB)
            {
                if(nombreA > nombreB)
                {
                    Console.WriteLine("Les nombres dans l'ordre croissant sont: "+nombreC+" < "+nombreB+" < "+nombreA);
                }
                else
                {
                    Console.WriteLine("Les nombres dans l'ordre croissant sont: "+nombreC+" < "+nombreA+" < "+nombreB);
                }
            }
            if (nombreB < nombreA && nombreB < nombreC)
            {
                if (nombreA > nombreC)
                {
                    Console.WriteLine("Les nombres dans l'ordre croissant sont: "+nombreB+" < "+nombreC+" < "+nombreA);
                }
                else
                {
                    Console.WriteLine("Les nombres dans l'ordre croissant sont: "+nombreB+" < "+nombreA+" < "+nombreC);
                }
            }
            if (nombreA < nombreB && nombreA < nombreC)
            {
                if (nombreB > nombreC)
                {
                    Console.WriteLine("Les nombres dans l'ordre croissant sont: "+nombreA+" < "+nombreC+" < "+ nombreB);
                }
                else
                {
                    Console.WriteLine("Les nombres dans l'ordre croissant sont: "+nombreA+" < "+nombreB+" < "+nombreC);

                }
            }
            //Fin du programme*/

        }
    }
}