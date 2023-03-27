package src.Otoczenia;

import src.Napis;
import src.Otoczenie;

public class Nawiasy extends Otoczenie{

    public Nawiasy(Napis zawartosc) {
        super(zawartosc);
    }

    public Nawiasy(String zawartosc) {
        super(zawartosc);
    }

    @Override
    public String pobierzZawartosc() {
        return "("+zawartosc.pobierzZawartosc()+")";
    }
    
}
