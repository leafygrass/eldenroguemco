module ccprog3.mco {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens ccprog3.mco to javafx.fxml;
    exports ccprog3.mco;
    exports ccprog3.mco.Model;
    exports ccprog3.mco.Model.Job;
}
