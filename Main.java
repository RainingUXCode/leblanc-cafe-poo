import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        Produto expresso = new Produto(1, "Café Expresso", 5.00);
        Produto cappuccino = new Produto(2, "Cappuccino", 8.50);
        Produto paoDeQueijo = new Produto(3, "Pão de Queijo", 4.00);

        System.out.println("=========================================");
        System.out.println("        MENU CAFETERIA LEBLANC");
        System.out.println("=========================================");
        System.out.println("[1] " + expresso.getNome() + " - R$ " + expresso.getPreco());
        System.out.println("[2] " + cappuccino.getNome() + " - R$ " + cappuccino.getPreco());
        System.out.println("[3] " + paoDeQueijo.getNome() + " - R$ " + paoDeQueijo.getPreco());
        System.out.println("=========================================");

        System.out.print("\nDigite o nome do cliente: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o código do produto: ");
        int codProduto = entrada.nextInt();
        
        System.out.print("Digite a quantidade: ");
        int quantidade = entrada.nextInt();

        Produto produtoEscolhido = null;

        switch (codProduto) {
            case 1:
                produtoEscolhido = expresso;
                break;
            case 2:
                produtoEscolhido = cappuccino;
                break;
            case 3:
                produtoEscolhido = paoDeQueijo;
                break;
            default:
                System.out.println("Erro: Produto inexistente!");
                entrada.close();
                return;
        }


        Pedido pedidoDoCliente = new Pedido(nome, produtoEscolhido, quantidade);
        pedidoDoCliente.imprimirRecibo();
        entrada.close();
    }
}