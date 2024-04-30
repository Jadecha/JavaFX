module senati.pe.proyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens senati.pe.proyectojavafx to javafx.fxml;
    exports senati.pe.proyectojavafx;
}