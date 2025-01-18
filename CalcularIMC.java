import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {

            System.out.println("\n===== Cálculo do IMC =====");
            System.out.println("Este programa calcula o seu Índice de Massa Corporal (IMC).");
            System.out.println("Digite sua altura e peso para obter o resultado.\n");

            System.out.print("Digite sua altura em metros (exemplo: 1,75): ");
            double altura = scanner.nextDouble();

            System.out.print("Digite seu peso em kg (exemplo: 70): ");
            double peso = scanner.nextDouble();

            double imc = peso / (altura * altura);

            System.out.printf("\nSeu IMC é: ", + imc);

            if (imc < 18.5) {
                System.out.println("Classificação: Abaixo do peso.");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Classificação: Peso normal.");
            } else if (imc >= 25 && imc <= 29.9) {
                System.out.println("Classificação: Sobrepeso.");
            } else if (imc >= 30 && imc <= 34.9) {
                System.out.println("Classificação: Obesidade Grau I.");
            } else if (imc >= 35 && imc <= 39.9) {
                System.out.println("Classificação: Obesidade Grau II.");
            } else {
                System.out.println("Classificação: Obesidade Grau III (Mórbida).");
            }


            System.out.print("\nDeseja calcular outro IMC? (sim/não): ");
            continuar = scanner.next().toLowerCase();

        } while (continuar.equals("sim"));

        System.out.println("\nObrigado por usar o programa de cálculo do IMC!");

        scanner.close();
    }
}