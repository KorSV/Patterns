import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Magaz magaz = new Magaz();
        Order order = new Order();
        do {
            System.out.println("Выберите продукт для добавления в корзину:");
            for (Product product : magaz.productList) {
                System.out.println(product.toString());
            }
            System.out.print("Номер товара: ");
            order.addProduct(magaz.productList.get(Integer.parseInt(reader.readLine()) - 1));
            System.out.println("Для возврата в меню выбора товаров нажмите Y" + "\n" +
                    "Для оформления заказа нажмите N");
        }while(reader.readLine().equalsIgnoreCase("Y"));
        /*содержимое корзины*/
        order.print();
        System.out.print("Подтверждение Y/N:");
        if (reader.readLine().equalsIgnoreCase("Y")){
            System.out.println("Выберите способ оплаты:" + "\n" +
                               "1 - по карте" + "\n" +
                               "2 - Яндекс кошелек" );
            int typePay = Integer.parseInt(reader.readLine());
            if (typePay==1) {
                order.setPay(new PayByCard());
                order.pay();
            }else if(typePay==2){
                order.setPay(new PayByYa());
                order.pay();
            }
        }
    }
}
