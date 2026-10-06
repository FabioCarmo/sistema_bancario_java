public abstract class Conta implements IConta {

    private static int AGENCIA = 1001;
    private int agencia;

    protected double saldo;
    protected int conta;
    protected Cliente cliente;

    public Conta(Cliente novoCliente) {
        this.agencia = Conta.AGENCIA;
        // Gera um número aleatório de 5 dígitos (10000 a 99999)
        this.conta = (int) (Math.random() * 90000) + 10000;
        cliente = novoCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void exibirInfo() {
        System.out.printf("\nTitular: %s\n", this.cliente.getNome());
        System.out.printf("Agencia: %d\n", this.AGENCIA);
        System.out.printf("Conta: %d\n", this.getConta());
        System.out.printf("Saldo: %.2f\n", this.getSaldo());
    }

}
