public class Booleanos {
    public static void main(String[] args) {
        //boolean
        boolean variavel = true;
        variavel = !variavel; //nversão de variavel booleana

        System.out.println(variavel);

        // BOOLEANO TRUE/FALSE comparação igualdade/maior que/menor que
        int numero1 = 1;
        int numero2 = 2;

        // Comparando se o primeiro é igual ao segunda, True/False (é igual/não é)
        boolean simNao = numero1 == numero2;
        System.out.println("O numeroUm é igual a numeroDois? " + simNao);

        // Verificando se é diferente do segundo
        simNao = numero1 != numero2;
        System.out.println("O numeroUm é diferente do numeroDois? " + simNao);

        // O primeiro será maior que o segundo?
        simNao = numero1 > numero2;
        System.out.println("O numeroUm é maior que o numeroDis? " + simNao);

        // O primeiro será menor que o segundo?
        simNao = numero1 > numero2;
        System.out.println("O numeroUm é menor que o numeroDis? " + simNao);

        // Se Verdadeira, a condição será executada!
        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira. O primeiro é menor que o segundo.");
        }


        // COMPARANDO STRING
        String nomeUm = "Fernanda";
        String nomeDois = new String ("Fernanda"); // Dois objetos/textos na memoria
        simNao = nomeUm == nomeDois;

        System.out.println(nomeUm.equals(nomeDois)); // Usando metodo EQUALS

    }
}
