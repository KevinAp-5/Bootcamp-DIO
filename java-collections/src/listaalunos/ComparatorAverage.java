package listaalunos;

import java.util.Comparator;

public class ComparatorAverage implements Comparator<Aluno>{

    @Override
    public int compare(Aluno arg0, Aluno arg1) {
        return Double.compare(arg1.getAverage(), arg0.getAverage());
    }

}
