// Автомат с квасом
public class KvassVendingMachine extends VendingMachine{
    public KvassVendingMachine(String owner) {
        super(owner);
    }
    @Override
    public Drink Create() {
        return new Kvass();
    }
}
