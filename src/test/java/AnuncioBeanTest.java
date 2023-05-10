import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnuncioBeanTest {

    private ProdutoBean novoProduto1() {
        ProdutoBean produtoBean = new ProdutoBean(UUID.randomUUID().toString(), "Tanqueray", "Bebida alcoólica", 105.5, "SP");

        return produtoBean;
    }

    @Test
    public void deveriaDevolverValorComDesconto() {

        AnuncioBean anuncio = new AnuncioBean(novoProduto1(), null, 20.0);
        Double result = anuncio.getValor();
        Double expected = 85.5;

        assertEquals(result, expected);
    }
}
