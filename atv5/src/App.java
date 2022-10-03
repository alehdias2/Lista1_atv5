import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
//Faça um Programa que converta metros para centímetros.
Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade em metros");
        double m = sc.nextInt();
        double c = m * 100;
        System.out.println(m +" metros = "+ c + " centimetros");
    }
}
