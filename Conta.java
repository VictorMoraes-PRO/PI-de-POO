//Conta
public abstract class Conta {
    private int numeroConta;
    private double saldo;

    public Conta(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
