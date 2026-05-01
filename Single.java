class Vehicle {
    Vehicle() {
        System.out.println("A vehical class");
    }
}
class Car extends Vehicle{
    Car() {
        System.out.println("This vehical is Car");
    }
}

    public class Single {
        static void main(String[] args) {
            Car a = new Car();
        }
    }
