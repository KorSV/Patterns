public class Americano extends Beverage {
    public Americano() {
        this.description = "Americano";
    }

    @Override
    public int cost() {
        return 110;
    }
}
