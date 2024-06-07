using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace App_Jeu421
{
    internal class Alea : Random
    {
        private static Alea monAlea = null;
        private Alea()
        {
        }
        public static Alea Instance()
        {
            if (monAlea == null)
            {
                monAlea = new Alea();
            }
            return monAlea;
        }
        public int Nouveau(int _valMin, int _valMax)
        {
            return base.Next(_valMin, _valMax + 1);
        }
    }
}
