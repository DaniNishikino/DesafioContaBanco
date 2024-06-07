public interface IConta {
    void depositar(double deposito);
    void saque(double saque);
    void transferir(double valor, Conta contaDestino);
    void imprimirInformacaoConta();
}
