/*
 * Autor: Anderson Marinho
 * Data: 11 de maio de 2024
 */

 public class Casa {
 /*
 * Variaveis de instancia
 * estado dos futuros objetos
 */
    private String endereco; // Endereço da casa
    private int numeroDeQuartos; // Número de quartos da casa
    private int numeroDeBanheiros; // Número de banheiros da casa
    //private boolean luzesAcesas; // Indica se as luzes estão acesas ou não

    // Construtor da classe Casa
    public Casa(String endereco, int numeroDeQuartos, int numeroDeBanheiros) {
        this.endereco = endereco;
        this.numeroDeQuartos = numeroDeQuartos;
        this.numeroDeBanheiros = numeroDeBanheiros;
        //this.luzesAcesas = luzesAcesas;
    }

    // Método para exibir as informações da casa
    public void exibirInformacoes() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de Quartos: " + numeroDeQuartos);
        System.out.println("Número de Banheiros: " + numeroDeBanheiros);
    }

    // Método principal para testar a classe Casa
    public static void main(String[] args) {
        Casa minhaCasa = new Casa("123 Rua Alegre", 3, 2);
        minhaCasa.exibirInformacoes();
    }
}
