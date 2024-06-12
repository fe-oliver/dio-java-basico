public class Aritmeticos {
    public static void main(String[] args) {
        // SOMA e CONCATENACAO EM ITERACAO
        String concatenacao = "?";

        concatenacao = 1+1+1+"1"; // realizou a soma do que era numero, ao detectar o caractere, ele concatena

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao); // quando ele detecta um char ele deixa de somar e passa a CONCATENAR

        //concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

       //concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        //valores negativos e do negativo p/ positivo
        int numero = 5;
        numero = - numero;
        System.out.println(numero);

        numero = numero * -1; //o + operador aritmetico de soma e nõo converte sinal
        System.out.println(numero);

        // Incremento de numeros FLUXO REPETICAO 

        //numero++;  é o mesmo que numero +1 e -- para -1
        System.out.println(--numero); // se o operador estiver no incio, a impressão ja estará modificada
        System.out.println(numero); // se o operador está na frente, por ultimo, a variavel antes da operação será impressa
      
        // MAIOR QUE MENOR QUE + verdadeiro
        int numero1 = 1;
        int numero2 = 2;
        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira. O primeiro é menor que o segundo.");
        }
    }
}
