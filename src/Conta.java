public class Conta implements ContaInterface {

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;


    public Conta() {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

    //Métodos sobreescrito da interface conta interface
    @Override
    public double depositar(double valor) {
        saldo += valor;
    }

    @Override
    public double sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public double transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    protected String imprimirExtrato(){
        System.out.println("===Extrato===");
        System.out.println(toString().formatted("Agência:  %d", agencia ));
        System.out.println(toString().formatted("Número:  %d", numero ));
        System.out.println(toString().formatted("Saldo:  %.2f", saldo ));
    }

    //MÉTODOS GETTERS POIS NAO QUEREMOS OUTRAS CLASSES MODIFICANDO OS ATRIBUTOS
    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }
}
