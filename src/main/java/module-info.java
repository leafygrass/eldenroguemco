module ccprog3.mco {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
	requires java.desktop;

    opens ccprog3.mco to javafx.fxml;
    opens ccprog3.mco.Controllers to javafx.fxml; 
    exports ccprog3.mco;
    exports ccprog3.mco.Controllers;
    exports ccprog3.mco.Model.Job;
    exports ccprog3.mco.Model.Player;
    exports ccprog3.mco.Model.Area;
    exports ccprog3.mco.Model.Enemy;
    exports ccprog3.mco.Model.Weapon;
}
