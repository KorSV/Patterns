public class Capuchino  extends Beverage {

    @Override
    public String getDescription() {
        this.description = "Capuchino";
        return this.description;
    }

    @Override
    public int cost() {
        return 120;
    }
}
