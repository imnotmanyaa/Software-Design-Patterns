package hw2;

public class Main {
    public static void main(String[] args) {
        // Создаем базовую пиццу
        Pizza pizza = new Margherita();
        System.out.println(pizza.getDescription() + " стоит " + pizza.cost() + " USD");

        // Добавляем пепперони
        pizza = new PepperoniDecorator(pizza);
        System.out.println(pizza.getDescription() + " стоит " + pizza.cost() + " USD");

        // Добавляем грибы
        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription() + " стоит " + pizza.cost() + " USD");
    }
}
