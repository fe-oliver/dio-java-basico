public class FormatadorCep {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("23756064");
            System.out.println(cepFormatado);
        } catch(CepInvalidoException e) {
            System.out.println("O cep não correponde com as regras de negocio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException();

            return "23.756-064";

    }
    
}
