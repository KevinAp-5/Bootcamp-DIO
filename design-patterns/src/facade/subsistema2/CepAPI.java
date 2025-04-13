package facade.subsistema2;

public class CepAPI {

    private static CepAPI instance = new CepAPI();

    private CepAPI() {
    }

    public static CepAPI getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "Matão";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
