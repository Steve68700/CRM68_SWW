import { FootballMatch } from "./FootballMatch.js"

export class MatchList
{
    /**
     * Gère la liste de matchs
     */
    constructor()
    /**@var {Array} match la liste de matchs */
    {
        this.matchs = []
    }

    /**
     * Crée la liste de matchs
     */
    async createMatchs()
    {
        let json = await this.loadData();
        //On parcourt le jeu de données
        for(let aMatch of json)
        {
            //pour chaque match, on crée une instance de la classe FootballMatch
            let newMatch = new FootballMatch(aMatch.team1, aMatch.team2, aMatch.score1, aMatch.score2);
            //On ajoute l('instance dans notre tableau de Matchs)
            this.matchs.push(newMatch);
        }
    }

    /**
     * @returns Charge les données JSON
     */
    async loadData()
    {
        //récupération du JSON
        let response = await fetch('./football.json');
        //Conversion du JSON en objet javascript
        const json = await response.json();
        return json;

    }
}