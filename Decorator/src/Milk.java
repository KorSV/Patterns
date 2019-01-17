public class Milk extends AdditionDecorator{

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "-" + "Milk";
    }

    public int cost(){
        return 5 + this.beverage.cost();
    }

}
