public class Auto {
        //CLASS: è una keyword di java che permette di definire una nuova classe.

        //CARATTERISTCHE /FIELD --> l'insieme definisce lo STATO INTERNO DI UN OGGETTO.
        //modificatore di visibilità - tipo - variaile;
        public String colore; // = "red"; -> così ho inizializzato l'attributo e non avverrà la zero-inizzialization
        public String marca;
        public int annoImmatricolazione;
        public String modello;
        public String alimentazione;
        public String targa;
        public double kmPercorsi;
        public int proprietariPrecedenti;
        public int numeroPosti;
        public int numeroPorte;
        public double cilindrata;
        public void descriviAuto(){ //metodo descrittivo - uso del metodo in App.java.32
                System.out.println("L'automobile ha " + numeroPosti + " posti, ha " + numeroPorte + " porte, è  " + cilindrata + " di cilindrata, "
                        + " e ha " + targa + " come numero di targa." );
        }

        //abbiamo identificato delle caratteristiche che dicono che questa è una macchina.

        //-> altri oggetti visti: String, Scanner, Array
        // per fare lo scanner abbiamo usato il new....

        //METODI : il metodo all'interno di una classe è come fosse una scatola, come una matriosca.
        public void parti(){ //il void indica che questo metodo non ritona nulla e non accetta parametri nelle ()
                System.out.println("VROOOOM"); //corpo del metodo
        }
        public void cambiaColore(String nuovoColore){ //questo metodo accetta un parametro che cambia lo stato del colore, 
                colore = nuovoColore;                 // riassegnando il colore - interazione con l'esterno perchè potrò invocarlo
        }
        public String saluta(){ //metodo che ritorna una stringa, non accetta parametri e ha un metodo return
                String saluto = "Ciao sono un automobile di colore " + colore;
                return saluto; //quando non ho void il return è obbligatorio
        }
        //cosa posso metterci dentro un metodo? Sicuramente non si inizializza una variabile di classe dentro al metodo (public String colore)
        /*posso però vedere tutto ciò che è fuori per gerarchia: da saluta posso vedere parti e posso vedere tutti gli attirbuti */
        /* Ma come interagisco con un metodo dall'esterno? Sempre con il . (vedi app.java.29) */

        //COSTRUTTORE : inizializzare gli attributi di istanza, in questo caso, perchè senza parametri, dando valori di defoult.
        public Auto(){
                //è come se non ha il nome ma tornasse alla classe
                colore = "red";
        }

        public Auto(String targa){
                if(targa == null || targa.length()< 7 ){
                        System.out.println("Targa non valida"); //il modo migliore sarebbe stato:
                        /* throw new IllegalArgoment....... -> stampa un messaggio di errore */
                        this.targa = "NON VALIDA";
                }else {
                  this.targa = targa;
                 }       
        }
               

        //quello definito qui sotto, non è un costruttore, è un metodo che rottama due auto e ne crea una nuova. E soprattutto
        //il costruttore non ha nome, questo sotto si (unisciDueAuto)
        public Auto unisciDueAuto(Auto auto1, Auto auto2){
                return new Auto();
        }

        //OVERLOAD

        public String saluta(String nomeDaSalutare){ //metodo 1.
                String saluto = "Ciao " + nomeDaSalutare + "sono un'automobile di colore " + colore;
                return saluto;
        }

        // public String saluta(){ //metodo 2.
        //         return "Ciao";
        // } 

        public String saluta(int numeroVolte){ //metodo 3.
                String risultato = "Ciao";
                for (int i = 0; i < numeroVolte; i++) {
                    risultato += "\n" + i + "volte";
                }
                return risultato;
        }

        public String saluta(int numeroVolte, String nomeDaSalutare){ //metodo 4.
                String risultato = "Ciao";
                for (int i = 0; i < numeroVolte; i++) {
                    risultato += "\n" + i + "volte";
                }
                return risultato;
        }
}
