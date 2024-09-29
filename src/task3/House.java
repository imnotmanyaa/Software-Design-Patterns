package task3;

public class House {
    private int numRooms;
    private int numFloors;
    private boolean hasPool;
    private boolean hasGarage;

    House(Builder builder) {
        this.numRooms = builder.getNumRooms();
        this.numFloors = builder.getNumFloors();
        this.hasPool = builder.hasPool();
        this.hasGarage = builder.hasGarage();
    }

    @Override
    public String toString() {
        return "House [Rooms: " + numRooms + ", Floors: " + numFloors +
                ", Pool: " + (hasPool ? "Yes" : "No") +
                ", Garage: " + (hasGarage ? "Yes" : "No") + "]";
    }

    public static Builder builder() {
        return new Builder();
    }
}
