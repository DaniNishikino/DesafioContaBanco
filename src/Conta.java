public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1 ;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double deposito) {
        saldo += deposito;
    }

    @Override
    public void saque(double saque) {
        if (saque > saldo){
            System.out.println("Saldo insuficiente para saque");
        }else {
            saldo -= saque;
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > saldo){
            System.out.println("Saldo insuficiente para transferencia");
        }else {
            this.saque(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public void imprimirInformacaoConta() {
        System.out.println();
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);

    }
}
