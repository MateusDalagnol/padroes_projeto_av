public class FabricaCreditoPessoal implements IFabricaEmprestimo{

    public Icredito criar(){return new CreditoPessoal();}
}
