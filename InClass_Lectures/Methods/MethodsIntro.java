public class MethodsIntro {


    //void method - no return type (method definition)
    public static void printGPA(double grade1, double grade2, double grade3) {
        double gpa = (grade1 + grade2 + grade3)/3;
        System.out.println("The GPA is: " + gpa);
    }

    //non-void method - return a double (method definition)
    public static double returnGPA(double grade1, double grade2, double grade3) {
        double gpa = (grade1 + grade2 + grade3)/3;
        return gpa; //Java makes sure the return type is the same type that methods is declared
    }


    public static void main(String[] args) { //main itself is a method
        //no action unless methods are called
        //let's call a void method

        printGPA(2,4,2);

        //call a non-void method
        //either store it and print variable
        //or call it in the print statement
        double gpa = returnGPA(2,4,2);
        System.out.println("The GPA is: " + gpa);
        System.out.println("The GPA is: " + returnGPA(2,3,4));
    }

}