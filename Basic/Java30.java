public class Java30 {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Java30(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        // Creating an instance of Java30 using the constructor
        Java30 myCar = new Java30("Toyota", "Camry", 2022);

        // Accessing the instance variables using getters
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
    }
}
