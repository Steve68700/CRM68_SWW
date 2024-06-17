function calculPanier() {
   const qte1 = document.querySelector('#quantite1').value
// console.log(qte1)
const pu1 = document.querySelector('#prixUnitaire1').value
// console.log(pu1)
const qte2 = document.querySelector('#quantite2').value

const pu2 = document.querySelector('#prixUnitaire2').value

   let ca1 = Number(qte1) * Number(pu1);
   let ca2 = Number(qte2) * Number(pu2);
   let total = ca1 + ca2;

   document.getElementById('CA1').value = ca1;
   document.getElementById('CA2').value = ca2;
   document.getElementById('total').value = total;
}

calculPanier();

document.querySelectorAll('.saisie').forEach(element =>{ element.addEventListener("blur", function(){ 
 if(isNaN(element.value))
   {

   console.log("ce n'est un nombre");
   element.value="";
   element.focus();
   }
 else
   {
      calculPanier();
   }
})}) 
