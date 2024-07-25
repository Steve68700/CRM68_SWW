//import { Person } from './Person.js';

const app ={
    data(){
        return{
            //person: new Person(),
            formResult: 'Sélectionnez une date dans le passé.',
            //majority: '',
            //retired: ''
        }
    },

    methods:{
        validateForm(){
            this.formResult = `Vous êtes né le ${this.date.time} .`;
            /*this.majority = this.person.getMajority();
            this.retired = this.person.getRetired();*/
        }
    }
}

Vue.createApp(app).mount('#app')