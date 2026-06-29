public class Pedido {
    private static int contadorRecibos = 1;
    
    private int numeroRecibo;
    private String nomeCliente;
    private Produto produto;
    private int quantidade;
    private double desconto;

    public Pedido(String nomeCliente, Produto produto, int quantidade) {
        this.numeroRecibo = contadorRecibos++;
        this.nomeCliente = nomeCliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.desconto = 0.0;
    }

    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public double calcularTotal() {
        return calcularSubtotal() - desconto;
    }

    public void imprimirRecibo() {
        System.out.println("\n===== RECIBO =====");
        System.out.println("Recibo nº: " + numeroRecibo);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Valor unitário: R$ %.2f\n", produto.getPreco());
        System.out.printf("Subtotal: R$ %.2f\n", calcularSubtotal());
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Total: R$ %.2f\n", calcularTotal());
        System.out.println("==================");
    }
}