public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our Car Pooling System!\n ==================================");

        Route homeToHamraMall = new Route("Al Khaleej District","Al Hamra Distrist",20);
        Route homeToUni = new Route("Al Khaleej District","Kind Saud University Gate 3",62);

        //String code, Route route, int capacityPassengers
        Car car1 = new Car("543-HML",homeToHamraMall,0);
        Car car2 = new Car("230-WPC",homeToUni,2);

        //String name, String id, double tripCost, Car reservedCar
        Passenger asma = new Subscribers("Asma","11464094445",33, car1);
        Passenger amira = new NonSubscribers("Amira","11294059483",40, car2,true);

        System.out.println(asma.reserveAndDisplayInfo(car1));
        System.out.println(amira.reserveAndDisplayInfo(car2));

    }
}