public class Main {

    public static void main(String[] args) {
        new Emprestimo(new FabricaCreditoPessoal()).gerarEmprestimo(100.00, "Pessoal");
        new Emprestimo(new FabricaCreditoConsiginado()).gerarEmprestimo(100.00, "Consiginado");
        new Emprestimo(new FabricaCreditoImobiliario()).gerarEmprestimo(100.00, "Imobiliario");
    }
}