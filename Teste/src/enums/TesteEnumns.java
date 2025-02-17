package enums;

public class TesteEnumns {

    public static void main(String[] args) {
        for (EstadosBrasileiro estado: EstadosBrasileiro.values()) {
            System.out.println(estado.getSigla());
        }

        EstadosBrasileiro SP = EstadosBrasileiro.SAO_PAULO;

        System.out.println("SIGLA: " + SP.getNomeMaiusculo());
    }
}
