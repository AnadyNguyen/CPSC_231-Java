import java.util.ArrayList;

public class InstrumentDriver{
  public static void main(String[] args) {

		Instrument i = new Instrument("Piano", "U.S.", 99999.99);
    Guitar g = new Guitar("Spanish Guiatr", "Barcelona", 4599.99, 6);
    Drum d = new Drum("Bass Drum", "America", 500.01, 5);

    System.out.println(i); //automatically call toString method, no need to write out i.toString()
    System.out.println("\n" + g);
    System.out.println("\n" + d);
  

    /*POLYMORPHIS
      - means many forms
      - we associate the word with "late binding"
      - at runtime, Java Virtual Machine will determine which method is the appropriate method to call for a specific object
    */

    i.play(); //at this point, overwriting toString method in Instrument.java since this is an Object class
    g.play(); //polymorphism (polymorphic call) - determine best method
    d.play(); //polymorphism (polymorphic call) - determine best method
    System.out.println();

    Instrument i2 = d; //valid because i2 is pointing to a drum object. d is already made, so we point it to a new object
    i2.play();

    // adding objects to a shared collection
    ArrayList<Instrument> al = new ArrayList<Instrument>(); //can leave one of the brackets empty
    al.add(i);
    al.add(g);
    al.add(d);
    al.add(i2);

    for (Instrument x:al) {
      x.play(); //polymorphism - late binding, we add them to collection but when pulled out, play the appropriate play method
    }
	}
}