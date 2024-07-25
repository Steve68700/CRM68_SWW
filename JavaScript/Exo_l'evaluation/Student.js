export class Student
{
    
    /**
     * Constructeur de la classe Student
    @param { String } _fullname le nom complet de l'étudiant
    @param { Number } _grade la note de l'étudiant
     */
    constructor(_fullname, _grade)
    {
        this.fullname = _fullname;
        this._grade = _grade;
        this.lastname = '';
        this.firstname = '';
        this.splitFullname();
    }

    
    /**
     * Sépare le nom et leprénom
     */
    splitFullname()
    {
        let splitName = this.fullname.split(' '); //['Amaretti', 'Michaël']
        this.lastname = splitName[0];
        this.firstname = splitName[1];
    }
}
/*
let toto = { fullname: "Armanetti Michaël", grade: 12 };

console.log(toto.fullname)

let student = new Student(toto.fullname, toto.grade);
*/
// export { Student }
