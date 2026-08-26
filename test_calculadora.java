import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class test_calculadora {

    private final Calculadora calc = new Calculadora();

    @Test
    public void testSoma() {
        assertEquals(5, calc.soma(2, 3));
    }

    @Test
    public void testSubtracao() {
        assertEquals(1, calc.subtracao(4, 3));
    }

    @Test
    public void testMultiplicacao() {
        assertEquals(6, calc.multiplicacao(2, 3));
    }

    @Test
    public void testDivisao() {
        assertEquals(2, calc.divisao(6, 3));
    }
}
