public class ArrayLenth {
    public static void main(String[] args) {
        double[][] notas = new double[2][4];

        notas[0][0] = 8.0;
        notas[0][1] = 7.5;
        notas[0][2] = 9.0;
        notas[0][3] = 8.5;
        notas[1][0] = 9.5;
        notas[1][1] = 8.5;
        notas[1][2] = 8.0;
        notas[1][3] = 9.0;

        System.out.println("####################################################");

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println( "["+i + "] e [" + j + "] = " + notas[i][j]);
            }
        }

        System.out.println("FIM");
    }
}
                
