package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TransportFactory factory = new TransportFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter delivery type (land/sea/air):");
        String type = scanner.nextLine();

        Transport transport = factory.createTransport(type);
        if (transport != null) {
            transport.deliver();
        } else {
            System.out.println("Unknown delivery type.");
        }

        scanner.close();
    }
}
