import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Magaz implements Observed {


    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private List<Observer> observers = new ArrayList<>();

    public static List<Product> productList = new ArrayList<>();
    static{
        productList.add(new Product(1, "Карандаш", 50));
        productList.add(new Product(2, "Ручка", 60));
        productList.add(new Product(3, "Тетрадь", 24));
        productList.add(new Product(4, "Линейка", 45));
        productList.add(new Product(5, "Степлер", 235));
        productList.add(new Product(6, "Блакнот", 120));
        productList.add(new Product(7, "Конверт", 10));
        productList.add(new Product(8, "Папка для бумаг", 76));
        productList.add(new Product(9, "Дырокол", 420));
    }



    public void printPriceList(){
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    public void add(Product product){
        productList.add(product);
        notifyObservers();
    }

    public void changePrice(){
        printPriceList();
        try {
            System.out.print("Выберите код товара для изменения цены: ");
            int productId =  Integer.parseInt(reader.readLine());
            System.out.print("Введите новую цену: ");
            int newCost = Integer.parseInt(reader.readLine());
            Product product = productList.get(productId-1);
            product.setPrice(newCost);
            System.out.println("Цена товара изменена.");
            notifyObservers();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        int i = observers.indexOf(observer);
        if (i>=0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer o : this.observers){
            o.update(this.productList);
        }
    }
}
