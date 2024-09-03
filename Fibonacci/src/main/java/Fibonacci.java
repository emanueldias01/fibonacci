import java.util.Scanner;
public class Fibonacci {

     static int fibonacci(int n) {
        int fibonacci = 0;
        int numeroAnterior = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                fibonacci = 1;
                numeroAnterior = 0;
            } else {
                fibonacci += numeroAnterior;
                numeroAnterior = fibonacci - numeroAnterior;
            }
        }
        return fibonacci;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++){
            int n = fibonacci(i);
            if(n > num){
                System.out.println("Nao está presente na sequencia");
                break;
            }else if (n == num){
                System.out.println("Está presente na sequencia");
                break;
            }

        }
    }
}
