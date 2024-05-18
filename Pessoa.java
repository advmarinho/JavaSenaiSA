import java.util.Scanner;

public class Pessoa {
  // Variáveis de instância (estado dos futuros objetos)
  String nome;
  int idade;

  // Construtor (comportamento ao criar um novo objeto)
  public Pessoa(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
  }

  // Método (comportamento) para exibir informações da pessoa
  public void exibirInformacoes() {
      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);
  }

  // Método principal para testar a classe
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o nome da pessoa: ");
      String nome = scanner.nextLine();

      System.out.print("Digite a idade da pessoa: ");
      int idade = scanner.nextInt();

      Pessoa pessoa = new Pessoa(nome, idade);
      pessoa.exibirInformacoes();
//Pessoa pessoa = new Pessoa("João", 30);
//pessoa.exibirInformacoes();
      

      scanner.close();
  }
}

