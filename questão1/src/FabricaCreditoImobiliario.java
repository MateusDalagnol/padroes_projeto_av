public class FabricaCreditoImobiliario implements IFabricaEmprestimo{

    public Icredito criar(){return new CreditoImobiliario();}
}
