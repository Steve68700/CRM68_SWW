namespace ClassCompteBancaire
{
    public class Compte
    {
        //Variables
        private int numero;
        private string nom;
        private double solde;
        private int decouvertAutorise;

        //GET et SET
        public int Numero
        {
            get { return numero; }
        }

        public double Solde
        {
            get { return solde; }
        }

        public string Nom
        {
            get { return nom; }
        }

        public int DecouvertAutorise
        {
            get { return decouvertAutorise; }
            set { decouvertAutorise = value; }
        }

        //Constructeur par defaut
        public Compte()
        {
            this.numero = 0;
            this.nom = "";
            this.solde = 0;
            this.decouvertAutorise = 0;
        }

        //Constructeur avec parametres
        public Compte(int _numero, string _nom, double _solde, int _decouvertAutorise)
        {
            this.numero = _numero;
            this.nom = _nom;
            this.solde = _solde;
            this.decouvertAutorise = _decouvertAutorise;
        }

        public void Crediter(double _montant) // Montant que l'on veut crediter sur le solde actuel
        {
            this.solde += _montant >= 0? _montant : 0;   
        }

        public bool Debiter(double _montant) // Montant que l'on veut retirer du solde actuel
        {
            if ( this.solde - _montant >= decouvertAutorise)
            {
                this.solde -= _montant >= 0? _montant : 0;
                return true;
            }
            else
            {
                return false;
            }
        }

        public override string ToString()
        {
            return "Numero : " + numero + "\n Nom : " + nom + " \n Solde : " + solde + " \n Decouvert Autorise : " + decouvertAutorise+ "\n" ; 
        }

        public bool Virement(Compte comptebeneficiaire, double _montant )
        {
            if (this.Debiter(_montant) == true)
            {
                comptebeneficiaire.Crediter(_montant);

                return true;

            }
            else
            {
                return false;
            }
        }

    }
}