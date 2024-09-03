public class Student {
    int studentID;  
    static String studentName = "Elham Mohammed"; 
   
    public Student(int s) {
        studentID = s; 
    }

    public void studentDetails() {
        int studentMarks = 100; 
        System.out.println("The student ID is: " + studentID);
        System.out.println("The student name is: " + studentName);
        System.out.println("The student Marks is: " + studentMarks);
    }

    public static void main(String[] args) {
        Student student = new Student(1123);
        student.studentDetails(); 
    }
}

