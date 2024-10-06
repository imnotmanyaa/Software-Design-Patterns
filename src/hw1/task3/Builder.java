package hw1.task3;

public class Builder {
    private int numRooms;
    private int numFloors;
    private boolean hasPool;
    private boolean hasGarage;

    // Методы для настройки
    public Builder setNumRooms(int numRooms) {
        this.numRooms = numRooms;
        return this;
    }

    public Builder setNumFloors(int numFloors) {
        this.numFloors = numFloors;
        return this;
    }

    public Builder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }

    public Builder setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }
    public int getNumRooms() {
        return numRooms;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public boolean hasPool() {
        return hasPool;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    // Создание объекта House
    public House build() {
        return new House(this);
    }
}