import java.util.Scanner;

public class calculadora { 

    public int soma(int a, int b) {
        return a + b;
    }
    public int subtracao(int a, int b) {
        return a - b;
    }
    public int multiplicacao(int a, int b) {
        return a * b;
    }
    public int divisao(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Primeiro numero: ");
        int a = scanner.nextInt();
        
        scanner.nextLine(); 

        System.out.print("Digite sua operacao (+, -, *, /): ");
        String operacao = scanner.nextLine();

        System.out.print("Segundo numero: ");
        int b = scanner.nextInt();

        System.out.print("Resultado: ");
        if (operacao.equals("+")) {
            System.out.println(calc.soma(a, b));
        } else if (operacao.equals("-")) {
            System.out.println(calc.subtracao(a, b));
        } else if (operacao.equals("*")) {
            System.out.println(calc.multiplicacao(a, b));
        } else if (operacao.equals("/")) {
            System.out.println(calc.divisao(a, b));
        } else {
            System.out.println("Operação inválida!");
        }

        scanner.close();
    }
}
