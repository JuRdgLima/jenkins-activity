import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnuncianteBeanTest {

    @Test
    public void deveriaCalcularMediaAnuncios() {
        ProdutoBean produto = new ProdutoBean(
                UUID.randomUUID().toString(), "Tanqueray", "Bebida alcoólica", 110.0, "SP");
        AnuncioBean anuncio = new AnuncioBean(
                produto, null, 20.0);
        AnuncioBean anuncio2 = new AnuncioBean(
                produto, null, 30.0);
        ArrayList<AnuncioBean> anuncios = new ArrayList<>();
        anuncios.add(anuncio);
        anuncios.add(anuncio2);

        AnuncianteBean anunciante = new AnuncianteBean(
                "Ana", "123.456.789.01", anuncios);

        Double result = anunciante.valorMedioAnuncios();
        Double expected = 85.0;

        assertEquals(result, expected);
    }
}
