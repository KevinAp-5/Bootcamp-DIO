package entities;

public non-sealed class Gerente extends Funcionario {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void gerarRelatorioFinanceiro(int quantidadeVendas) {
        System.out.println("Foram geradas " + quantidadeVendas + " vendas");
    }

    public void consultarVendas(Vendedor vendedor) {
        System.out.printf("O vendedor %s gerou um total de %d vendas", vendedor.getNome(),
                vendedor.getQuantidadeVendas());
    }


    @Override
    public void alterarEmail(String email) {
        if (!this.administrador) {
            System.out.println("O gerente precisa de permissão de administrador para poder mudar o email");
            return;
        }
        this.email = email;
        System.out.println("O email foi alterado para: " + this.email);
    }

}
