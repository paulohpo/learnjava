package learnjava.calculadora;

/**
 *
 * @author fernando
 */
public class RunCalculadora {

    public static void main(String[] args) {
        double valor1 = 1;
        double valor2 = 2;
        double valor3 = 3;

        System.out.println("Valor1: " + valor1);
        System.out.println("Valor2: " + valor2);
        System.out.println("Valor3: " + valor3);

        Calculadora c = new Calculadora();
        double soma = c.somar(valor1, valor2, valor3);
        System.out.println("Soma: " + soma);

        double subtracao = c.subtrair(valor1, valor2, valor3);
        System.out.println("Subtração: " + subtracao);

        double divisao = c.dividir(valor1, valor2, valor3);
        System.out.println("Divisão: " + divisao);

        double multiplicacao = c.multiplicar(valor1, valor2, valor3);
        System.out.println("Multiplicação: " + multiplicacao);
    }

}
