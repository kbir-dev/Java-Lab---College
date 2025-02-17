class Animal {
    Animal() {
        System.out.println("Animal Constructor");
    }
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog Constructor");
    }

    void sound() {
        super.sound(); // Calls Animal's sound() method
        System.out.println("Dog barks");
    }
}
class Mammal extends Animal {
    void type() {
        System.out.println("Mammal is a type of animal");
    }
}
class Poodle extends Mammal {
    void sound() {
        super.sound();
        System.out.println("Poodle yips");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Creating Dog object:");
        Dog dog = new Dog();       
        dog.sound(); 
        System.out.println("\nCreating Poodle object:");
       
        Poodle poodle = new Poodle();  
        poodle.sound(); 
        poodle.type(); 
         System.out.println("Karanbir Singh");
         System.out.println("URN: 2203483");
    }
}