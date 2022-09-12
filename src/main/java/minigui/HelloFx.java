package minigui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFx extends Application {

    public static void main(String[] args) {
        //Als je wilt dat de gouwe ouwe main het doet moet je in de IntelliJ run-configuratie het module-path
        //correct configureren. Dat weet ik even niet meer uit het hoofd, maar kun je afkijken in OOP:)
        StackPane pane = new StackPane();

        //pane.layout(); is een voorbeeld van een composite pattern method.
        //al zul je die nooit met de hand aanroepen...

        Application.launch(args);
        //Veel makkelijker is met het maven-menutje naar plugins/javafx/javafx:run te gaan:)
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Counter");
        Label counterLabel = new Label();
        Button increment = new Button("++");
        increment.setOnAction(new WatDoetDeKnopStrategy(
                new LabelCounterViewAdapter(counterLabel),
                new CounterModel()));

        FlowPane root = new FlowPane(label, counterLabel, increment);
        root.setOrientation(Orientation.VERTICAL);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
