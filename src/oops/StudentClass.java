package oops;

public class StudentClass {

    // Create new datatype- Student class
    public static class  Student{
        String name;
        int rollNo;
        double percent;

    }
    public static void main(String[] args){

        // Create object of Student class
        Student prince = new Student();
        prince.name = "PRINCE TOMAR";
        prince.rollNo = 120301;
        prince.percent = 80.0;

        System.out.println("Student name is : "+prince.name);

    }
}
