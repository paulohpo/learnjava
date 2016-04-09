package learnjava;

import learnjava.calculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author fernando
 */
public class CalculadoraTest {

    private final Calculadora calculadora;

    public CalculadoraTest() {
        System.out.println("Construtor sendo invocado!");
        calculadora = new Calculadora();
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Método @BeforeClass sendo invocado!");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Método @AfterClass sendo invocado!");
    }

    @Before
    public void setUp() {
        System.out.println("Método @Before sendo invocado!");
    }

    @After
    public void tearDown() {
        System.out.println("Método @After sendo invocado!");
    }

    @Test
    public void testSoma() {
        System.out.println("Somando!");
        Assert.assertEquals(10, calculadora.somar(2, 3, 5), 0);
    }

    @Test
    public void testSubtracao() {
        System.out.println("Subtraindo!");
        Assert.assertEquals(10, calculadora.subtrair(30, 19, 1), 0);
    }

    @Test
    public void testDivisao() {
        System.out.println("Dividindo!");
        Assert.assertEquals(2, calculadora.dividir(100, 10, 5), 0);
    }

    @Test
    public void testMultiplicacao() {
        System.out.println("Multiplicando!");
        Assert.assertEquals(64, calculadora.multiplicar(2, 4, 8), 0);
    }

    @Test
    public void testRaizQuadrada() {
        System.out.println("Raiz Quadrada!");
        Assert.assertEquals(2, calculadora.raizQuadrada(4), 0);
    }
    
    @Test
    public void testFatorial() {
        System.out.println("Fatorial!");
        Assert.assertEquals(120, calculadora.fatorial(5), 0);
    }
}
