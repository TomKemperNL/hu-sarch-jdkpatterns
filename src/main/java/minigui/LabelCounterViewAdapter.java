package minigui;

import javafx.scene.control.Label;

public class LabelCounterViewAdapter implements CounterView{

    private final Label label;

    public LabelCounterViewAdapter(Label label){
        this.label = label;
    }

    @Override
    public void setValue(int value) {
        label.setText(String.valueOf(value));
    }
}
