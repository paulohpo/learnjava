package learnjava.calculadora;

/**
 *
 * @author fernando
 */
public class Calculadora implements Calculavel {

    @Override
    public double somar(double... numeros) {
        double resultado = 0;
        for (double d : numeros) {
            resultado = resultado + d;
        }
        return resultado;
    }

    @Override
    public double subtrair(double... numeros) {
        double resultado = 0;
        for (int x = 0; x < numeros.length; x++) {
            if (x == 0) {
                resultado = numeros[x];
            } else {
                resultado = resultado - numeros[x];
            }
        }
        return resultado;
    }

    @Override
    public double dividir(double... numeros) {
        double resultado = 0;
        for (int x = 0; x < numeros.length; x++) {
            if (x == 0) {
                resultado = numeros[x];
            } else {
                resultado = resultado / numeros[x];
            }
        }
        return resultado;
    }

    @Override
    public double multiplicar(double... numeros) {
        double resultado = 0;
        for (int x = 0; x < numeros.length; x++) {
            if (x == 0) {
                resultado = numeros[x];
            } else {
                resultado = resultado * numeros[x];
            }
        }
        return resultado;
    }

    @Override
    public double raizQuadrada(double num) {
        return Math.sqrt(num);
    }

    @Override
    public double fatorial(double num) {
        double resultado = 0;
        for (double x = num; x > 0; x--) {
            if (resultado == 0) {
                resultado = num;
            } else {
                resultado = resultado * x;
            }
        }
        return resultado;
    }

    @Override
    public double fatorialRecursivo(double num) {
        if (num != 0) {
            return num * fatorialRecursivo(num - 1);
        } else {
            return 1;
        }
    }

    @Override
    public int[] fibonnaci() {
        int[] sequencia = new int[10];
        for (int i = 0; i < 10; i++) {
            sequencia[i] = fibonnaci(i);
        }
        return sequencia;
    }

    private int fibonnaci(int numero) {
        if (numero < 2) {
            return numero;
        } else {
            return fibonnaci(numero - 1) + fibonnaci(numero - 2);
        }
    }
}
