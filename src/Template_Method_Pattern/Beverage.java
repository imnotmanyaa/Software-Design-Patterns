package Template_Method_Pattern;
public abstract class Beverage {
    public final void prepareBeverage() {
        boilWater();
        addMainIngredient();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring in cup");
    }

    // Абстрактные методы, которые должны реализовать подклассы
    protected abstract void addMainIngredient();
    protected abstract void addCondiments();
}
