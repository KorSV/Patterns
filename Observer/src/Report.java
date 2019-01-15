import java.util.List;

public class Report implements Observer{
    private String title;
    int totalProduct;
    int totalPriceProduct;

    public Report(Observed o,String title) {
        this.title = title;
        o.register(this);
    }

    public void Print(){
        System.out.println(title);
        System.out.println("всего в магазине товаров: "+this.totalProduct);
        System.out.println("на сумму: "+this.totalPriceProduct);
    }


    @Override
    public void update(List<Product> productList) {
        this.totalProduct = productList.size();
        for(Product p : productList){
            this.totalPriceProduct+=p.getPrice();
        }
    }

}
