module com.example.testproject1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testproject1 to javafx.fxml;
    exports com.example.testproject1;
}