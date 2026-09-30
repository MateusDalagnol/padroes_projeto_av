public class FabricaCreditoConsiginado implements IFabricaEmprestimo{

    public Icredito criar(){return new CreditoConsiginado();}
}
