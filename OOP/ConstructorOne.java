public class ConstructorOne {
    String name = "Zahid";
    int age = 5;
    
    public ConstructorOne(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ConstructorOne cso = new ConstructorOne("Zahid", 18);
        System.out.println("Name: " + cso.name + ", Age: " + cso.age);
    }
}
