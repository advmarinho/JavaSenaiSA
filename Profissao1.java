public class Profissao1 {
    // Variáveis com tipos primitivos
    private String nome;
    private int anosExperiencia;
    private double salario;
    private String descricao;
    // Variável estática para contar o número de objetos criados
    private static int contadorObjetos = 0;

    // Método construtor
    public Profissao1(String nome, int anosExperiencia, double salario, String descricao) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
        this.salario = salario;
        this.descricao = descricao;
        // Incrementa o contador de objetos
        contadorObjetos++;
    }

    // Método para exibir as informações da profissão
    public void exibirInformacoes() {
        System.out.println("Profissão: " + nome);
        System.out.println("Anos de Experiência: " + anosExperiencia);
        System.out.printf("Salário: R$ %.2f\n", salario);
        System.out.println("Descrição: " + descricao);
    }

    // Método para obter a quantidade de objetos criados
    public static int getQuantidadeObjetos() {
        return contadorObjetos;
    }

    // Método principal para criar objetos de profissões e exibir as informações
    public static void main(String[] args) {
        // Criando alguns objetos de profissão
        Profissao1 profissao1 = new Profissao1("Programador", 5, 5000.00, "Desenvolvedor de software");
        Profissao1 profissao2 = new Profissao1("Designer", 3, 4000.00, "Designer gráfico");

        // Exibindo as informações das profissões
        profissao1.exibirInformacoes();
        profissao2.exibirInformacoes();

        // Exibindo a quantidade de objetos criados
        System.out.println("Quantidade de objetos de Profissao criados: " + Profissao1.getQuantidadeObjetos());
    }
}
