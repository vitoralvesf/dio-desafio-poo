public class Main {
    public static void main(String[] args) {
        Conta  cc = new ContaCorrente();
        Conta contaPoupança = new ContaPoupança();


        cc.depositar(100);
        cc.transferir(100, contaPoupança);

        cc.imprimirExtrato();
        contaPoupança.imprimirExtrato();



    }
}