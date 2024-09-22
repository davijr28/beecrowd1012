import java.util.Scanner;
public class Beecrowd1012 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        float A,B,C,triangle,circle,trapezium,square,rectangle;
        String numeros;
        String[] partes;
        
        //ler sequência e armazenar em string
        numeros = leitor.nextLine();
        
        //separar os valores armazenados
        partes = numeros.split(" ");
        
        //atribuir os valores às variáveis
        A = Float.parseFloat(partes[0]);
        B = Float.parseFloat(partes[1]);
        C = Float.parseFloat(partes[2]);
        
        //calcular as áreas
        triangle = (A*C/2);
        circle = (float) (3.14159*Math.pow(C,2));
        trapezium = ((A+B)*C)/2;
        square = (float) Math.pow(B,2);
        rectangle = A*B;
        
        //mostrar o resultado no console
        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", triangle,circle,trapezium,square,rectangle);
    }
}