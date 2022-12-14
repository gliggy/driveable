public class DebugDriver implements Driveable {
  //make drive print its inputs
  public void drive(double xvel, double yvel, double omega) {
    System.out.println("xvel: " + xvel);
    System.out.println("yvel: " + yvel);
    System.out.println("omega: " + omega);
  }
}
