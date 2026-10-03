public class Car {
    String brand;
    String model;
    double price;

    public Car(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("");
    }

    public static void main(String[] args) {
        Car c1 = new Car("Tesla", "Model 3", 40000);
        Car c2 = new Car("BMW", "M3", 75000);
        Car c3 = new Car("Audi", "R8", 158000);

        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}