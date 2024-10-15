package Template_Method_Pattern;
public class Coffee extends Beverage {
    @Override
    protected void addMainIngredient() {
        System.out.println("Adding coffee grounds");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
