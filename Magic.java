public class Magic {
	public static void main(String[] args) {
    int myNumber = 12;
    int stepOne = myNumber * myNumber;
    int stepTwo = myNumber + stepOne;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    System.out.println(stepSix);
	}
}