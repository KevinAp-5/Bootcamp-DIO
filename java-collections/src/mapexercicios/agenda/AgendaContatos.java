package mapexercicios.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public void addContact(String name, int number) {
        contatos.put(name, number);
    }

    public void removeContact(String name) {
        if (contatos.isEmpty())
            return;

        contatos.remove(name);
    }

    public void printContacts() {
        if (contatos.isEmpty())
            return;

        contatos.forEach((x, y) -> System.out.println(x + ": " + y));
    }

    public Integer findByName(String name) {
        if (contatos.isEmpty())
            return null;
        return contatos.get(name);
    }

}
