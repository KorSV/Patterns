public class Cream extends AdditionDecorator{
    Beverage beverage;

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "-" + "Cream";
    }

    @Override
    public int cost() {
        return 6 + beverage.cost();
    }
}
