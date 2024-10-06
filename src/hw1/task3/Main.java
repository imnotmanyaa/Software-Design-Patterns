package hw1.task3;

public class Main {
    public static void main(String[] args) {
        House house1 = House.builder()
                .setNumRooms(3)
                .setNumFloors(2)
                .setHasPool(true)
                .setHasGarage(false)
                .build();

        House house2 = House.builder()
                .setNumRooms(5)
                .setNumFloors(3)
                .setHasPool(false)
                .setHasGarage(true)
                .build();

        System.out.println(house1);
        System.out.println(house2);
    }
}
