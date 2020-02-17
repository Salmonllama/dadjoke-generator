module dadjoke {
        requires javafx.controls;
        requires javafx.fxml;

        requires okhttp3;
        requires org.json;

        opens com.github.salmonllama.dadjoke to javafx.fxml;
        exports com.github.salmonllama.dadjoke;
}