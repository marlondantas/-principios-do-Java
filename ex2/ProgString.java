public class ProgString {
    public static void main(String[] args) {
        System.out.println("\n*** Recomenda-se nao acentura as palavras!***");
        System.out.println("\n==============================================");
        
        String variavelUm = "Sistema";
        String variavelDois = new String("sistema");

        //equals
        System.out.println("Exemplo com o metodo de compracao: equals");
        if(variavelUm.equals(variavelDois)){
            System.out.println("Variaveis são identicas => V1: "+variavelUm + " V2: " +variavelDois);
        } else{
            System.out.println("Variaveis são diferentes => V1: "+variavelUm + " V2: " +variavelDois);
        }

        System.out.println("\n==============================================");

        //equalsIgnoreCase
        System.out.println("Exemplo com o metodo de compracao: equalsIgnoreCase");
        if(variavelUm.equalsIgnoreCase(variavelDois)){
            System.out.println("Variaveis são identicas => V1: "+variavelUm + " V2: " +variavelDois);
        } else{
            System.out.println("Variaveis são diferentes => V1: "+variavelUm + " V2: " +variavelDois);
        }

        System.out.println("\n==============================================");
        
        //Outros metodos
        //indexOf, charAt, substring
        System.out.println("Exemplo com o metodo de compracao: indexOf, charAt, substring");
        String frase = "Desenvolvimento de sistemas";
        System.out.println("\nFrase-exemplo => "+frase);  
        System.out.println("\ncharAt => Posicao da fonte <0> na Frase-exemplo (0 a 26 e com os espacos): "+ frase.charAt(0));
        
        System.out.println("\n==============================================");
        
        //concat
        String tituloUm = "Desenvolvimento", tituloDois = "de Ssitemas";
        String tituloCompleto = tituloUm.concat(tituloDois);
        System.out.println("\nTitula Um: "+ tituloUm);
        System.out.println("\nTitula Dois: "+ tituloDois);
        System.out.println("\nExemplo Concatenado => Titulo um e titulo dois juntos: "+ tituloCompleto);
    }
}
