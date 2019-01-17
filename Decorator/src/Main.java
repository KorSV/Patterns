public class Main {
    public static void main(String[] args) {
        Beverage b = new Choco(new Milk(new Capuchino()));
        System.out.println(b.getDescription() + " - " +b.cost() + "$");
    }
}
