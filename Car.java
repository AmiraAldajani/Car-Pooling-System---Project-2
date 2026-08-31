public class Car {
    private String code;
    private Route route;
    private int capacityPassengers;

    public Car() {}
    public Car(String code, Route route, int capacityPassengers) {
        this.code = code;
        this.route = route;
        this.capacityPassengers = capacityPassengers;}

    public String getCode() {
        return code;}

    public void setCode(String code) {
        this.code = code;}

    public Route getRoute() {
        return route;}

    public void setRoute(Route route) {
        this.route = route;}

    public int getCapacityPassengers() {
        return capacityPassengers;}

    public void setCapacityPassengers(int capacityPassengers) {
        this.capacityPassengers = capacityPassengers;}
}