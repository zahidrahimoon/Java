public class MethodOverOne {
    void show(String a){
        System.out.println("This is a method without any parameter");
    }
    void show(int a){
        System.out.println("This is a method with one parameter");
    }

    public static void main(String[] args) {
        MethodOverOne obj = new MethodOverOne();
        obj.show("abc");
    }
}
