import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Beverage b = new Choco(new Milk(new Capuchino()));
        System.out.println(b.getDescription() + " - " +b.cost() + "$");
        InputStream file = new ReplacerInputStream(new FileInputStream("/home/ksv/proj/java/training/Patterns/Decorator/src/test.txt"));



        BufferedReader br2 = new ReplacerReader(new BufferedReader(new InputStreamReader(file)));


        //BufferedReader fr = new BufferedReader(new FileReader("/home/ksv/proj/java/training/Patterns/Decorator/src/test.txt"));
        //BufferedReader fr = new BufferedReader(new InputStreamReader(System.in));
        String line = br2.readLine();
        while ( line != null ) {
            System.out.println(line);
            line = br2.readLine();
        }
    }
}
