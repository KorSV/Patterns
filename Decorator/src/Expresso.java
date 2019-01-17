public class Expresso extends Beverage {

    public Expresso() {
        this.description = "Expresso";
    }

    @Override
    public int cost() {
        return 100;
    }
}
