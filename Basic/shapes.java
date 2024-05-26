class Shape {
    void draw(){
        System.out.println("These are the Shape");
    }
}

class  circle extends Shape{
    @Override 
    void draw(){
        System.out.println("this is cricle");
    }
}
class  triangle extends Shape{
    @Override 
    void draw(){
        System.out.println("this is triangle");
    }
}   
class  rectangle extends Shape{
    @Override 
    void draw(){
        System.out.println("this is rectangle");
    }
}
class  square extends Shape{
    @Override 
    void draw(){
        System.out.println("this is square");
    }
}

public  class shapes{
    public static void main(String[] args) {
        Shape s1 = new circle();
        Shape s2 = new triangle();
        Shape s3 = new rectangle();

        s1.draw();
        s2.draw();
        s3.draw();
    }
}

