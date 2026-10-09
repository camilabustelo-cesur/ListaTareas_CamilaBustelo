module org.example.listatareas_camilabustelo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.listatareas_camilabustelo to javafx.fxml;
    exports org.example.listatareas_camilabustelo;
}