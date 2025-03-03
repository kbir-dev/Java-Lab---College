// A class to demonstrate 'final'
class Example {
    // Final variable (constant)
    final int finalValue = 100;

    final void display() {
        System.out.println("This is a final method. Value: " + finalValue);
    }
}

// A subclass to demonstrate inheritance and overriding
class Child extends Example {
    // Uncommenting this will cause a compile-time error because 'display' is final
    /*
    @Override
    void display() {
        System.out.println("Trying to override final method.");
    }
    */
}

// A class to demonstrate 'finalize'
class Resource {
    private String name;

    public Resource(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println(name + " is being finalized (cleaned up).");
        } finally {
            super.finalize();
        }
    }
}

// Main class to test the concepts
public class Main {
    public static void main(String[] args) {
        Example example = new Example();
        System.out.println("Final value: " + example.finalValue);
        example.display();

        Resource resource = new Resource("Resource1");
        resource = null; 

        System.gc();

        try {
            Thread.sleep(1000); // Wait for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}