public class ContaCorrente {

    private int saldo;

    private String nomeTitular;

    public ContaCorrente(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getSaldo() {
        return saldo;
    }

    private void setSaldo(int saldo, int senha) {

        if (senha == 123) {
            this.saldo = saldo;
        } else {
            System.out.println("senha incorreta");
        }

    }

    public void sacar(int valor, int senha) {

        if (senha != 123) {
            System.out.println("senha incorreta");
        } else if(this.getSaldo() >= valor) {
            this.setSaldo((getSaldo()-valor), senha);
            System.out.println("Sacou R$" + valor);
        } else {
            System.out.println("Saldo insuficiente");
        }



    }
    public void depositar(int valor, int senha) {

        this.setSaldo(this.getSaldo()+valor, senha);

    }
}
