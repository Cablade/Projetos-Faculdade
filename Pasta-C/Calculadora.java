import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int selecao_de_operacao = 0;
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        leer.close();

        do {

            System.out.println("/n");
            System.out.println("Selecione um número de operação: ");
            System.out.println("1.-SOMA");
            System.out.println("2.-SUBTRAIR");
            System.out.println("3.-MULTIPLICAR");
            System.out.println("4.-DIVIDIR");
            System.out.println("5.-SAIR");
            selecao_de_operacao = leer.nextInt();

            if (selecao_de_operacao != 5) {
                System.out.print("Digite o primeiro número: ");
                numero1 = leer.nextInt();
                System.out.print("Digite o segundo número: ");
                numero2 = leer.nextInt();
            }

            switch (selecao_de_operacao) {
                case 1:
                    selecao_de_operacao = 1;
                    resultado = numero1 + numero2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    selecao_de_operacao = 2;
                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    selecao_de_operacao = 3;
                    resultado = numero1 * numero2;
                    System.out.println("Resutado: " + resultado);
                    break;

                case 4:
                    selecao_de_operacao = 4;
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                    break;

            }

        } while (selecao_de_operacao != 5);
        System.out.println("Você saiu.");

    }

    @Override
    public String toString() {
        return "Calculadora []";
    }
}
