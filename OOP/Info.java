//through Refernce
class Info {
    String name;
    int age;
    String rollNo;
    String subject;
    String teacherName;

    public static void main(String[] args) {
        Info in = new Info();
        in.name = "Zahid Rahimoon";
        in.age = 18;
        in.rollNo = "23-CS-48";
        in.subject = "OOP in Java";
        in.teacherName = "Sir Saleem";
        System.out.println(in.name + " age is " + in.age + " have the roll no " + in.rollNo + " Having the subject of " + in.subject + " under the guidence of " + in.teacherName); 
    }
}
