public class Student2 {
    int studentID;  
    static String studentName = "Elham Mohammed"; 

    
    public Student2(int s) {
        studentID = s;
    }

    public static void studentDetails(Student2 student) {
        int studentMarks = 98; 
        System.out.println("The student ID is: " + student.studentID);
        System.out.println("The student name is: " + studentName);
        System.out.println("The student Marks is: " + studentMarks);
    }

    public static void main(String[] args) {
        Student2 student = new Student2(1123);
        studentDetails(student); 
    }
}
