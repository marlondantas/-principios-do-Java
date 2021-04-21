//package ex5;
public class ArrayCopy {
    public static void main(String[] args) {
        char[] nomeCurso = {'S','I','S','T','E','M','A'};
        
        char[] codCurso = new char[4];

        System.arraycopy(nomeCurso, 0 , codCurso, 0, 4);

        System.out.println(new String(codCurso));
    }
}
