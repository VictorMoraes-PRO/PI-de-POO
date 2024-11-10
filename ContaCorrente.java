//ContaCorrente

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numeroConta, double limite) {
        super(numeroConta);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() + limite >= valor) {
            depositar(-valor);
            return true;
        }
        return false;
    }
}

// model/ContaPoupanca.java
public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(int numeroConta, double rendimento) {
        super(numeroConta);
        this.rendimento = rendimento;
    }

    public void aplicarRendimento() {
        depositar(getSaldo() * rendimento);
    }
}
