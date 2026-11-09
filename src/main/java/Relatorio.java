import java.util.Iterator;

public class Relatorio {

    public static Integer contarQuartosOcupadosPousada(Pousada pousada) {
        int quantidade = 0;
        for (Quarto quarto : pousada) {
            if (quarto.isOcupado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalQuartosPousada(Pousada pousada) {
        int quantidade = 0;
        for (Iterator q = pousada.iterator(); q.hasNext(); ) {
            quantidade++;
            q.next();
        }
        return quantidade;
    }

}
