package view;

import javafx.stage.Stage;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StageInitializer implements ApplicationListener<RestaurantUI.StageReadyEvent> {
    @Override
    public void onApplicationEvent(RestaurantUI.StageReadyEvent event) {
        Stage stage = event.getStage();
    }
}
