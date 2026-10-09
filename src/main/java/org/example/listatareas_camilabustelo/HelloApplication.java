package org.example.listatareas_camilabustelo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private Label titulo = new Label();
    private VBox vbox = new VBox();
    private TextField texto = new TextField();
    private ListView<String> lista = new ListView<>();
    private Button boton = new Button();
    private Label textoInfo = new Label();


    public void iniciar() {
        titulo.setText("Lista de Tareas");
        boton.setText("Agregar");
        vbox.setSpacing(10);
        texto.setAlignment(Pos.CENTER);
        vbox.setAlignment(Pos.CENTER);
        textoInfo.setText("Introduzca la tarea a agregar");

        vbox.getChildren().add(titulo);
        vbox.getChildren().add(texto);
        vbox.getChildren().add(textoInfo);
        vbox.getChildren().add(boton);
        vbox.getChildren().add(lista);
    }

    private void anadirLista() {
        if(!texto.getText().trim().isEmpty()) {
            lista.getItems().add(texto.getText().trim());
            texto.setText("");
            textoInfo.setText("La tarea ha sido agregada correctamente");
        } else {
            textoInfo.setText("No se puede agregar una tarea vacía");
        }
    }

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Lista de Tareas");
        stage.setHeight(700);
        stage.setWidth(800);
        stage.setResizable(false);

        iniciar();

        boton.setOnAction(e -> anadirLista());

        stage.setScene(new Scene(vbox));
        stage.show();

    }


}
