module fr.boxcheck.boxcheck {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.boxcheck.boxcheck to javafx.fxml;
    exports fr.boxcheck.boxcheck;
}