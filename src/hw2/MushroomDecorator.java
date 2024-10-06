package hw2;

public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", с грибами";
    }

    public double cost() {
        return pizza.cost() + 1.0;
    }
}
