///interface - implementation

public class StudentDriver {
    public static void main (String [] args) {
        //create instances of class
        
        //create student object with the default constructor
        Student s1 = new Student(); //creates student objects, default student, nothing in parameters passed

        Course c1 = new Course("Computer Science II", "CPSC 231", 3);

        //create student w/ overloaded constructor
        Student s2 = new Student("Derek", 19, 67676, "Freshman"); //both instances and objects, but one has information

        Student s3 = new Student("Andy", 18);

        System.out.println("Welcome to" + Student.UNI_NAME);
        System.out.println(s2);
        System.out.println(Student.studentCount);



        // System.out.println(s2.getName());
        // s2.setName("Elizabeth");
        // System.out.println(s2.getName());

        
    }
}