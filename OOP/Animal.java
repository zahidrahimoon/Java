class Animal {
    public void eat(){
        System.out.println("buzo eatting");
    }

    public void bark(){
        System.out.println("buzo barking");
    }

    public void sleep(){
        System.out.println("buzo sleeping");
    }
    public static void main(String[] args) {
        Animal buzo = new Animal();
        buzo.eat();
        buzo.bark();
        buzo.sleep();
    }    
}
