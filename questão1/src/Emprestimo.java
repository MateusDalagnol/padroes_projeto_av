public class Emprestimo {

    IFabricaEmprestimo iFabricaEmprestimo;

    public Emprestimo(IFabricaEmprestimo iFabricaEmprestimo){
        this.iFabricaEmprestimo = iFabricaEmprestimo;
    }

    public void gerarEmprestimo(double valor, String nomeCliente){
        Icredito icredito = iFabricaEmprestimo.criar();
        icredito.concesao(valor, nomeCliente);
    }
}
