
void main() {
    Cliente fabio = new Cliente();
    fabio.setNome("Fabio");
    ContaCorrente cc = new ContaCorrente(fabio);
    ContaPoupanca cp = new ContaPoupanca(fabio);

    cc.depositar(100);
    cc.transferir(50, cp);

    cc.exibirExtrato();
    cp.exibirExtrato();
}