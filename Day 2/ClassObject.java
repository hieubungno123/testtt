
public class ClassObject {
    public static void main(String[] args){
        Student Nam = new Student();
        Nam.name = "Nguyen Thanh Nam";
        Nam.Grade = "Grade 7";
        Nam.age = 15;
        Nam.email = "hieubungno";

        System.out.println("Name: " + Nam.name);
        System.out.println(Nam.Grade);
        System.out.println("Tuoi " + Nam.age);
        System.out.println("Email: " + Nam.email);
        Nam.study("Mathematics");
        Nam.doTest("Languages");
    }
}
