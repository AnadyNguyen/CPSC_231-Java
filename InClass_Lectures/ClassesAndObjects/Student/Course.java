public class Course {
   // member variables
   private String m_courseName;
   private String m_courseCode;
   private int m_units;
//Constructor
   public Course(){
       //default values
       m_courseName = "";
       m_courseCode = "";
       m_units = -1;
   }
//Overloaded Constructor
   public Course(String courseName, String courseCode, int units){
       m_courseName = courseName;
       m_courseCode = courseCode;
       m_units = units;
   }
//Accessors
   public String getCourseName(){
       return m_courseName;
   }
   public String getCourseCode(){
       return m_courseCode;
   }
   public int getUnits(){
       return m_units;
   }
//Mutators
   public void setCourseName(String courseName){
       m_courseName = courseName;
   }
   public void setCourseCode(String courseCode){
       m_courseCode = courseCode;
   }
   public void setUnits(int units){
       m_units = units;
   }
   //ToString
   public String courseString(){
       String c = "";
       c += "Course Name: " + m_courseName + "\n";
       c += "Course Code: " + m_courseCode + "\n";
       c += "Units: " + m_units + "\n";
       return c;
   }
   //Equals to
   public boolean equals(Course c){
       return(getCourseName().equals(c.getCourseName()) && getCourseCode().equals(c.getCourseCode()) && getUnits() == c.getUnits());
   }
  
}

