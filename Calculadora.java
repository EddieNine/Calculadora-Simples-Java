import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valorUm;
        Double valorDois;
        String operacao;
        boolean continuar;

        do {
            System.out.println("Digite o primeiro valor: ");
            valorUm = scanner.nextDouble();

            System.out.println("Digite a operacao ( +, -, /, *");
            operacao = scanner.next();

            System.out.println("Digite o segundo valor: ");
            valorDois = scanner.nextDouble();

            System.out.println("Resultado: " + realziarCalculo(valorUm, valorDois, operacao));

            continuar = verificarNovaOperacao();
        } while (continuar);


    }

    public static boolean verificarNovaOperacao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operacao ? (S ou N): ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }

    public static Double realziarCalculo(Double valorUm, Double valorDois, String operacao) {
        Double respostaCalculo = 0.0;

        switch (operacao) {
            case "+":
                respostaCalculo = valorUm + valorDois;
                break;
            case "-":
                respostaCalculo = valorUm - valorDois;
                break;
            case "*":
                respostaCalculo = valorUm * valorDois;
                break;
            case "/":
                respostaCalculo = valorUm / valorDois;
                break;

            default:
                System.out.println("Operacao e invalida ");
        }

        return respostaCalculo;
    }
}
