package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the platform (Windows/Mac):");
        String platform = scanner.nextLine();

        if (platform.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else if (platform.equalsIgnoreCase("Mac")) {
            factory = new MacFactory();
        } else {
            System.out.println("Unknown platform.");
            scanner.close();
            return;
        }
        Button button = factory.createButton();
        Window window = factory.createWindow();

        button.paint();
        window.create();

        scanner.close();
    }
}
