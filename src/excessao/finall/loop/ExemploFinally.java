package excessao.finall.loop;

import java.util.Scanner;

public class ExemploFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividendo, divisor = 1;
        do {
            try {


                System.out.print("\nDigite o valor do dividendo: ");
                dividendo = sc.nextInt();
                System.out.print("Digite o valor do dividor: ");
                divisor = sc.nextInt();

                if (divisor == 0) {
                    throw new Exception("Não é possível fazer uma divisão por zero!");
                }

                System.out.println(dividendo + " / " + divisor + " = " + (dividendo / divisor));
                //Calcula();
            } catch (Exception ex) {
                System.out.println("ERRO " + ex.getMessage());
            } finally {
                System.out.printf("Bloco finally.");
            }
        } while (divisor == 0);


    }
}
