package exericicios.ordenarpessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarPessoa {
    private List<Pessoa> pessoas;

    public OrdenarPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public boolean addPessoa(String name, int age, double height) {
        return pessoas.add(new Pessoa(name, age, height));
    }

    public void orderByAge() {
        Collections.sort(pessoas);
    }

    public void orderByHeight() {
        Collections.sort(pessoas, new ComparatorAltura());
    }
}
