public class Droid {

  public static void main(String[] args) {
    Droid codey = new Droid("Codey"); 
    System.out.println(codey);
    codey.performTask("Dancing");
  }

  int batteryLevel; 
  String name;

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public String toString() {
    return "Hello, I'm the droid: " + name + "!";
  }

  public void performTask(String task) {
    System.out.println("Codey is performing task: " + task);
    batteryLevel -= 10;
  }

}