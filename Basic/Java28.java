public class Java28 {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0 && age <= 120) { // Assuming a valid age range
            this.age = age;
        } else {
            System.out.println("Invalid age! Age should be between 0 and 120.");
        }
    }

    public static void main(String[] args) {
        Java28 person = new Java28(); 
        person.setName("Zahid");
        person.setAge(18);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
