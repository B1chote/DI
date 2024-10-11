module com.example.di_ud1_tarea1_victorperezgonzalez {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.di_ud1_tarea1_victorperezgonzalez to javafx.fxml;
    exports com.example.di_ud1_tarea1_victorperezgonzalez;
}