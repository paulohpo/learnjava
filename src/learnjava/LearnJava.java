package learnjava;

/**
 *
 * @author fernando
 */
public class LearnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        percorreArray();
        int x = 5;
        int y = 7;
        condicionalIfElse(x, y);
        condicionalWhile(x, y);
        condicionalDoWhile(x, y);
        repeticaoFor(x, y);
        condicoesRotuladas(x, y);
        arrayDeChar();
    }

    public static void arrayDeChar() {
        char[] letras = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(letras);
        System.out.println(letras[4]);
        for (char c : letras) {
            System.out.println("Character: " + c);
        }
    }

    public static void condicoesRotuladas(int x, int y) {
        System.out.println("Primeiro for: ");
        banana:
        for (int a = 0; a <= x; a++) {
            for (int b = 0; b <= y; b++) {
                if (a == b) {
//                    continue banana;
                    break banana;
                }
                System.out.println("A: " + a + " B: " + b);
            }
        }

        System.out.println("Segundo for: ");

        label:
        for (int a = 0; a <= x; a++) {
            while (x < y) {
                System.out.println("X: " + x + " Y: " + y);
                if (x % y != 0) {
                    continue label;
//                    break label;
                }
                x++;
            }
        }
    }

    public static void repeticaoFor(int x, int y) {
        System.out.println("######### for #########");
        for (int z = x; z <= y; z++) {
            System.out.println("Z: " + z);
        }
        System.out.println("######### for #########");
        System.out.println("######### for com break #########");
        for (int z = x; z <= y; z++) {
            if (z % 2 == 0) {
                break;
            }
            System.out.println("Z: " + z);
        }
        System.out.println("######### for com break #########");
        System.out.println("######### for com continue #########");
        for (int z = x; z <= y; z++) {
            if (z % 2 == 0) {
                continue;
            }
            System.out.println("Z: " + z);
        }
        System.out.println("######### for com continue #########");
    }

    public static void condicionalWhile(int x, int y) {
        while (y < x) {
            System.out.println("X: " + x);
            x = x + 1;
        }
    }

    public static void condicionalDoWhile(int x, int y) {
        do {
            System.out.println("X: " + x + " - Y: " + y);
            x++;
        } while (y < x);
    }

    public static void condicionalIfElse(int x, int y) {
        if (x > y) {
            System.out.println("X é maior que Y!");
        } else if (y > x) {
            System.out.println("Y é maior que X!");
        } else {
            System.out.println("X é igual a Y!");
        }
    }

    public static void percorreArray() {
        double[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x = 0; x < numeros.length; x = x + 2) {
            System.out.println("Posição: [" + x + "] - Valor: " + numeros[x]);
        }
    }

}
