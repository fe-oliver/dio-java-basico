package susbsistema2.cep;


public class CepApi {
    private static CepApi instancia = new CepApi();

    public CepApi(){
        // criar um construtor privado 
        super();
    }
    public static CepApi getInstancia() {
        return instancia;
    }
    public String recuperarCidade(String cep) {
        return "Brasília";
    }
    public String recuperarEstado(String cep) {
        return "DF";
    }
}
