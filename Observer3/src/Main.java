import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer...");
        Magaz m = new Magaz();
        Report r1 = new Report("Отчет №1");
        Observer iRep = new InteractiveReport();
        m.addObserver(r1);
        m.addObserver(iRep);
        m.addObserver(new User("Serg"));
        m.changePrice();
    }
}
