public class Main {

  public static void main(String[] args) {
    double number = 3.14;
    float decimalPart = (float) (number % 1);
    int integerPart = (int) number;

    System.out.println(
      "La variable de tipo float tiene un valor de " +
      number +
      ", su parte entera es " +
      integerPart +
      ", mientras que su parte decimal es " +
      decimalPart
    );
  }
}
