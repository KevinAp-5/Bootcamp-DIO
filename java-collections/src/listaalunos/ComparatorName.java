package listaalunos;

import java.util.Comparator;

public class ComparatorName implements Comparator<Aluno>{

    @Override
    public int compare(Aluno arg0, Aluno arg1) {
        return arg0.getName().compareTo(arg1.getName());
    }

}
