import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class Controller {
    Model model;
    View view;
    Timeline timeline;
    private IntegerProperty elapsedTime = new SimpleIntegerProperty(0);
    private int lastClickedButton = -1;

    /*
     * Setting up the game
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        setupGameControls();
    }

    /**
     * Calling all the methods that help setting up the game
     */
    public void setupGameControls() {
        animate();
        setupCounter();
    }

   
    /**
     * Animating the game/Starting the timeline of the game
     */
    public void animate() {
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> elapsedTime.set(elapsedTime.get() + 1)));
        timeline.setCycleCount(timeline.INDEFINITE);
    }

    /**
     * Counting the elapsed time
     */
    public void setupCounter() {
        elapsedTime.addListener(ov -> {
            view.setLabel(elapsedTime.getValue());
        });
    }

    /**
     * Starting the game
     */
    public void startGame() {
        timeline.play();
    }

    /**
     * Ending the game
     */
    public void endGame() {
        timeline.stop();
        view.bottomPane.getChildren().clear();
        Label myLabel = new Label("You cleared the game in " + elapsedTime.getValue() + " seconds. Congratulations!");
        view.bottomPane.getChildren().add(myLabel);
    }
}
