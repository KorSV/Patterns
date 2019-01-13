import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCard implements IPay{
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    @Override
    public void pay(int cost) {
        try {
            System.out.println("Введите номер карты:");
            int nomer = Integer.parseInt(reader.readLine());
            System.out.println("Введите год окончания:");
            int expYear = Integer.parseInt(reader.readLine());
            System.out.println("Введите cvv карты:");
            int cvv = Integer.parseInt(reader.readLine());
            CreditCard creditCard = new CreditCard(nomer,expYear,cvv);
            if (creditCard.minus(cost)){
                System.out.println("Покупка оформлена.");
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
