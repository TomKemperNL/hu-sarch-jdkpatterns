package pubsub;

public class ManualPubSub {

    public static void main(String[] args) {
        //Sorry, de inspiratie is even ver te zoeken
        FlatulenteMan tom = new FlatulenteMan("Tom");

        Student armeTimo = new Student("Timo");
        Student armeStella = new Student("Stella");
        tom.addRuiker(armeStella);
        tom.addRuiker(armeTimo);

        Student mazzelaarFarouk = new Student("Farouk");

        tom.laatErEenGaan();
    }
}
