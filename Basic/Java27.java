public class Java27 {
    
    static class Employee {
        int id;
        String name;
        public void PrintDetails(){
            System.out.println("My Id is " + id);
            System.out.println("My Name is " + name);
        }
    }

    public static void main(String[] args) {
        Employee Zahid = new Employee();
        Zahid.id = 1;
        Zahid.name = "Zahid Ali Rahimoon";

         Zahid.PrintDetails();
    }
}
