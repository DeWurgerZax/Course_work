module com.example.course_work_java {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.course_work_java to javafx.fxml;
    exports com.example.course_work_java;
}