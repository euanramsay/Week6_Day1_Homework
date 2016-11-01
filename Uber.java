public class Uber{
  private String name;
  private Passenger[] seat;

  public Uber(String name){
    this.name = name;
    this.seat = new Passenger[4];
  }
  public String getName(){
    return this.name;
  }

public int peopleCount(){

  int counter = 0;

  for (Passenger people : seat) {
    if (people != null){
      counter++;
    }
  }
  return counter;
}

public void pickup(Passenger passenger) {
  if ( seatFull() ) {
    return; 
  }
  int emptySeat = peopleCount();
  seat[emptySeat] = passenger;
}

public boolean seatFull() {
  return peopleCount() == seat.length;
}

public void dropOff() {
  for (int i = 0; i < seat.length; i++) {
    seat[i] = null;
  }
}

}
