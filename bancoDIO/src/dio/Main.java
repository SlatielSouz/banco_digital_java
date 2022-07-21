package dio;

public class Main {

    public static void main(String[] args){

        Cliente salatiel = new Cliente();
        salatiel.setNome("Salatiel");

        Conta cc = new ContaCorrente(salatiel);
        cc.depositar(100);


        Conta poupança = new ContaPoupanca(salatiel);

        cc.transferir(100, poupança);

        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    }

}
