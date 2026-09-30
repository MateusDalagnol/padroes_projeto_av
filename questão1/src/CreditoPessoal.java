public class CreditoPessoal implements Icredito{
    
    public void imprimir(Double valor, String nomeCliente){
        System.out.println("Modalidade Pessoal | Nome: " + nomeCliente + " | Valor juros do primeiro mês: " + valor + "| Documentos exigidos:\r\n" + //
                        "documento de identidade e comprovante de renda");   
    }

    public Double calcular(Double valor){
        return valor * 0.035;
    }

    public void concesao(Double valor,String nome){
        this.imprimir(this.calcular(valor), nome);
    }
}
