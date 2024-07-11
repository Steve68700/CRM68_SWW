let regexPrenom =/^[A-Z]{3,}$/;

function afficherPrenomAge(){
    let prenom = document.querySelector("#txtprenom").value;
    prenom= prenom.toUpperCase();
    let age = Number(document.querySelector("#txtage").value);
    let chainePrenomAge="";
  
    if(age > 0 && regexPrenom.test(prenom)==true)
    { 
        chainePrenomAge= 'Bonjour ' + prenom + ', votre âge est : ' + age;
    }

     else
    {
        chainePrenomAge="Compléter/corriger le formulaire.";
    }
    
}

function mineurMajeur(){
    let chaineMineurMajeur="";
    if(age <= 18)
    {
        chaineMineurMajeur = 'Vous êtes mineur';
    }
    else
    {
        chaineMineurMajeur ='Vous êtes majeur';
    }
    
}

let monBtnValider= document.querySelector('#btnvalider'); 
 
monBtnValider.addEventListener('click', function() {
document.getElementById('text').textContent = afficherPrenomAge();
document.getElementById('text2').textContent = mineurMajeur();
});