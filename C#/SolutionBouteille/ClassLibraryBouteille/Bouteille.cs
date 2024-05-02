using System.ComponentModel.Design;

namespace ClassLibraryBouteille
{
    public class Bouteille
    {
        //Attributs
        private double capaciteMaxEnMl;
        private bool estOuverte;
        private double quantiteLiquideEnMl;
        //private DateTime dateDePeremption;

        //SET/GET
        public double CapaciteMaxEnMl { get => capaciteMaxEnMl; set => capaciteMaxEnMl = value; }
        public bool EstOuverte { get => estOuverte; set => estOuverte = value; }
        public double QuantiteLiquideEnMl { get => quantiteLiquideEnMl; set => quantiteLiquideEnMl = value; }

        



        //Constructeurs par defaut
        public Bouteille()
        {
            this.capaciteMaxEnMl = 1000;
            this.estOuverte = false;
            this.quantiteLiquideEnMl = 1000;
        }

        //Constructeur avec semi-parametre
        public Bouteille(double _capaciteMaxEnMl)
        {
            this.capaciteMaxEnMl = _capaciteMaxEnMl;
            this.estOuverte = false;
            this.quantiteLiquideEnMl = _capaciteMaxEnMl;
        }

        /*Constructeur avec parametre
        public Bouteille(double _capaciteMaxEnMl, bool _estOuverte, double _quantiteLiquideEnMl) /*DateTime _dateDePeremption)
        {
            this.capaciteMaxEnMl = _capaciteMaxEnMl;
            this.estOuverte = _estOuverte;
            this.quantiteLiquideEnMl = _quantiteLiquideEnMl;
            this.dateDePeremption = _dateDePeremption;
        }*/

        //Methodes
        public bool Ouvrir()
        {
            if(!this.estOuverte)
            {
                this.estOuverte=true;
                return true;
            }
            else
            {
                return false;
            }     
        }

        public bool Fermer()
        {
            if(this.estOuverte)
            {
                this.estOuverte = false;
                return true;
            }
            else
            {
                return false;
            }
        }
        
        public bool ViderTout()
        {
            if(this.estOuverte && this.quantiteLiquideEnMl > 0)
            {
                this.quantiteLiquideEnMl = 0;
                return true;
            }
            else
            {
                return false;
            }
        }

        public bool RemplirTout()
        {
            if(this.estOuverte && this.quantiteLiquideEnMl < this.capaciteMaxEnMl)
            {
                this.quantiteLiquideEnMl = this.capaciteMaxEnMl;
                return true;
            }
            else
            {
                return false;
            }
        }

        public bool Remplir(double _quantiteLiquideEnMl) //_quantiteLiquideEnMl c'est ce qu'on ajoute dans la bouteille
        {
            if(this.estOuverte && this.quantiteLiquideEnMl < this.capaciteMaxEnMl)
            {
                if(this.quantiteLiquideEnMl + _quantiteLiquideEnMl > this.capaciteMaxEnMl)
                {
                    this.quantiteLiquideEnMl = this.capaciteMaxEnMl;
                }
                else
                {
                    this.quantiteLiquideEnMl += _quantiteLiquideEnMl;
                }
                return true;
            }
            else
            {
                return false;
            }
        }

        public bool Vider(double _quantiteLiquideEnMl) // _quantiteLiquideEnMl c'est ce qu'on retire de la bouteille
        {
            if(this.estOuverte && this.quantiteLiquideEnMl> 0)
            {
                if(this.quantiteLiquideEnMl - _quantiteLiquideEnMl <= 0)
                {
                    this.quantiteLiquideEnMl = 0;
                }
                else
                {
                    this.quantiteLiquideEnMl -= _quantiteLiquideEnMl;
                }
                return true;
            }
            else
            {
                return false;
            }
        }

    }
}