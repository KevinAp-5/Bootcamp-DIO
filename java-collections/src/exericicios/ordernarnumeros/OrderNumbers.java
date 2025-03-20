package exericicios.ordernarnumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderNumbers {
    private List<Integer> numbers;

    public OrderNumbers() {
        this.numbers = new ArrayList<>();
    }

    public boolean addNumber(int number) {
        return this.numbers.add(number);
    }

    public void orderAscending() {
        Collections.sort(numbers);
    }

    public void orderDescending() {
        Collections.reverse(numbers);
    }

}
