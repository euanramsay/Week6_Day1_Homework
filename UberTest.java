import static org.junit.Assert.assertEquals;
import org.junit.*;

public class UberTest{
  Uber uber;
  Passenger passenger;

  @Before 
  public void before() {
    uber = new Uber("John");
    passenger = new Passenger();
  }

  @Test
  public void hasName(){
    assertEquals( "John", uber.getName()); 
  }

  @Test
  public void seatsStartEmpty() {
    assertEquals(0, uber.peopleCount());
  }

  @Test
  public void canPickupPassenger() {
    uber.pickup(passenger);
    assertEquals(1, uber.peopleCount());
  }

  @Test
  public void cantPickupWhenSeatIsFull(){
    for (int i = 0; i < 4; i++){
      uber.pickup(passenger);
    }
    assertEquals(4, uber.peopleCount());
  }

  @Test
  public void seatIsFull(){
    for (int i = 0; i < 5; i++) {
      uber.pickup(passenger);
    }
    assertEquals(true, uber.seatFull());
  }

}