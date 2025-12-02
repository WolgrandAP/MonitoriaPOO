module org.demo3.playmusic {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.demo3.playmusic to javafx.fxml;
    exports org.demo3.playmusic;
}