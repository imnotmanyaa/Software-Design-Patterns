package Template_Method_Pattern;
public class Tea extends Beverage {
    @Override
    protected void addMainIngredient() {
        System.out.println("Adding tea leaves");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
