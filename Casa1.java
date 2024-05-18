/*
 * Autor: Anderson Marinho
 * Data: 11 de maio de 2024
 */

 public class Casa1 {
    private String endereco; // Endereço da casa
    private int numeroDeQuartos; // Número de quartos da casa
    private int numeroDeBanheiros; // Número de banheiros da casa
    private boolean luzesAcesas; // Indica se as luzes estão acesas ou não

    // Construtor da classe Casa
    public Casa1(String endereco, int numeroDeQuartos, int numeroDeBanheiros) {
        this.endereco = endereco;
        this.numeroDeQuartos = numeroDeQuartos;
        this.numeroDeBanheiros = numeroDeBanheiros;
        this.luzesAcesas = false; // Por padrão, as luzes estão apagadas
    }

    // Método para exibir as informações da casa
    public void exibirInformacoes() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de Quartos: " + numeroDeQuartos);
        System.out.println("Número de Banheiros: " + numeroDeBanheiros);
        System.out.println("Luzes Acesas: " + (luzesAcesas ? "Sim" : "Não"));
        System.out.println("-------------------------------\n");
    }

    // Método para ligar as luzes
    public void ligarLuzes() {
        luzesAcesas = true;
        System.out.println("Luzes ligadas.");
        System.out.println("-------------------------------\n");
    }

    // Método para desligar as luzes
    public void desligarLuzes() {
        luzesAcesas = false;
        System.out.println("Luzes desligadas.");
        System.out.println("-------------------------------\n");
    }

    // Método principal para testar a classe Casa
    public static void main(String[] args) {
        Casa1 minhaCasa = new Casa1("123 Rua Alegre", 3, 2);
        minhaCasa.exibirInformacoes();

        // Ligar as luzes
        minhaCasa.ligarLuzes();
        minhaCasa.exibirInformacoes();

        // Desligar as luzes
        minhaCasa.desligarLuzes();
        minhaCasa.exibirInformacoes();
    }
}
