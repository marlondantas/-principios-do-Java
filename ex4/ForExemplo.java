public class ForExemplo {
    public static void main(String[] args) {
        
        System.out.println("-----------------------------\n");
        System.out.println("Forma: 1  valor inicial para X=10 declarado externamente");
    
        int x = 10;
        for (;x<=20;x++) {
            System.out.println("Intervalo aleatorio e fracionario para X entre 10 e 20: " + Math.random() * x);
        }
    
        System.out.println("-----------------------------\n");
        System.out.println("Forma: 2  condicional controlada no final do loop por if X>25");
        for(x=20;;x++){
            System.out.println("Intervalo aleatorio e fracionario para x entre 20 e 25: "+Math.random() * x);
            if (x>25) {
                break;
            }
        }
    
        System.out.println("-----------------------------\n");
        System.out.println("Forma: 3  incremento controlado no acumulador de comando x++");

        for (x=1;x <=10;) {
            System.out.println("Intervalo aleatorio e fracionario para x entre 1 e 10: "+ Math.random() * x);
            x++;
        }

        System.out.println("-----------------------------\n");
        System.out.println("Forma: 4  aninhmaneto de for para os acumuladores x e y");

        int y = 1;
        for (x=1;x<=10;x++) {
            for(;y<=5;y++){
                System.out.println("Valor icrementado de 1 em 1 para y entre 1 e 5: " + y);
            }
            System.out.println("Intervalo aleatorio e fracionario para x entre 1 e 10: "+ Math.random() * x);

        }

        System.out.println("-----------------------------\n");
        System.out.println("Forma: 5 decremento de 5 em 5 para x");

        for (x = 50; x>=5; x-=5) {
            System.out.println("Valor decrescente de 5 em 5 para x entre 50 e 5: "+x);
        }
    }    
}
