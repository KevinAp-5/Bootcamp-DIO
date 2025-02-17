package main.estruturas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

public class EstruturasDados {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("python");
        lista.add("c++");
        System.out.println("Arraylist de string: " + lista);
        System.out.println("-----------------");

        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("java", 1);
        mapa.put("python", 2);
        mapa.put("c++", 3);
        System.out.println("Hashmap: " + mapa);
        System.out.println("-----------------");

        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("java");
        conjunto.add("python");
        conjunto.add("java"); // não será adicionado pois é duplicado
        System.out.println("HashSet: " + conjunto);
        System.out.println("-----------------");

        Vector<String> vetor = new Vector<>();
        vetor.add("java");
        vetor.add("python");
        vetor.add("C++");
        System.out.println("Vector: " + vetor);
        System.out.println("-----------------");

    }
}
