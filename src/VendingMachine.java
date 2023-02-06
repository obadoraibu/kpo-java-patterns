// Абстрактный автомат с напитком
public abstract class VendingMachine {
    String owner;
    public VendingMachine() {
        owner = null;
    }
    public void GetOwner() {
        System.out.println(owner);
    }
    public VendingMachine(String owner) {
        this.owner = owner;
    }
    abstract public Drink Create(); // Фабричный метод
}
