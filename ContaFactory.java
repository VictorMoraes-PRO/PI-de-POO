// factory/ContaFactory.java
public abstract class ContaFactory {
    public abstract Conta criarConta(int numeroConta);
}

// factory/ContaCorrenteFactory.java
public class ContaCorrenteFactory extends ContaFactory {
    private double limite;

    public ContaCorrenteFactory(double limite) {
        this.limite = limite;
    }

    @Override
    public Conta criarConta(int numeroConta) {
        return new ContaCorrente(numeroConta, limite);
    }
}

// factory/ContaPoupancaFactory.java
public class ContaPoupancaFactory extends ContaFactory {
    private double rendimento;

    public ContaPoupancaFactory(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public Conta criarConta(int numeroConta) {
        return new ContaPoupanca(numeroConta, rendimento);
    }
}
