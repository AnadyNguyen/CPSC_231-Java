// Guitar is a derived class from base class Instrument
// A child class from parent child Instrument
// **most important: Guitar IS an Instrument - yes
//can now use inheritance

//extends keyword tells Java we are using inheritance
public class Guitar extends Instrument{ //establishing parent/child relationship
  protected int strings; // number of strings 

  public Guitar(){ //default constr
    super(); 
    this.strings = 6;
    //duplicate code with access, don't want to rewrite code already defined in base class
    //call to base class default constructor
    //call to super MUST be FIRST line in constructor
    //when Java sees this, jump to Instrument, execute Instrument constructor, and then execute this constructor
  }

  public Guitar(String name, String origin, double price, int strings){
    super(name, origin, price); //call to base class overloaded construct, have to match overloaded constructor
    this.strings = strings;
  }


  public int getStrings(){
    return this.strings;
  }

  @Override //protection mechanism, Tells Java this method is intended to override a parent method (Instrument)
  public String toString(){ //want to print ALL of instrument information, plus # of strings
    String s = "";
    //start with empty string, pull all info in base class (Instrument)
    s += super.toString(); //call to base class toString method
    s += "\nThe number of strings is:" + this.strings;
    return s;
  }
  

  /*
  METHOD OVERRIDING
     - a child class provides its own implementation of a method inherited from a parent class
     - requirements: same name, same parameters, same return type. Same everything except inside functionality
  */

  @Override //will work without this, but nice flag to compiler
  public void play() { //overriding method in base class to be more specific
    System.out.println("Guitar noises");
  }

  //not to be confused w/ method overloading
  //difference is same name and different parameters
  public void play(String s) { //user would pass a string and that would play
    System.out.println("Nice sounds we can sing along to");
  }

}
  