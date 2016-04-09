package learnjava.calculadora;

/**
 *
 * @author fernando
 */
public interface Calculavel {

    double somar(double... numeros);

    double subtrair(double... numeros);

    double dividir(double... numeros);

    double multiplicar(double... numeros);
    
    double raizQuadrada(double num);
    
    double fatorial(double num);
    
    double fatorialRecursivo(double num);
    
    int[] fibonnaci();
}
