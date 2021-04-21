public class MathSqrt {
    public static void main(String[] args) {
        ///Numero inteiro com raiz perfeita
        int num = 49;

        System.out.println("SQRT: Raiz quadrada de "+ num + " = " + Math.sqrt(num));


        //numero decimal com arredondamento
        double numDecimal = 90;
        System.out.println("SQRT: Raiz quadrada de "+ numDecimal + " = " + Math.sqrt(numDecimal));
        System.out.println("ROUND: O valor arredondado da raiz quadrada de "+ numDecimal + "  = " + Math.round(Math.sqrt(numDecimal)));

        //exponenciacao
        int numElevado = 2;
        System.out.println("exp: valor de E elevado ao quadrado: " + Math.exp(numElevado));
        System.out.println("pow: " + numElevado + " - elevado a quarta = " + Math.pow(numElevado,4));
    }
}
