package facade;

import facade.subsistema1.CrmService;
import facade.subsistema2.CepAPI;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepAPI.getInstance().recuperarCidade(cep);
        String estado = CepAPI.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
