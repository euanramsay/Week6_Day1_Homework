public class Uber{
  private String name;
  private Passenger[] seat;

  public Uber(String name){
    this.name = name;
    this.seat = new Passenger[5];
  }
  public String getName(){
    return this.name;
  }
}
