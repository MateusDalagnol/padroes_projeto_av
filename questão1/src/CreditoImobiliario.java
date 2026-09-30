public class CreditoImobiliario implements Icredito{
    
    public void imprimir(Double valor, String nomeCliente){
        System.out.println("Modalidade Imobiliario | Nome: " + nomeCliente + " | Valor juros do primeiro mês: " + valor + "| Documentos exigidos:\r\n" + //
                        "matrícula do imóvel e comprovante de renda");   
    }

    public Double calcular(Double valor){
        return valor * 0.008;
    }

    public void concesao(Double valor,String nome){
        this.imprimir(this.calcular(valor), nome);
    }
}
