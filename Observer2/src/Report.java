import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Report implements Observer {
    private String title;
    int totalProduct;
    int totalPriceProduct;

    public Report(String title) {
        this.title = title;
    }

    public void Print(){
        System.out.println(title);
        System.out.println("всего в магазине товаров: "+this.totalProduct);
        System.out.println("на сумму: "+this.totalPriceProduct);
    }


    /*public void update(List<Product> productList) {
        this.totalProduct = productList.size();
        for(Product p : productList){
            this.totalPriceProduct+=p.getPrice();
        }
    }*/

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("fire update" );
        if (o instanceof Magaz){
            Magaz m = (Magaz) o;
            for( Product p : m.getProductList() ){
                System.out.println(p.getName());
            }
        }
    }
}
