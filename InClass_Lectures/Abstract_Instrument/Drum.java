public class Drum extends Instrument{

    // member vars
    protected int pieces;
  
    // default constructor
    public Drum(){
      super();
      this.pieces = 4;
    }
  
    // fully specified overloaded constructor
    public Drum(String name, String origin, double price, int pieces){
      super(name, origin, price);
      this.pieces = pieces;
    }

    // accecssor
    public int getPieces(){
      return this.pieces;
    }

    public void setPieces(int pieces){
      this.pieces = pieces;
    }
  
    // to string method
    public String toString(){
      String s = "";
      s += super.toString();
      s += "The number of pieces is: " + this.pieces;
      return s;
    }

    @Override 
    public void play() {
      System.out.println("Drum noises");
    }
  }