public class TestCasting1 {
    public static void main(String[] args) {
        //exemplo 1
        byte a = 1, b = 3;
        byte c = (byte) (a+b);
        System.out.println(c);

        //exemplo 2
        int inteiroA = 1;
        long longB = 3l;

        int inteiroC = inteiroA + (int) longB;
        System.out.println(inteiroC);
    }
}
