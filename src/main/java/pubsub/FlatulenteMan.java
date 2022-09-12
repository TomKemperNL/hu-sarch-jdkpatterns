package pubsub;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlatulenteMan {
    private final String naam;
    private final Set<ScheetHandler> ruikers = new HashSet<>();

    public FlatulenteMan(String naam) {
        this.naam = naam;
    }

    public void addRuiker(ScheetHandler handler){
        this.ruikers.add(handler);
    }

    public void removeRuiker(ScheetHandler handler){
        this.ruikers.remove(handler);
    }


    public String getNaam() {
        return naam;
    }

    public void laatErEenGaan(){
        ScheetEvent daarGaatIe = new ScheetEvent(this.naam);
        for(ScheetHandler handler: this.ruikers){
            handler.handle(daarGaatIe);
        }
    }
}
