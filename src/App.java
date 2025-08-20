public class App {
    public static void main(String[] args) throws Exception {
  
        Auto auto1 = new Auto(); //auto1 = istanza della classe.
        //per poter accedere agli attributi della classe da un oggetto si usa il .
        auto1.setAlimentazione( "benzina");

        Auto auto2 = new Auto();
        auto2.setAlimentazione("Diesel");

        //cambiando auto2 non tocco auto1 perchè sono istanze diverse. 
        System.out.println(auto1.getColore()); //anche non essendo inizializzato non è rosso e stampa "null" - se non inizializzata,
                                            // ha valori di defoult grazie al costruttore "new Auto()"
        //COSTRUTTORE: data una classe, ne costruisce l'istanza. Se non lo metti tu Java ne crea uno di defouolt..
        //viene creato un riferimento alla cella di memoria, e viene fatta la zero-initializzation = vengono assegnati valori di defoult.
        System.out.println("Colore auto 2: " + auto2.getColore());
        //auto2.colore = "blue";
        auto2.cambiaColore("blue");
        System.out.println("Colore auto2: " + auto2.getColore());
        System.out.println("Colore auto1: " + auto1.getColore());
        //colore auto2: red
        //colore auto2: blue
        //colore auto1: red
        //--> stampa il valore che ho impostato all'inizio, poi il valore che gli ho riassegnato ma senza toccare auto1 perchè sono istanze diverse

        //il costruttore fa due azioni importantnti: 
        /* 1. fa un riferimento alla cella di memoria in cui saranno temporaneamente salvate le informazioni.
           2. fa la zero-inizializzation dove se non gli sono stati dati valori iniziali, li da lui. */

        //Come interagisco con un metodo?
        auto2.cambiaColore("blue"); //-> è uguale a riga 17, sto riassegnando un valoro, ma questa volta 
                                                // richiamando il metodo cambiaColore della classe Auto.
        //uso del metodo descrittivo
        Auto auto3 = new Auto();
        auto3.setCilindrata(1600);
        auto3.setNumeroPosti(5);
        auto3.setNumeroPorte(5);
        auto3.setTarga( "FG651AE");

        auto3.descriviAuto();
        //qual è il senso di fare un metodo: riutilizzo, posso creare una classe di utility,se devo fare una modifica, la faccio una volta
        // e vale per tutte le volte che ho richiamato il metodo.
    }
}
