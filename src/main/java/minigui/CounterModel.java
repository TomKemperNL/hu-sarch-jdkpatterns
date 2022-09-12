package minigui;

public class CounterModel {
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void increment(){
        this.counter++;
    }
}
