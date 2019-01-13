import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByYa implements IPay{

    private String email;
    private String passwd;
    private boolean signedIn;

    private static Map<String, String> yaAccounts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static{
        yaAccounts.put("kor@yandex.ru", "qwerty");
        yaAccounts.put("ivanov@yandex.ru", "qwe");
    }

    private boolean verify(){
        signedIn = passwd.equals(yaAccounts.get(email));
        return signedIn;
    }

    @Override
    public void pay(int cost) {
        try {
            System.out.print("Введите e-mail:");
            email = reader.readLine();
            System.out.print("Введите пароль:");
            passwd = reader.readLine();
            if (verify()){
                System.out.println("successful");
                System.out.println("Заказ успешно оформлен");
            }else{
                System.out.println("Неверная пара логин/пароль");
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
