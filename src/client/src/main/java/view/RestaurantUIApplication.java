package view;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantUIApplication {

    public static void main(String[] args) {
        Application.launch(RestaurantUI.class, args);
    }
}
