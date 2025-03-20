package setaulas.convidados;

import java.util.HashSet;
import java.util.Set;

public class ListaConvidados {
    private Set<Convidado> guests;

    public ListaConvidados() {
        this.guests = new HashSet<>();
    }

    public boolean addGuest(String name, int inviteCode) {
        return guests.add(new Convidado(name, inviteCode));
    }

    public boolean removeGuestByInviteCode(int inviteCode) {
        return guests.removeIf(guest -> guest.getInviteCode() == inviteCode);
    }

    public int countGuests() {
        return guests.size();
    }

    public void showGuests() {
        guests.forEach(System.out::println);
    }
}
