module com.example.counterchar {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.counterchar to javafx.fxml;
    exports com.example.counterchar;
}