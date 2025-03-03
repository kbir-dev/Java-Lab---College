class Animal {
    // Method in the superclass
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound method in the subclass
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    // Overriding the makeSound method in the subclass
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Creates an Animal object
        Animal myDog = new Dog();       // Creates a Dog object
        Animal myCat = new Cat();       // Creates a Cat object

        myAnimal.makeSound();  // Calls the method from the Animal class
        myDog.makeSound();      // Calls the overridden method from the Dog class
        myCat.makeSound();      // Calls the overridden method from the Cat class
    }
}