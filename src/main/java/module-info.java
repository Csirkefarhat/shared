module ehu.eus {
    requires javafx.controls;
    requires javafx.fxml;

    opens ehu.eus to javafx.fxml;
    exports ehu.eus;
}
