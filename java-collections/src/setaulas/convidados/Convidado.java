package setaulas.convidados;

public class Convidado {
    private String name;
    private int inviteCode;

    @Override
    public String toString() {
        return "Convidado [name=" + name + ", inviteCode=" + inviteCode + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(int inviteCode) {
        this.inviteCode = inviteCode;
    }

    public Convidado(String name, int inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
    }
}
