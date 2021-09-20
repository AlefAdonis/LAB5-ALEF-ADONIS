package biblitex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformaTextoTest {

    @Test
    void transforma() {
        TransformaTexto tt = new TransformaTexto();
        assertEquals("oi como vai", tt.transforma("clean","oi, como vai?"));
    }

    @Test
    void transformaCamelCase() {
        TransformaTexto tt = new TransformaTexto();
        assertEquals("Oi, CoMo vC VaI?", tt.transforma("CaMeLcAsEfY","oi, como vc vai?"));
    }

    @Test
    void contaTransformacao() {
        TransformaTexto tt = new TransformaTexto();
        tt.transforma("clean","oi, como vai?");
        tt.transforma("CaMeLcAsEfY","oi, como vc vai?");
        assertEquals(2, tt.contaTransformacao());
    }

    @Test
    void historico() {
        TransformaTexto tt = new TransformaTexto();
        tt.transforma("clean","oi, como vai?");
        tt.transforma("CaMeLcAsEfY","oi, como vc vai?");
        assertEquals("oi, como vai? -> clean -> oi como vai", tt.historico(0));
    }

    @Test
    void listarOriginais() {
        TransformaTexto tt = new TransformaTexto();
        tt.transforma("clean","oi, como vc vai?");
        tt.transforma("clean", "Oi, como vc vai?");
        assertEquals("oi, como vc vai?\n" + "Oi, como vc vai?", tt.listarOriginais());
    }
}