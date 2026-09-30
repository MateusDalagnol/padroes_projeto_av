public class CreditoConsiginado implements Icredito{
    
    public void imprimir(Double valor, String nomeCliente){
        System.out.println("Modalidade Consiginado | Nome: " + nomeCliente + " | Valor juros do primeiro mês: " + valor + "| Documentos exigidos:\r\n" + //
                        "contracheque ou extrato de benefício");   
    }

    public Double calcular(Double valor){
        return valor * 0.018;
    }

    public void concesao(Double valor,String nome){
        this.imprimir(this.calcular(valor), nome);
    }
}
