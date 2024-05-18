import java.util.Scanner;

/*
 * Autor: Anderson Marinho
 * Data: 11 de maio de 2024
 */

public class Carro {

/*
 * Variaveis de instancia
 * estado dos futuros objetos
 */
 
    String modelo;
    String cor;
    int ano;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    
    public void exibirInformacoes() {
        System.out.println("\n----------------------------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("----------------------------------\n");
    }

    public static void main(String[] args) {
        System.out.print("Deseja exibir as informações do carro? (S/N): ");
        Scanner scanner = new Scanner(System.in);
        char continuar = Character.toLowerCase(scanner.next().charAt(0));

        while (continuar == 's') {
            Carro primeiroCarro = new Carro("Fusca", "Azul", 1970);
            Carro segundoCarro = new Carro("Gol", "Preto", 2010);
            Carro terceiroCarro = new Carro("Celta", "Branco", 2015);

            primeiroCarro.exibirInformacoes();
            segundoCarro.exibirInformacoes();
            terceiroCarro.exibirInformacoes();

            System.out.print("Deseja exibir as informações novamente? (S/N): ");
            continuar = scanner.next().charAt(0);
        }

        scanner.close();
    }

}

