package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL SANDUICHE NO BALCAO");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO SANDUICHE");
    }
    private void prepararSuco(){
        System.out.println("PREPARANDO SUCO");
    }
    private void prepararCombo(){
        prepararLanche();
        prepararSuco();
    }
    private void selecionarIgredientesLanche(){
        System.out.println("SELECIONANDO PÃO, SALADA, OVO E CARNE");
    }
    public void selecionarIgredientesSuco(){
        System.out.println("SELECIONANDO FRUTA, ÁGUA/LEITE");
    }
    private void lavarIngredientes(){
        System.out.println("LAVANDO IGREDIENTES");
    }
    private void baterSuco(){
        System.out.println("BATENDO SUCO LIQUIDIFICADOR");
    }
    private void fritarIgredienteLanche(){
        System.out.println("FRITANDO A CARNE E O OVO PARA SANDUICHE");
    }
    private void pedirParaTrocarGas (Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIgredientes(Almoxarife almoxarife){
        almoxarife.trocarGas();
    }
}
