package exericicios.intnumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNumeros {
    private List<Integer> numbers;

    public ListaNumeros() {
        this.numbers = new ArrayList<>();
    }

    public boolean addNumber(int number) {
        return this.numbers.add(number);
    }

    public int sumCalc() {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public int findMinInt() {
        return Collections.min(numbers);
    }

    public int findMaxInt() {
        return Collections.max(numbers);
    }

    public List<Integer> returnList() {
        return numbers;
    }
}
