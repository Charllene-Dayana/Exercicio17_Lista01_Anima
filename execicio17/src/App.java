
//17. Faça um Programa para uma loja de tintas. 
//O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
//Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e 
//que a tinta é vendida em latas de 18 litros,
//que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;
//misturar latas e galões, de forma que o desperdício de tinta seja menor. 
//Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

//Em progresso
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        double metro;
        double litro;
        double lata;
        double valorl;
        Scanner teclado = new Scanner(System.in);
        System.out.println("qual área a ser pintada");
        metro = teclado.nextDouble();
        litro = metro / 3;
        lata = Math.ceil(litro / 18);
        valorl = lata * 80;
        System.out.println("Area a ser Pintada: " + metro);
        System.out.println("Litros a ser usados: " + litro);
        System.out.println("Latas a Serem compradas: " + lata);
        System.out.println("Valor gasto R$: " + valorl);
        teclado.close();
    }
}
