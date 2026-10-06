public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente novoCliente) {
        super(novoCliente);
    }

    public void exibirExtrato() {
        System.out.printf("=== Conta Poupanca ===");
        super.exibirInfo();
    }
}
