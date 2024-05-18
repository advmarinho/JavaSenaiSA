/*
 * Autor: Anderson Marinho
 * Data: 11 de maio de 2024
 */

public class Profissao {
    // Variáveis com tipos primitivos
    private String nome;
    private int anosExperiencia;
    private double salario;
    private String descricao;

    // Método construtor
    public Profissao(String nome, int anosExperiencia, double salario, String descricao) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
        this.salario = salario;
        this.descricao = descricao;
    }

    // Método para exibir as informações da profissão
    public void exibirInformacoes() {
        System.out.println("Profissão: " + nome);
        System.out.println("Anos de Experiência: " + anosExperiencia);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.println("Descrição: " + descricao);
    }

    // Método principal para criar um objeto de profissão e exibir as informações
    public static void main(String[] args) {
        // Criando um objeto de profissão
        Profissao profissao = new Profissao("Programador", 5, 5000.00, "Desenvolvedor de software");

        // Exibindo as informações da profissão
        profissao.exibirInformacoes();
    }
}
