import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                ControleProduto cp = new ControleProduto();


        System.out.println("========== Exercício nota 2 ==========");
        System.out.println("\n-> bem-vindo a aba de cadastro, vamo iniciar o cadastro do seu produto: ");

        System.out.println(" - Digite o código do produto: ");
        cp.setCodigo(sc.nextInt());
        sc.nextLine();

        System.out.println(" - Digite o nome do produto: ");
        cp.setNome(sc.nextLine());

        System.out.println(" - Digite o tamanho do produto (em CM): ");
        cp.setTamanho(sc.nextDouble());
        sc.nextLine();

        System.out.println(" - Digite o peso do produto (em KG): ");
        cp.setPeso(sc.nextDouble());
        sc.nextLine();

        System.out.println(" - Digite a cor do produto: ");
        cp.setCor(sc.nextLine());

        System.out.println(" - Digite o valor do produto: ");
        cp.setValor(sc.nextDouble());
        sc.nextLine();

        System.out.println(" - Digite a quantiade do produto em estoque: ");
        cp.setQuantidadeEstoque(sc.nextInt());
        sc.nextLine();

        System.out.println("código: "+cp.getCodigo()+ "\nnome: "+ cp.getNome()+ "\ntamanho: "+cp.getTamanho()+ "cm\npeso: "+cp.getPeso()+ "kg\ncor: "+cp.getCor()+ "\nvalor: "+ cp.getValor()+ "\nestoque: "+ cp.getQuantidadeEstoque());
        System.out.println("\n\n-> Produto cadastrado com sucesso!!!\n\nVamos simular uma venda: ");
        System.out.println("\nDigite quantas unidades deseja comprar: ");
        cp.setQuantidadeCompra(sc.nextInt());
        sc.nextLine();

        System.out.println("Valor total = "+ cp.definirValor(cp.getValor())+ "\nEscolha a forma de pagamento:\n[1] Pix\n[2] Dinheiro\n[3] Transferência\n[4] Débito\n[5] Crédito\n");
        cp.setFormaPagamento(sc.nextInt());
        sc.nextLine();


        int i = 0;
        switch(cp.getOpcaoPagamento()){
            case 1:
                System.out.println("No pix você recebe um desconto de 5%.\nPreço final = ");
                break;

            case 2:
                System.out.println("Em dinheiro você recebe um desconto de 5%.\nPreço final = ");
                break;

            case 3:
                System.out.println("Por transferência você recebe um desconto de 5%.\nPreço final = ");
                break;

            case 4:
                System.out.println("No débito você recebe um desconto de 5%.\nPreço final = ");
                break;

            case 5:
                System.out.println("\nValor dividido em 3x Parcelas de = ");
                break;

        }



        System.out.println("Estoque atualizado = "+ cp.atualizarEstoque(cp.getQuantidadeEstoque()));













    }
}