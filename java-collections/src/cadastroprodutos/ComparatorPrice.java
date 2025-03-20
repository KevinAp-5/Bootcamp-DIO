package cadastroprodutos;

import java.util.Comparator;

public class ComparatorPrice implements Comparator<Produto>{

    @Override
    public int compare(Produto arg0, Produto arg1) {
        return arg0.getPrice().compareTo(arg1.getPrice());
    }

}
