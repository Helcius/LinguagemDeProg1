public class ContaLogin {
    private String nome;
    private int anoNascimento;
    private String email;
    private String senha;

    public ContaLogin() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome, int x) {
        if (x == 10) {
            this.nome = nome;
        } else {
            System.out.println("Código de alteração errado!");
        }

    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
