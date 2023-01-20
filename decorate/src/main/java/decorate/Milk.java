package decorate;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        super(beverage);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "Milk ";
    }

    @Override
    public double cost() {
        return super.cost() + 0.3;
    }
}
