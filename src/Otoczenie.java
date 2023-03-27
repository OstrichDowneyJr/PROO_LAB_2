package src;

public abstract class Otoczenie implements Napis{
    protected Napis zawartosc;

    protected Otoczenie(Napis zawartosc){
        this.zawartosc = zawartosc;
    }

    protected Otoczenie(String zawartosc){
        this.zawartosc = new Tekst(zawartosc);
    }
}
