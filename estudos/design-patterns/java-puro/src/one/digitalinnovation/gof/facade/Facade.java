package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import susbsistema2.cep.CepApi;

public class Facade {

    public void migrarClient(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
