public class Hangar {

    public static void main(String[] args) {
        Car car = new Car("Merco", 22000);
        Boat boat = new Boat("Titanic", 10000);
        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
