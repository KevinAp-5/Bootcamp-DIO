package cadastroprodutos;

import java.util.Comparator;

public class ComparatorName implements Comparator<Produto>{

    @Override
    public int compare(Produto arg0, Produto arg1) {
        return arg0.getName().compareTo(arg1.getName());
    }

}
