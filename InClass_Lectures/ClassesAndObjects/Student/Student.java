//blueprint
public class Student {


    /*
    static - means it is shared across ALL instances
    Will belong to class, not an individual object

    final - constant per object, cannot be changed
    constants - pi, etc...

    static final - constant shared across all instances and cannot be changed
    */

   public static int studentCount = 0; //across entire Student Class, mem variables are one copy per object
   //shared across all instances
   public static final String UNI_NAME = "Chapman University"; // don't need to give each individual student the UNI_NAME object, 
   // no mutator, capitalize, 
   //constant for all students, same school for every student, cannot be changed

    //m variables (attributes)
    private String m_name;
    private int m_age;
    private int m_sid;
    private String m_level;
    private Course m_course;
    // private final String m_dob;


    //constructor
    public Student(){ //if made final, can't changed
        //default values
        m_name = "";
        m_age = -1;
        m_sid = 0;
        m_level = "";
        m_course = null;
        studentCount++;
    }

    //Overloaded constructors
    public Student(String name, int age, int sid, String level) { //know info upfront
        m_name = name; //parameter passed to name, name is assigned to m_name, updates m_name
        m_age = age;
        m_sid = sid;
        m_level = level;
        studentCount++;
    //fully specified constructor because pass every member variable
    }

    //can have more than one overloaded constructor
    public Student(String name, int age) { //only know some information
            m_name = name; 
            m_age = age;
            m_sid = 0; //default values for
            m_level = ""; //unkonwn variables
            studentCount++;
    }

    //Accessors (getters) - will be public, anybody outside of class can get information
    public String getName() { //all public, return Type, getWhateverVarible
        return m_name;
    }

    public int getAge() { //all have structure and look same
        return m_age;
    }

    public int getSID() { //getting information
        return m_sid;
    }
    
    public String getLevel() { 
        return m_level; 
    }

    //Mutators(setters) - allow us to update the value of a m variable
    //all m variables are private, when outside of class/file, we do not have access
    //for outside the class, we have to use accessors

    public Course getCourse(){
        return m_course;
    }

    public void setName(String name) {//public void(no return, just update)
        m_name = name;
    } 

    public void setAge(int age) {
        m_age = age;
    }

    public void setSID(int sid) {
        m_sid = sid;
    }

    public void setLevel(String level) {
        m_level = level;
    }

    public void setCourse(Course course) {
        m_course = course;
    }

    //toString Method - allows us to visualize/"pretty" print an object
    public String toString(){//no parameters
        //decide visualization
        String s = "";
        s += "Name: " + m_name + "\n"; //concatenate
        s += "Age: " + m_age + "\n";
        s += "SID: " + m_sid + "\n";
        s += "Level: " + m_level + "\n";
        s += m_course.toString();
        return s;
    } 

    public boolean equals(Student s) { //pass Student Object - see if the one we're looking at is the same as the one being passed
        return(getSID() == s.getSID());
    }

}