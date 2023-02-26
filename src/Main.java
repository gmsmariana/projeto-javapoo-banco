public class Main {
    public static void main(String[] args) {

        Cliente mariana = new Cliente();
        mariana.setNome("mariana");

        Conta cc = new ContaCorrente(mariana);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(mariana);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
