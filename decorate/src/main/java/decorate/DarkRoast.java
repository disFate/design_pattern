package decorate;

public class DarkRoast implements Beverage{
    @Override
    public String getDescription() {
        return "DarkRoast: ";
    }

    @Override
    public double cost() {
        return 0;
    }
}
