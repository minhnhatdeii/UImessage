module test.messenger {
    requires javafx.controls;
    requires javafx.fxml;


    opens test.messenger to javafx.fxml;
    exports test.messenger;
}