
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente novoCliente) {
        super(novoCliente);
    }

    public void exibirExtrato() {
        System.out.printf("=== Conta Corrente ===");
        super.exibirInfo();
    }
}
