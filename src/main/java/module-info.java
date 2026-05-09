module lk.ijse.theserenitymentalhealththerapycenter {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens lk.ijse.theserenitymentalhealththerapycenter to javafx.fxml;
    exports lk.ijse.theserenitymentalhealththerapycenter;
    opens lk.ijse.theserenitymentalhealththerapycenter.controller to javafx.fxml;
}