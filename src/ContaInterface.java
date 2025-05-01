public interface ContaInterface {
    double depositar(double valor);
    double sacar(double valor);
    double transferir(double valor, Conta contaDestino);
    String imprimirExtrato();

}
