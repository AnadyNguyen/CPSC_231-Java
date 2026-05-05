public class Instrument {


     //all Instruments will have these properties
     //use protected access specifier to allow for inheritance
     //use protected so any of the intrument's children/derived classes can have direct access

     protected String m_name;
     protected String m_origin; 
     protected double m_price; 

     public Instrument(){
          m_name = null; 
          m_origin = null; 
          m_price = -1.0; 
     }

     public Instrument (String n, String o, double p){ //default
          m_name = n;
          m_origin = o;
          m_price = p;
     }

     public Instrument (Instrument i){ //overloaded
          m_name = i.m_name;
          m_origin = i.m_origin;
          m_price = i.m_price;
     }

     public String getName(){ 
     return m_name;
     }

     public String getOrigin(){
     return m_origin;
     }

     public double getPrice(){
     return m_price;
     }

     public String toString(){
          String s = "";
          s += "This object is an instrument: " + "\n";
          s += "\tName: " + m_name + "\n";
          s += "\tOrigin: " + m_origin + "\n";
          s += "\tPrice: " + m_price + "\n";
          return s;
     }

     //can do super.equals() as well
     public boolean equals (Instrument i){
          return (m_name.equals(i.m_name) && m_origin.equals(i.m_origin) && m_price == i.m_price);
     }

     public void play() {
          System.out.println("Noise... la la la, fah, fah, fah"); 
     } 
}