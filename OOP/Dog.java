public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Tomo", "American");
        dog1.displayInfo();

        dog1.setName("Tommy");
        dog1.setBreed("Australian");
        System.out.println("Updated info for dog1:");
        dog1.displayInfo();

        Dog dog2 = new Dog("Shomo", "Russian");
        dog2.displayInfo();

        dog2.setName("Shommy");
        dog2.setBreed("German");
        System.out.println("Updated info for dog2:");
        dog2.displayInfo();
    }
}