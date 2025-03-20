package exericicios.ordenarpessoa;

import java.util.Comparator;

public class ComparatorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa arg0, Pessoa arg1) {
        if (arg0.getHeight() < arg1.getAge()) {
            return -1;
        }
        if (arg0.getHeight() > arg1.getAge()) {
            return 1;
        }
        else {
            return 0;
        }
    }

}
