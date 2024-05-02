using ClassLibraryBouteille;

namespace TestBouteille
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestOuvrirSiFermer()
        {
            //arrange
            Bouteille bouteille = new Bouteille();

            //act
            bool peutEtreOuverte = bouteille.Ouvrir();

            //assert
            Assert.IsTrue(peutEtreOuverte);
        }

        [TestMethod]
        public void TestViderTout()
        {
            //arrange
            Bouteille bouteille = new Bouteille();
            //bouteille.Ouvrir();

            //act
            bool peutEtreViderEntierement = bouteille.ViderTout();

            //assert
            //Assert.IsTrue(peutEtreViderEntierement);
            Assert.IsFalse(peutEtreViderEntierement);
        }
    }

}