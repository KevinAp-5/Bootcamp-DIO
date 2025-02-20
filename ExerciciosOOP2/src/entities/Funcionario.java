package entities;

public sealed class Funcionario permits Caixa, Gerente, Vendedor {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean administrador;

    public Funcionario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public void realizarLogin() {
        System.out.printf("Login feito para o email: %s, senha: %s", email, senha);
    }

    public void realizarLogoff() {
        System.out.println("Foi feito o logOff do " + nome);
    }

    public void alterarEmail(String email) {
        this.email = email;
        System.out.println("O email foi alterado para: " + email);
    }

    public void alterarSenha(String senha) {
        this.senha = senha;
        System.out.println("A senha foi alterada para: " + senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
