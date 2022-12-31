public class VehicleFactory {

    String vehicleName;

    public VehicleFactory(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Vehicle getVehicle(){
        if (vehicleName == "Car"){
            return new Car();
        }

        return new NullVehicle();
    }
}
