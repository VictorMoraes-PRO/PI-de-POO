//BancoFacade
public class BancoFacade {
    private Banco banco;

    public BancoFacade() {
        this.banco = Banco.getInstancia();
    }

    public void criarContaCorrente(int numeroConta, double limite) {
        ContaFactory factory = new ContaCorrenteFactory(limite);
        banco.adicionarConta(factory.criarConta(numeroConta));
    }

    public void criarContaPoupanca(int numeroConta, double rendimento) {
        ContaFactory factory = new ContaPoupancaFactory(rendimento);
        banco.adicionarConta(factory.criarConta(numeroConta));
    }

    public boolean sacar(int numeroConta, double valor) {
        Conta conta = banco.buscarConta(numeroConta);
        return conta != null && conta.sacar(valor);
    }

    public void depositar(int numeroConta, double valor) {
        Conta conta = banco.buscarConta(numeroConta);
        if (conta != null) {
            conta.depositar(valor);
        }
    }
}
