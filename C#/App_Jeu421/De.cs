using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace App_Jeu421
{
    public class De : IComparable<De>
    {
        //Variables
        private readonly int nbrFacesDe;
        private int valeurDe;

        //Get
        public int ValeurDe
        { 
            get { return valeurDe; } 
        }

        public int NbrFacesDe
        { 
            get { return nbrFacesDe; } 
        }

        //Constructeur avec parametres
        public De( int _nbrFacesDe) 
        { 
            this.nbrFacesDe = _nbrFacesDe;
            this.valeurDe = Alea.Instance().Nouveau(1, _nbrFacesDe);
        }

        public De(): this (6)
        {
        }

        public int CompareTo(De? other)
        {
            throw new NotImplementedException();
        }
    }
    


}
