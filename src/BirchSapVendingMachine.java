// Автомат с березовым соком
public class BirchSapVendingMachine extends VendingMachine{
    public BirchSapVendingMachine(String owner) {
        super(owner);
    }

    @Override
    public Drink Create() {
        return new BirchSap();
    }
}
