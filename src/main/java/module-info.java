module com.stempien.tictaktou {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.stempien.tictaktou to javafx.fxml;
    exports com.stempien.tictaktou;
}