// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    int numero1 = 8;
    int numero2 = 9;
    int numero3 = 7;

    int numero4 = 4;
    int numero5 = 5;
    int numero6 = 6;

    double media1 = (numero1+numero2+numero3)/3;
    double media2 = (numero4+numero5+numero6)/3;

    System.out.println("Média das notas");
    System.out.println("A média do primeiro conjunto de notas  " + numero1 + " " + numero2 + " " + numero3 + " é " + media1);
    System.out.println("A média do segundo conjunto de notas " + numero4 + " " + numero5 + " " + numero6 + " é " + media2);
    System.out.println("A soma das médias " + (media1 + media2));
    System.out.println("A média das médias " + ((media1 + media2)/2) + "\n");
    //System.out.println("Hello world!");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}