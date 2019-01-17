public class Choco extends AdditionDecorator {

    Beverage beverage;

    public Choco(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " - " + "Chocolate";
    }

    @Override
    public int cost() {
        return 7 + beverage.cost();
    }
}
