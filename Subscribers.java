public class Subscribers extends Passenger{


    // MINUS CAPACITY WHEN BOOKING
    //50% discount on a reserved car.
    protected final double discount = 0.5;

    public Subscribers(){}
    public Subscribers(String name, String id, double tripCost, Car reservedCar) {
        super(name, id, tripCost, reservedCar);
    }

    public String reserveAndDisplayInfo(Car car){
        setReservedCar(car);
        double oldPrice = getTripCost();
        setTripCost(getTripCost()*discount);
        return "Car Code: "+car.getCode()+"\nRoute Price: "+oldPrice
                +"\nAfter Discount Price: "+getTripCost()+".\n";
    }
}
