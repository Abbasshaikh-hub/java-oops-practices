// It is Hierarchical
class Animal {
    void sound() {
        System.out.println("Animal make a sound");
    }
}

class Dog extends Animal{
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meao");
    }
}
class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}

public class Inheritance{
    public static void main() {
//        Animal a = new Animal();
        Animal a;
        a = new Animal();
        a.sound();

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

        a = new Dog();
        a.sound();

    }
}