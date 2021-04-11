public class SwitchBreak {
    public static void main(String[] args) {
        char indice = 'B';
        String resultado = "";


        switch (indice) {
            case 'A':
                resultado += 'a';
                break;
            case 'B':
                resultado += 'b';
                break;
            case 'C':
                resultado += 'c';
                break;
            default:
                resultado += 'd';
                break;
        }

        System.out.println(resultado);
    }
}
