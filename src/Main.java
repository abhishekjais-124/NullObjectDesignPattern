public class Main {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory1 = new VehicleFactory("Car");
        Vehicle vehicle1 = vehicleFactory1.getVehicle();
        System.out.println("Seating capacity of car is "+ vehicle1.getSeatingCapacity());

        VehicleFactory vehicleFactory2 = new VehicleFactory("Bike");
        Vehicle vehicle2 = vehicleFactory2.getVehicle();
        System.out.println("Seating capacity of Bike is "+ vehicle2.getSeatingCapacity()); //Null pointer exception is handled

    }
}