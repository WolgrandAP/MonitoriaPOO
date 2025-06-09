module org.demo3.javafxdemo3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.demo3.javafxdemo3 to javafx.fxml;
    exports org.demo3.javafxdemo3;
}