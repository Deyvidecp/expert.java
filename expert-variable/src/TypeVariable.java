public class TypeVariable {
    public static void main(String[] args) throws Exception {

        String primeiroNome = "Maria Liz";
        String segundoNome = "Cavalcanti";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println("Qual o Nome da menina mais Linda?  " + nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return  primeiroNome.concat( " " ).concat(segundoNome);
    }
}

