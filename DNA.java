public class DNA {
  
  public static void main(String[] args) {
  // DNA Sequencing
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna1;

    int start = dna.indexOf("ATG");
    int stop = dna.indexOf("TGA");

    if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
      String protein = dna.substring(start, stop + 3);
      System.out.println("Protein: " + protein);
      } else {
      System.out.println("No protein.");
    }
  }
  
}
