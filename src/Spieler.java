public class Spieler {
    //Hat vier Möglichkeiten: Hit (Karte), Stand(Halten), Double(Verdoppeln), Split(Teilen)
    //Sind beim Blackjack die Ergebnisse der anderen Mitspieler egal?
    //

    double kapital;
    Croupier croupier;


    Spieler (double kapital, Croupier croupier){
        this.kapital = kapital;
        this.croupier = croupier;
    }

    public void startPlay(double einsatz){
        //Spiel starten
    }

    public void actionHit(){
        //Karte ziehen
    }

    public void actionHold(){
        //Halten
    }

    public void actionDouble(){
        //Verdoppeln
    }

    public void actionSplit(){
        //Teilen
    }
}
