public class Main {

  public static void main(String[] args) {
    float number = 3.14f;
    float decimalPart = number % 1;
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
