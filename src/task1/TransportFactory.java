package task1;

public class TransportFactory {
    public Transport createTransport(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        if (type.equalsIgnoreCase("land")) {
            return new Truck();
        } else if (type.equalsIgnoreCase("sea")) {
            return new Ship();
        } else if (type.equalsIgnoreCase("air")) {
            return new Drone();
        }
        return null;
    }
}
