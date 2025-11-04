import java.math.BigInteger;
import java.util.Scanner;

public class LatUKL1S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Bilangan Faktorial: ");
        int f = input.nextInt();

        BigInteger faktorial = BigInteger.ONE;

        System.out.print(f + "! = ");

        for (int i = f; i >= 1; i--) {
            faktorial = faktorial.multiply(BigInteger.valueOf(i));
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }

        System.out.println(" = " + faktorial);

        input.close();

    }
}
