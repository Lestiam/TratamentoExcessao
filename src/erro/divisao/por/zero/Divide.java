package erro.divisao.por.zero;

public class Divide {
    public static void main(String[] args) {
        int dividendo = Integer.parseInt ("1");
        int divisor = Integer.parseInt ("0");

        try {//se não fosse esse try catch iria dar a Exception "ArithmeticException"
            divide(dividendo, divisor);
        } catch (ArithmeticException e) {
            System.out.println("Não pode dividir por zero!");
        }

    }
    public static void divide(int dividendo, int divisor) {
        System.out.println("Divisão = " + (dividendo / divisor));
    }
}
