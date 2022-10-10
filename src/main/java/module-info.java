module com.example.snakeludo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakeludo to javafx.fxml;
    exports com.example.snakeludo;
}