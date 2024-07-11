const app = {
    data(){
        return {
            nombre : 0,
            texteDynamique : '',
            nombreA : 0,
            nombreB : 0,
            personnes : ['Michel Truite', 'Steve Weilmachin', 'Tristan Petitgirard']
        }
    },
    computed : {
        nbAplusNbB(){
            return Number(this.nombreA) + Number(this.nombreB)
        }
    },
    methods : {
        diminuer() {
            this.nombre--;
        },
        incrementer() {
            this.nombre++;
        },
        ajouterToto(){
            this.personnes.push(this.nbAplusNbB);
        }
    }
}

Vue.createApp(app).mount('#monApp');