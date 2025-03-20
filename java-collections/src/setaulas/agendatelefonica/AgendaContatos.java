package setaulas.agendatelefonica;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {

    private Set<Contato> contacts;

    public AgendaContatos() {
        this.contacts = new HashSet<>();
    }

    public boolean addContact(String name, int number) {
        return contacts.add(new Contato(name, number));
    }

    public void showContacts() {
        contacts.forEach(System.out::println);
    }

    public Set<Contato> findByName(String name) {
        return contacts.stream()
                .filter(x -> x.getName().equalsIgnoreCase(name))
                .collect(Collectors.toSet());
    }

    public boolean updateContactNumber(String name, int newNumber) {
        contacts.removeIf(x -> x.getName().equalsIgnoreCase(name));
        return contacts.add(new Contato(name, newNumber));
    }
}
