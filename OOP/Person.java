//1. Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
class Person{
    private  String name;
    private int age;
    Person(String name , int age){
        this.name = name;
        this.age = age;
    }
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    int getAge() {
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String [] args){
        Person p1 = new Person("Zahid" , 18);
        p1.displayInfo();

        Person p2 = new Person("Sardar" , 16);
        p2.displayInfo();
    }
}