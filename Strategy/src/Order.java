import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int cost;
    private List<Product> products = new ArrayList<>();

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private IPay pay;

    public void setPay(IPay pay) {
        this.pay = pay;
    }

    public void addProduct(Product product){
        products.add(product);
        System.out.println("Товар "+product.getName()+" добавлен в корзину.");
        cost+=product.getPrice();
    }

    public void print(){
        System.out.println("Содержимое корзины:");
        for (Product product:products) {
            System.out.println(product.toString());
        }
        System.out.println("-----всего:"+this.cost);
    }

    public void pay(){
        pay.pay(this.cost);
    }
}
