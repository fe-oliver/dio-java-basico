public class Logicos {
    public static void main(String[] args) {
        // A tabela de lógica. Para conções E e OU
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condicoes sao verdadeiras."); // amnbas preciosam ser por ser E
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condicoes é verdadeira"); // se 1 OU 2 for verdadeira irá executar
        }


    }
}
