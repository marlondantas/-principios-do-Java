public class SwitchSimples {
    public static void main(String[] args) {
        char indice  = 'B';
        String resultado = "";
        switch (indice) {
            case 'A':
                resultado += 'a';
            case 'B':
                resultado += 'b';
            case 'C':
                resultado += 'c';
            default:
                resultado += 'd';
        }

        System.out.println(resultado);
    }
}
