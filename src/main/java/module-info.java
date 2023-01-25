module com.aricansoft.matbench {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aricansoft.matbench to javafx.fxml;
    exports com.aricansoft.matbench;
}