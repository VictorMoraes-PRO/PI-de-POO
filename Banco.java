//Banco
public class Banco {
    private static Banco instancia;
    private List<Conta> contas;

    private Banco() {
        contas = new ArrayList<>();
    }

    public static Banco getInstancia() {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
