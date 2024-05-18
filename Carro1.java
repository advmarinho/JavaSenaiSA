import java.util.Scanner;

public class Carro1 {

    String modelo;
    String cor;
    int ano;

    public Carro1(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {
        System.out.print("Deseja exibir as informações do carro? (S/N): ");
        Scanner scanner = new Scanner(System.in);
        char continuar = Character.toLowerCase(scanner.next().charAt(0));

        while (continuar == 's') {
            System.out.print("Digite o modelo do primeiro carro: ");
            String modeloPrimeiroCarro = scanner.nextLine();
            System.out.print("Digite a cor do primeiro carro: ");
            String corPrimeiroCarro = scanner.nextLine();
            System.out.print("Digite o ano do primeiro carro: ");
            int anoPrimeiroCarro = scanner.nextInt();
            Carro1 primeiroCarro = new Carro1(modeloPrimeiroCarro, corPrimeiroCarro, anoPrimeiroCarro);

            scanner.nextLine();
            primeiroCarro.exibirInformacoes();
         
            System.out.print("Deseja exibir as informações novamente? (S/N): ");
            continuar = Character.toLowerCase(scanner.next().charAt(0));
        }

        scanner.close();
    }

}

