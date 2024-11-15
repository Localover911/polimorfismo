package persona;

public class Spettacolo {

    private String titolo;
    private String compagnia;
    private String data;
    private double costo;
    Persona [] elenco = new Persona [100];

    int contatore = 0;

    public Spettacolo (String titolo, String compagnia, String data, double costo){
        this.titolo = titolo;
        this.compagnia = compagnia;
        this.data = data;
        this.costo = costo;
    }

    public void aggiungispettatori (Persona p) {
        if (contatore < 100) {
            elenco[contatore] = p;
        }
        contatore++;
    }

    public void stampaPrenotazioni (Persona p){
        for (int i = 0; i <= contatore; i ++){
            System.out.println("Persona.nome" + " " + "Persona.indirizzo");
        }
    }

    public void contaPostiDisponibili (){
       int conta = 0;
       conta = 100 - contatore;
    }

    public void sconto (Persona p){

        }
    }
}




























