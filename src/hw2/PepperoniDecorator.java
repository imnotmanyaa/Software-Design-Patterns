package hw2;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", с пепперони";
    }

    public double cost() {
        return pizza.cost() + 1.5;
    }
}
