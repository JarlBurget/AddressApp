module ch.maker.address {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.maker.address to javafx.fxml;
    exports ch.maker.address;
}