public class NonSubscribers extends Passenger{

    // determines if we apply a discount coupon of a 10% on the trip cost.
    protected boolean coupon =false;

    public NonSubscribers(){}
    public NonSubscribers(String name, String id, double tripCost, Car reservedCar, boolean coupon) {
        super(name, id, tripCost, reservedCar);
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;}
    public void setCoupon(boolean coupon) {
        this.coupon = coupon;}

    public String reserveAndDisplayInfo(Car car){
        try {
            if (car.getCapacityPassengers() == 0) {
                throw new Exception("capacity is ZERO");
            }
        }catch (Exception e){}
        setReservedCar(car);
            if (coupon){
                double oldPrice = getTripCost();
                setTripCost(getTripCost()-getTripCost()*.1);
                return "Car Code: "+car.getCode()+"\nRoute Price: "+oldPrice
                        +"\nAfter Discount Price: "+getTripCost()+".\n";}
            else
                return "Car Code: "+car.getCode()+"\nRoute Price: "+getTripCost()+".\n";
    }

}
