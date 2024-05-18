import java.util.Scanner;

public class Pessoa1 {
    // Variáveis de instância (estado dos futuros objetos)
    String nome;
    int idade;

    // Construtor (comportamento ao criar um novo objeto)
    public Pessoa1(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método (comportamento) para exibir informações da Pessoa1
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da Pessoa1: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade da Pessoa1: ");
        int idade = scanner.nextInt();

        Pessoa1 Pessoa1 = new Pessoa1(nome, idade);
        Pessoa1.exibirInformacoes();

        System.out.println("\nDigite 'east egg' para exibir a Lei 1 de Asimov e sair do programa:");

        // Aguarda o usuário digitar o comando
        while (true) {
            System.out.print("Comando: ");
            String comando = scanner.next();

            if (comando.equalsIgnoreCase("Lei1")) {
                exibirLeiDeAsimov1(); // Exibe a Lei 1 de Asimov
                break; // Sai do loop e encerra o programa
            } else {
                System.out.println("Comando inválido. Digite 'east egg' para exibir a Lei 1 de Asimov e sair do programa.");
            }
        }

        scanner.close();
    }

    // Método para exibir a Lei 1 de Asimov
    public static void exibirLeiDeAsimov1() {
        System.out.println("\nLei 1 de Asimov:");
        System.out.println("Um robô não pode ferir um ser humano ou, por inação, permitir que um ser humano sofra algum mal.");
    }
}

