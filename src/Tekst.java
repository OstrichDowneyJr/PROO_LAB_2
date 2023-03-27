package src;

public class Tekst implements Napis{
    private String tekst; 

    public Tekst(String tekst){
        this.tekst = tekst;
    }

    @Override
    public String pobierzZawartosc(){
        return tekst;
    } 
}
