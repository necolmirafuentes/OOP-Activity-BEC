public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", 2022, 4); // Provide the correct number of arguments

        myCar.start(); // Calls the overridden start method
        myCar.accelerate(); // Calls the method in the derived class
        myCar.stop();
    }
}