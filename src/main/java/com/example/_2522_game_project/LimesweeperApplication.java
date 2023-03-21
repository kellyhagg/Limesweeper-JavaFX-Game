package com.example._2522_game_project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LimesweeperApplication extends Application {

    public static final int CELL_SIZE = 24;

    private Pane createPane() {
        Pane pane = new Pane();
        pane.setPrefSize(720, 384);

        return pane;
    }

    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(LimesweeperApplication.class.getResource("hard-limesweeper.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 740, 450);
        Scene scene = new Scene(createPane());
        stage.setTitle("Limesweeper");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}