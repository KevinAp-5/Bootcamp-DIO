package mapexercicios.estoque;

import java.util.Comparator;

public class ComparatorValor implements Comparator<Double>{

    @Override
    public int compare(Double a, Double b) {
        return Double.compare(a, b);
    }

}
