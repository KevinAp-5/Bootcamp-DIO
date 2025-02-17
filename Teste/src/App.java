import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu primeiro nome: ");
        String nome = scanner.next();

        Map<Character, Integer> contagemCaracteres = new HashMap<>();
        for (char letra: nome.toLowerCase().toCharArray()) {
            contagemCaracteres.put(letra, contagemCaracteres.getOrDefault(letra, 0) + 1);
        }

        System.out.println(contagemCaracteres);
        System.out.println("Caracteres duplicados no nome " + nome + ":");
        for (Map.Entry<Character, Integer> entry: contagemCaracteres.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("'" + entry.getKey() + "' aparece " + entry.getValue() + " vezes");
            }
        }
    }
}
