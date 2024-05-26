class  Animal {
    void makeSound(){
        System.out.println("The Animal Voices");
    }
}
class  Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("The Dog Voices");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("The Cat Voices");
    }
}
public class Ani {
    public static void main(String[] args) {
       Animal myDog = new Dog();
       Animal myCat = new Cat();

       myDog.makeSound();
       myCat.makeSound();
    }
}