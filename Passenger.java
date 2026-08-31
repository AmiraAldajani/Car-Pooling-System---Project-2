public abstract class Passenger {

    private String name, id;
    private double tripCost;
    private Car reservedCar;

    public Passenger(){}
    public Passenger(String name, String id, double tripCost, Car reservedCar) {
        this.name = name;
        this.id = id;
        this.tripCost = tripCost;
        this.reservedCar = reservedCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public abstract String reserveAndDisplayInfo(Car car);
}
