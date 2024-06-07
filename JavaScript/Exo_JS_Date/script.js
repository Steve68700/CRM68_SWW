let intervalBouton;
let nbIntervalBouton;

function afficherDate() {
    let maDate = new Date();
    let annee = maDate.getFullYear();
    let mois = maDate.getMonth()+1;
    let date = maDate.getDate();

    if(date < 10)
        {
            date = '0' + date;
        }
    if(mois < 10)
        {
            mois = '0' + mois;
        } 

    let chaineDate = date + '/' + mois + '/' + annee;
    //let chaineDate = maDate.toLocaleDateString();
    
    return chaineDate;
}

let monBtnDate = document.querySelector('#btndate'); 
monBtnDate.addEventListener('click', function() {

document.getElementById('txtdate').value = afficherDate();
});


function afficherHeure() {
    let monHeure= new Date();
    let heure = monHeure.getHours();
    let minute = monHeure.getMinutes();
    let seconde = monHeure.getSeconds();

    if(heure < 10)
        {
            heure = '0' + heure;
        }
    if(minute < 10)
        {
            minute = '0' + minute;
        } 
    if(seconde < 10)
        {
            seconde = '0' + seconde;
        }

    let chaineHeure = heure + ':'+ minute +':'+ seconde;
    //let chaineHeuere = monHeuere.toLocaleHeuereString();
    document.getElementById('txtheure').value =chaineHeure;

}

let monBtnHeure = document.querySelector('#btnheure'); 
monBtnHeure.addEventListener('click', function() {
    nbIntervalBouton = 0;
    afficherHeure();
    intervalBouton = setInterval(function (){
        if(nbIntervalBouton < 10){
            afficherHeure();
            nbIntervalBouton ++;
        } else {
            clearInterval(intervalBouton);
        }

    }, 1000);
});