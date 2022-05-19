public class SingletonTryout {
    public static void main(String[] args) {
        SingletonExample.instance.doeIets(); //kiek, ik kan erbij!

        //SingletonExample tweede = new SingletonExample(); En dit compile't niet, dus we kunnen geen extras krijgen.
    }
}
