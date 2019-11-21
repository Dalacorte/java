import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        double y = entrada.nextDouble();

        System.out.println(x + y);
    }
}