public class Calculadora {
    // Método para adicionar dois números
    public double adicionar(double num1, double num2) {
        return num1 + num2;
    }

    // Método para subtrair dois números
    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    // Método para multiplicar dois números
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método para dividir dois números
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Exemplo de uso
        double resultadoAdicao = calculadora.adicionar(10, 5);
        System.out.println("Resultado da adição: " + resultadoAdicao);

        double resultadoSubtracao = calculadora.subtrair(10, 5);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);

        double resultadoMultiplicacao = calculadora.multiplicar(10, 5);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);

        double resultadoDivisao = calculadora.dividir(10, 5);
        System.out.println("Resultado da divisão: " + resultadoDivisao);
    }
}
