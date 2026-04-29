class Vehicle1 {
    Vehicle1() {
        System.out.println("This is a Vehicle");
    }
}
class Fourwheeler extends Vehicle1{
    Fourwheeler() {
        System.out.println("This is a FourWheeler Vehicle");
    }
}
class Car1 extends Fourwheeler{
    Car1() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}

public class Multilevel {
    static void main(String[] args) {
        Car obj = new Car();
    }
}
