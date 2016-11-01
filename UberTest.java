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
}