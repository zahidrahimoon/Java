public class MethodOverloading {
    void show(){
        System.out.println("This is a method without any parameter");
    }
    void show(int a){
        System.out.println("This is a method with one parameter");
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.show();
    }
}
