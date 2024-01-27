module com.lifeinsuranceapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.lifeinsuranceapplication to javafx.fxml;
    exports com.lifeinsuranceapplication;
}