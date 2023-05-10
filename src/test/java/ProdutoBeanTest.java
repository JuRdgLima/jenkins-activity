import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoBeanTest {

        ProdutoBean produto1 = new ProdutoBean(UUID.randomUUID().toString(), "Tanqueray", "Bebida alcoólica", 105.5, "SP");
        ProdutoBean produto2 = new ProdutoBean(UUID.randomUUID().toString(), "Red bull", "Bebida", 7.0, "SP");

    @Test
    public void deveriaRetornarUm() {
        int result = produto1.compareTo(produto2);
        assertEquals(result, 1);
    }

    @Test
    public void deveriaRetornarMenosUm() {
        int result = produto2.compareTo(produto1);
        assertEquals(result, -1);
    }

    @Test
    public void deveriaRetornarMenosZero() {
        produto1.setValor(7.0);
        int result = produto1.compareTo(produto2);
        assertEquals(result, 0);
    }

}
