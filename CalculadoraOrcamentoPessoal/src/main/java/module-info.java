module org.demo3.calculadoraorcamentopessoal {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.demo3.calculadoraorcamentopessoal to javafx.fxml;
    exports org.demo3.calculadoraorcamentopessoal;
}