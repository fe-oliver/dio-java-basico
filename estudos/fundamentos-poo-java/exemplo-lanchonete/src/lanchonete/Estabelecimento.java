package lanchonete;

import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.area.cliente.Cliente;


public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam ficar disponivel para toda a aplicação

        //ações que o estabelecimento precisa ter ciencia
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();

        //ações que nao precisam estar disponiveis para toda app

        //ações que somente o seu pacote cozinha precisa conhecer (default)

        Atendente atendente = new Atendente();
        atendente.servindoMesa();
        atendente.receberPagamento();
        //ações que somente o seu pacote cozinha precisa conhecer (default)

        Cliente cliente = new Cliente();
        cliente.fazerPedido();
        cliente.escolherLanche();
        cliente.pagarConta();

        //não deveria, mas o estabelecimento ainda não definiu normas de atendimento

        //esta ação é sigilosa que tal ser privada?

        //privada, os clientes não precisam saber

        
    }
}
