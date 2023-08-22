package com.example.juego;

import com.example.juego.modelo.User;
import com.example.juego.modelo.UserDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        UserDAO us = new UserDAO();
        int n = us.consulta(new User("Hola", "Mundo"));
        welcomeText.setText("Welcome to JavaFX Application!: " + n);
    }
}