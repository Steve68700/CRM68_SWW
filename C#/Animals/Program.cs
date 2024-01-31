using System.Runtime.CompilerServices;

namespace Animals
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            Animal dog = new Animal("dog");
            dog.Eat();
        }

        
    }
}