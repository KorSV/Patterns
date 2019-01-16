import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.getUsername()+" В прайсе изменились цены.");
    }
}
