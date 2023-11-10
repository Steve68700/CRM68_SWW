const header = document.querySelector("header");
const section = document.querySelector("section");

async function getData(){
    const response = await fetch("./js/data.json");
    let data = await response.json();
    setHeader(data);
}

getData();

function setHeader(datas){
    //console.log(datas.squadName);
    let myH1= document.createElement("h1");
    myH1.textContent= datas.squadName;
    console.log(myH1);
    header.appendChild(myH1);

    let myPara= document.createElement("p");
    myPara.textContent= "Hometown: "+datas.homeTown+" // "+"formed: "+datas.formed;
    console.log(myPara);
    header.appendChild(myPara);
    setSection(datas);
}

function setSection(datas){
    let heroes= datas.members;
    console.log(heroes);

    for(let i= 0; i < heroes.length; i++){
        let myArt= document.createElement("article");
        let myH2= document.createElement("h2");
        let myPara1= document.createElement("p");
        let myPara2= document.createElement("p");
        let myPara3= document.createElement("p");
        let myList=document.createElement("ul");

        myH2.textContent= heroes[i].name;
        myPara1.textContent= "Secret idendity: "+heroes[i].secretIdentity;
        myPara2.textContent= "Age: "+heroes[i].age;
        myPara3.textContent= "Superpowers: ";

        let superPowers= heroes[i].powers;
        for(let j= 0; j < superPowers.length; j++){
            let listItem= document.createElement("li");
            listItem.textContent= superPowers[j];
            myList.appendChild(listItem);
        }

        myArt.appendChild(myH2);
        myArt.appendChild(myPara1);
        myArt.appendChild(myPara2);
        myArt.appendChild(myPara3);
        myArt.appendChild(myList);

        section.appendChild(myArt);
    }
}