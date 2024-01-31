namespace evaluationRapide
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Variables

            double[]numbers  = { 2, 4, 1, 8, 6, 14, 23, 25, 7, 42 };
            double temp = 0;
            double moyenne = 0;

            //Traitement

            for(int i = 0; i <= numbers.Length - 1; i++)
            {
                if (numbers[i] > temp)
                {
                    temp = numbers[i];
                }
                moyenne = moyenne + numbers[i] / numbers.Length;
            }

            Console.WriteLine("La plus grande valeur du tableau vaut: " + Math.Pow(temp, 2));
            Console.WriteLine("La moyenne du tableau vaut: " + moyenne);
        }
    }
}