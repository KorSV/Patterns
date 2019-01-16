import java.util.Observable;
import java.util.Observer;

public class InteractiveReport implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("update IReport");
    }
}
