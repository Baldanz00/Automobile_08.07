public class Auto {
        //CLASS: è una keyword di java che permette di definire una nuova classe.

        //CARATTERISTCHE /FIELD --> l'insieme definisce lo STATO INTERNO DI UN OGGETTO.
        //modificatore di visibilità - tipo - variaile;
        private String colore; // = "red"; -> così ho inizializzato l'attributo e non avverrà la zero-inizzialization
        private String marca;
        private int annoImmatricolazione;
        private String modello;
        private String alimentazione;
        private String targa;
        private double kmPercorsi;
        private int proprietariPrecedenti;
        private int numeroPosti;
        private int numeroPorte;
        private double cilindrata;

        public  void descriviAuto(){ //metodo descrittivo - uso del metodo in App.java.32
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

//aggiungo tutti i get
        public String getColore() {
                return colore;
        }

        public String getMarca() {
                return marca;
        }

        public int getAnnoImmatricolazione() {
                return annoImmatricolazione;
        }

        public String getModello() {
                return modello;
        }

        public String getAlimentazione() {
                return alimentazione;
        }

        public String getTarga() {
                return targa;
        }

        public double getKmPercorsi() {
                return kmPercorsi;
        }

        public int getProprietariPrecedenti() {
                return proprietariPrecedenti;
        }

        public int getNumeroPosti() {
                return numeroPosti;
        }

        public int getNumeroPorte() {
                return numeroPorte;
        }

        public double getCilindrata() {
                return cilindrata;
        }

       
//setter

         public void setAlimentazione(String alimentazione) {
                this.alimentazione = alimentazione;
        }

         public void setNumeroPosti(int numeroPosti) {
                 this.numeroPosti = numeroPosti;
         }

         public void setNumeroPorte(int numeroPorte) {
                 this.numeroPorte = numeroPorte;
         }

         public void setCilindrata(double cilindrata) {
                 this.cilindrata = cilindrata;
         }

         public void setTarga(String targa) {
                 this.targa = targa;
         }

        
        
}
