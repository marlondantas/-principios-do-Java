public class ArrayLenthDois {
    public static void main(String[] args) {
        /**
         * Array unidimensional 
         */
        String[] cursos;
        cursos = new String[2];

        cursos[0] = "Sistemas";
        cursos[1] = "Internet";

        /**
         * Array multidimensional
         */
        double[][] notas = new double[2][4];

        notas[0][0] = 8.0;
        notas[0][1] = 7.5;
        notas[0][2] = 9.0;
        notas[0][3] = 8.5;
        notas[1][0] = 9.5;
        notas[1][1] = 8.5;
        notas[1][2] = 8.0;
        notas[1][3] = 9.0;

        double[] medias = new double[2];
        double media = 0;
        System.out.println("Notas:");

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println( "["+i + "] e [" + j + "] = " + notas[i][j]);
                media += notas[i][j];
            }
        
        medias[i] = media/4;
        media = 0;
        System.out.println(cursos[i] + " = " + medias[i]);
        }

        System.out.println("FIM");

    }
}
