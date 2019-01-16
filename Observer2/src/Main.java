import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer...");
        Magaz m = new Magaz();
        Report r1 = new Report("Отчет №1");
        Report r2 = new Report("Отчет №2");
        Observer iRep = new InteractiveReport();
        m.addObserver(r1);
        m.addObserver(r2);
        m.addObserver(iRep);
        //m.remove(r2);
        /*m.add(new Product(1, "Карандаш", 50));
        m.add(new Product(2, "Ручка", 60));
        m.add(new Product(3, "Тетрадь", 24));
        m.add(new Product(4, "Линейка", 45));
        m.add(new Product(5, "Степлер", 235));
        m.add(new Product(6, "Блакнот", 120));
        m.add(new Product(7, "Конверт", 10));
        m.add(new Product(8, "Папка для бумаг", 76));
        m.add(new Product(9, "Дырокол", 420));*/
        m.changePrice();
        //r1.Print();
        //r2.Print();
    }
}
