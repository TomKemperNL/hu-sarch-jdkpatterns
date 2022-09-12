import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ijsje {

    private final List<String> bolletjes;

    private Ijsje(List<String> bolletjes){
        this.bolletjes = bolletjes;
    }

    @Override
    public String toString() {
        return "Ijsje{" +
                "bolletjes=" + bolletjes +
                '}';
    }

    //Je moet natuurlijk heel snel ijsjes bouwen. Als je de bolletjes er te langzaam één voor één op doet
    //is de eerste al gesmolten! Ijsjes bouwen is een kunst.
    public static IjsjesBuilder builder(){
        return new IjsjesBuilder();
    }


    public static class IjsjesBuilder {
        //Een lijstje met de bolletjes die we er allemaal op -gaan- doen.
        private List<String> todoBolletjes = new ArrayList<>();

        private IjsjesBuilder(){

        }

        public IjsjesBuilder met(String smaakje){
            this.todoBolletjes.add(smaakje);
            return this;
        }

        public Ijsje build(){
            if(todoBolletjes.size() == 0){
                throw new UnsupportedOperationException("Geen lege hoorntjes!");            }

            return new Ijsje(this.todoBolletjes);
        }
    }

    public static class IjsjeFactory {
        public Ijsje maakIjsje(String... smaken){
            if(smaken.length == 0){
                throw new UnsupportedOperationException("Geen lege hoorntjes!");            }

            return new Ijsje(Arrays.asList(smaken));
        }
    }

    public static void main(String[] args) {
        Ijsje hmmm = Ijsje.builder()
                .met("Oreo")
                .met("Vanilla")
                .met("Kokos")
                .build();
        System.out.println(hmmm);

        Ijsje ookLekker = new IjsjeFactory().maakIjsje("Citroen", "Watermeloen");
        System.out.println(ookLekker);
    }
}
