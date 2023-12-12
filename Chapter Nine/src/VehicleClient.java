public class VehicleClient {
    public static void main(String[] args) {
        Truck vehicle1 = new Truck("Ford F-150", "Blue", 5000, 2018, 10000);
        Minivan vehicle2= new Minivan("Honda Odyssey", "Red", 4000, 2017, 8);
        Car vehicle3 = new Car("Toyota Camry", "Black", 3000, 2016, 4);

        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());
        System.out.println(vehicle3.toString());
        System.out.println("Vehicle 1's towing capacity is " + vehicle1.getTowingCapacity());
        System.out.println("Vehicle 2's seating capacity is " + vehicle2.getSeatingCapacity());
        System.out.println("Vehicle 3's engine capacity is " + vehicle3.getEngineCapacity());
    }
}
