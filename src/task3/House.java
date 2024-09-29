package task3;

public class House {
    // Поля класса
    private int numRooms;
    private int numFloors;
    private boolean hasPool;
    private boolean hasGarage;

    // Конструктор, принимающий Builder
    House(Builder builder) {  // Убираем 'private', чтобы он был доступен в пределах пакета
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

    // Статический метод для вызова Builder
    public static Builder builder() {
        return new Builder();
    }
}
