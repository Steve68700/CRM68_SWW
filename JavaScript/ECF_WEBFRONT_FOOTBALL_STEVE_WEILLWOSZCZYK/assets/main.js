import { FootballMatch } from "./FootballMatch.js";
import { MatchList } from "./MatchList.js";

const myMatchList = new MatchList();
await myMatchList.createMatchs();

createRows();

console.log(myMatchList);

/**
 * Crée une cellule de tableau
 * @param {String} data la valeur à ajouter dans la cellule
 * @returns {HTMLElement} la cellule créée
 */
function createCell(data)
{
    const td = document.createElement('td');
    td.textContent = data;
    return td;
}

/**
 * Crée une ligne de tableau contenant les informations d'un match
 * @param {FootballMatch} aMatch le match
 * @return {HtmlElement} la ligne nouvellement créée
 */
function createOneRow(aMatch)
{
    const tr = document.createElement('tr');
    tr.appendChild(createCell(aMatch.team1));
    tr.appendChild(createCell(aMatch.team2));
    tr.appendChild(createCell(aMatch.score1));
    tr.appendChild(createCell(aMatch.score2));
    return tr;
}

/**
 * Parcourt la liste de matchs et créé les lignes de tableaux correspondantes
 */
function createRows()
{
    let tbody = document.getElementById('scoreBoard');
    for(let aMatch of myMatchList.matchs)
    {
            tbody.appendChild(createOneRow(aMatch));
    }
}