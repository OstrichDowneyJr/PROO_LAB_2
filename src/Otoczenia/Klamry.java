package src.Otoczenia;
import src.Napis;
import src.Otoczenie;

public class Klamry extends Otoczenie{
    public Klamry(Napis zawartosc) {
        super(zawartosc);
    }

    public Klamry(String zawartosc) {
        super(zawartosc);
    }
    
    @Override
    public String pobierzZawartosc() {
        return "{"+zawartosc.pobierzZawartosc()+"}";
    }
}
