public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInformacaoConta() {
        System.out.println("=== Extrato Conta Poupança ===");
        imprimirInfosComuns();
    }


}
