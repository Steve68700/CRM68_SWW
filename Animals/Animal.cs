using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace Animals
{
    public class Animal
    {
        private string species;

        public string Spacies
        {
            get {return this.species;}
            set { this.Spacies = value; }
        }

        public Animal(string _species)
        {
            this.species = _species;
        }
        public void Eat()
        {
            Console.WriteLine(this.species+" mange.");
        }

        public void Move()
        {
            Console.WriteLine(this.species + " se deplace.");
        }
    }
}
