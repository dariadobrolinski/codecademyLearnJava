// simple calculator class
public class Calculator {

public static void main(String[] args) {
  Calculator myCalculator = new Calculator();
  System.out.println(myCalculator.add(5,7));
  System.out.println(myCalculator.subtract(45, 11));
  System.out.println(myCalculator.multiply(8, 3));
  System.out.println(myCalculator.divide(12, 5));
  System.out.println(myCalculator.modulo(15, 6));
  }
  
  public Calculator() {}

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public double divide(double a, double b) {
    return a / b;
  }

  public int modulo(int a, int b) {
    return a % b;
  }

}