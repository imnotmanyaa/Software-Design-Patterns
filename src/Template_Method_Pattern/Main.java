package Template_Method_Pattern;
public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        System.out.println("Preparing tea:");
        tea.prepareBeverage();

        System.out.println("\nPreparing coffee:");
        coffee.prepareBeverage();
    }
}
