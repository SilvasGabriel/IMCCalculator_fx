module imcc.imccalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens imcc.imccalculator to javafx.fxml;
    exports imcc.imccalculator;
}