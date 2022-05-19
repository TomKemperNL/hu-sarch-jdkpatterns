public class SingletonExample {

    private SingletonExample(){
        //niemand kan mij bouwen, behalve ik zelf!
    }

    public static final SingletonExample instance = new SingletonExample();

    public void doeIets(){
        //Tsja... wat wil je met je singleton...
    }
}
