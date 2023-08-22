module com.example.juego {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.juego to javafx.fxml;
    exports com.example.juego;
}