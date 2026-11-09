import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioTest {

    @Test
    void deveContarQuartosOcupadosPousada() {
        Pousada pousada = new Pousada(
                new Quarto(101, true),
                new Quarto(102, true),
                new Quarto(103, false),
                new Quarto(104, true)
        );
        assertEquals(3, Relatorio.contarQuartosOcupadosPousada(pousada));
    }

    @Test
    void deveContarTotalQuartosPousada() {
        Pousada pousada = new Pousada(
                new Quarto(101, true),
                new Quarto(102, true),
                new Quarto(103, false),
                new Quarto(104, true)
        );
        assertEquals(4, Relatorio.contarTotalQuartosPousada(pousada));
    }

}
