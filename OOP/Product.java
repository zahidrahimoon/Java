class Result {
    public void Product2() {
        System.out.println("Safeguard");
     }
}
class Product {
    public void ProductOne() {
        System.out.println("Lux");
    }
    public static void  main(String [] args){
            Product p = new Product();
            p.ProductOne();
            Result r = new Result();
            r.Product2();
    }
}
