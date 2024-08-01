export class FootballMatch
{
    
    /**
     * Constructeur de la classe FootballMatch
    @param { String } _team1 le nom de l'équipe 1
    @param { String } _team2 le nom de l'équipe 2
    @param {String} _score1
    @param {String} _score2
     */
    constructor(_team1, _team2, _score1, _score2)
    {
        this.team1 = _team1;
        this.team2 = _team2;
        this.score1 = [];
        this.score2 = [];
        //this.splitScore();
    }

    /**
     * Sépare le score 1 et le score 2
     */
    /*splitScore()
    {
        let splitScore = this.score.split(',');
        this.scrore1 = splitScore[0];
        this.score2 =splitScore[1];
    }*/
}