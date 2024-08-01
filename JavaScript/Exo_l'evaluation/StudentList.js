import { Student } from "./Student.js";

export class StudentList
{
    /**
     *Gère la liste des étudiants
     */
    constructor()
        /**@var {Array} student la liste d'étudiants */
    {
        this.students = [];
    }

    /**
     * crée la liste d'étudiants
     */
    async createStudents()
    {
        let json = await this.loadData();
        //On parcourt le jeu de données
        for(let aStudent of json)
        {
            //Pour chaque étudiant, on crée une instance de la classe Student
            let newStudent = new Student(aStudent.fullname, aStudent.grade);
            //On ajoute l'instance dans notre tableau d'étudiants
            this.students.push(newStudent);
        }
    }

    /**
     * @return Charge les données JSON
     */
    async loadData()
    {
        //Récupération du JSON
        let response = await fetch('./eval.json');
        //Conversion du JSON en objet Javascript
        const json = await response.json();
        return json;
    }
}