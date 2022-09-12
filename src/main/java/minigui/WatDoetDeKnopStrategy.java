package minigui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

//MVC in een notendop. View & Model zijn zo genoemd. De HelloFX Class + deze Handler zijn samen de Controller.
public class WatDoetDeKnopStrategy implements EventHandler<ActionEvent> {

    private final CounterView view;
    private final CounterModel model;

    public WatDoetDeKnopStrategy(CounterView view, CounterModel model) {
        this.view = view;
        this.model = model;
        this.view.setValue(model.getCounter());
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.model.increment();
        this.view.setValue(model.getCounter());
    }
}
