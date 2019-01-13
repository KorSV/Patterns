import java.util.ArrayList;
import java.util.List;

public class Magaz {
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

}
