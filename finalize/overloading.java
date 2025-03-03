public class overloading {
    static class calculator {

        // Method to add two integers
        public int add(int a, int b) {
            return a + b;
        }

        // Overloaded method to add three integers
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // Overloaded method to add two double values
        public double add(double a, double b) {
            return a + b;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            calculator calc = new overloading.calculator();

            System.out.println(calc.add(5, 10));          // Calls the first add method
            System.out.println(calc.add(5, 10, 15));      // Calls the second add method
            System.out.println(calc.add(5.5, 10.5));      // Calls the third add method
        }
    }
}